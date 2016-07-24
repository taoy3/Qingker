package com.game.taoy3.qingker.adapter;

import android.app.Activity;
import android.graphics.Bitmap;
import android.support.v4.view.PagerAdapter;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.game.taoy3.qingker.R;
import com.game.taoy3.qingker.bean.CollectionsBean;
import com.game.taoy3.qingker.bean.RecommsBean;
import com.game.taoy3.qingker.widght.AutoScrollViewPager;
import com.game.taoy3.qingker.widght.CirImageView;
import com.nostra13.universalimageloader.core.DisplayImageOptions;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by taoy3 on 16/4/9.
 */
public class SelectedRecAdapter extends BaseRecyclerAdapter<RecommsBean>{
    private DisplayImageOptions options;
    private int COLLECTION = 1;
    private int RECOMM = 2;
    public SelectedRecAdapter(List<RecommsBean> list,Activity activity) {
        super(list,activity);
        options = new DisplayImageOptions.Builder().cacheInMemory(true).cacheOnDisk(true)
                                        .bitmapConfig(Bitmap.Config.RGB_565).build();
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        RecyclerView.ViewHolder holder;
        if(viewType == COLLECTION){
            holder =  new CollectionsHolder(inflater.inflate(R.layout.adapter_selected_collection,parent,false));
        }else{
            holder= new RecommHolder(inflater.inflate(R.layout.adapter_selected_recomm,parent,false));
        }
        return holder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        if(holder instanceof CollectionsHolder){
            ((CollectionsHolder)holder).viewPager.setAdapter(
                    new ScrollPagerAdapter(list.get(position).getCollections()));
            ((CollectionsHolder)holder).viewPager.startAutoScroll();
        }else if(holder instanceof RecommHolder){
            RecommHolder recommHolder =  ((RecommHolder)holder);
            loadImage(list.get(position).getReferrer().getPhoto_url(),recommHolder.userIconTv);
            recommHolder.userNameTv.setText(list.get(position).getReferrer().getUsername());
            recommHolder.userMsgTv.setText(list.get(position).getReferrer().getIntro());
            loadImage(list.get(position).getBg_pic()[0],recommHolder.bgSelIv);
            recommHolder.titleTv.setText(list.get(position).getTitle());
            recommHolder.subTitleTv.setText(list.get(position).getSub_title());
            recommHolder.shortDescTv.setText(list.get(position).getShort_desc());
            recommHolder.addressTv.setText(list.get(position).getAddress());
            recommHolder.lickCountTv.setText(String.valueOf(list.get(position).getLike_count()));
            recommHolder.bgSelIv.setBackgroundColor(list.get(position).getBg_color());
        }
    }

    @Override
    public int getItemViewType(int position) {
        int type = COLLECTION;
        if("Recomm".equals(list.get(position).getType())){
            type =  RECOMM;
        }
        return type;
    }

    public class RecommHolder extends RecyclerView.ViewHolder {
        private CirImageView userIconTv;
        private TextView userNameTv;
        private TextView userMsgTv;
        private ImageView bgSelIv;
        private TextView titleTv;
        private TextView subTitleTv;
        private TextView shortDescTv;
        private TextView addressTv;
        private TextView lickCountTv;
        public RecommHolder(View view) {
        super(view);
            userIconTv = (CirImageView) view.findViewById(R.id.user_icon);
            userNameTv = (TextView) view.findViewById(R.id.user_name);
            userMsgTv = (TextView) view.findViewById(R.id.user_msg);
            bgSelIv = (ImageView) view.findViewById(R.id.bg_image);
            titleTv = (TextView) view.findViewById(R.id.title);
            subTitleTv = (TextView) view.findViewById(R.id.sub_title);
            shortDescTv = (TextView) view.findViewById(R.id.short_desc);
            addressTv = (TextView) view.findViewById(R.id.address);
            lickCountTv = (TextView) view.findViewById(R.id.like_count);
    }
}
    public class CollectionsHolder extends RecyclerView.ViewHolder {
        private AutoScrollViewPager viewPager;
        public CollectionsHolder(View view) {
            super(view);
            if(view instanceof AutoScrollViewPager){
                viewPager = (AutoScrollViewPager) view;
            }
        }
    }
    private class ScrollPagerAdapter extends PagerAdapter{
        private List<CollectionsBean> been;
        private List<View> views = new ArrayList<>();
        public ScrollPagerAdapter(List<CollectionsBean> been) {
            this.been = been;
        }

        @Override
        public int getCount() {
            return been.size();
        }

        @Override
        public boolean isViewFromObject(View view, Object object) {
            return view==object;
        }

        @Override
        public Object instantiateItem(ViewGroup container, int position) {
            View view = inflater.inflate(R.layout.adapter_sel_pager,container,false);
            ImageView imageView = (ImageView) view.findViewById(R.id.imageView);
            imageView.setBackgroundColor(list.get(position).getBg_color());
            TextView textView = (TextView) view.findViewById(R.id.title);
            loadImage(been.get(position).getBg_pic().get(0),imageView);
            textView.setText(been.get(position).getTitle());
            container.addView(view);
            views.add(view);
            return view;
        }

        @Override
        public void destroyItem(ViewGroup container, int position, Object object) {
            container.removeView(views.get(position));
        }
    }
}
