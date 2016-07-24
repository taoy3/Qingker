package com.game.taoy3.qingker.adapter;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.game.taoy3.qingker.R;
import com.game.taoy3.qingker.bean.RecommsBean;

import java.util.List;

/**
 * Created by taoy3 on 16/4/15.
 */
public class MyCollectAdapter extends BaseListAdapter<RecommsBean>{
    public MyCollectAdapter(List<RecommsBean> list, Activity activity) {
        super(list, activity);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        RecommHolder holder;
        if(convertView == null){
            convertView =inflater.inflate(R.layout.adapter_selected_collection,parent,false);
            holder =  new RecommHolder(convertView);
            convertView.setTag(holder);
        }
        RecommHolder recommHolder = (RecommHolder) convertView.getTag();
        loadImage(list.get(position).getBg_pic()[0],recommHolder.bgSelIv);
        recommHolder.titleTv.setText(list.get(position).getTitle());
        recommHolder.subTitleTv.setText(list.get(position).getSub_title());
        recommHolder.addressTv.setText(list.get(position).getAddress());
        recommHolder.lickCountTv.setText(String.valueOf(list.get(position).getLike_count()));
        recommHolder.bgSelIv.setBackgroundColor(list.get(position).getBg_color());
        return convertView;
    }
    public class RecommHolder{
        private ImageView bgSelIv;
        private TextView titleTv;
        private TextView subTitleTv;
        private TextView addressTv;
        private TextView lickCountTv;
        public RecommHolder(View view) {
            bgSelIv = (ImageView) view.findViewById(R.id.bg_image);
            titleTv = (TextView) view.findViewById(R.id.title);
            subTitleTv = (TextView) view.findViewById(R.id.sub_title);
            addressTv = (TextView) view.findViewById(R.id.address);
            lickCountTv = (TextView) view.findViewById(R.id.like_count);
        }
    }
}
