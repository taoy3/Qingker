package com.game.taoy3.qingker.adapter;

import android.graphics.Bitmap;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.game.taoy3.qingker.R;
import com.game.taoy3.qingker.bean.Discover;
import com.nostra13.universalimageloader.core.DisplayImageOptions;
import com.nostra13.universalimageloader.core.ImageLoader;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by taoy3 on 16/4/11.
 */
public class ArticlesPagerAdapter extends PagerAdapter {
    private final LayoutInflater inflater;
    private final DisplayImageOptions options;
    private List<Discover.ArticlesBean> list;
    private List<View> views = new ArrayList<>();
    public ArticlesPagerAdapter(FragmentActivity activity, List<Discover.ArticlesBean> list) {
        this.inflater = LayoutInflater.from(activity);
        this.list = list;
        options = new DisplayImageOptions.Builder().cacheInMemory(true).cacheOnDisk(true)
                .bitmapConfig(Bitmap.Config.RGB_565).build();
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view==object;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        View view = inflater.inflate(R.layout.adapter_sel_pager,container,false);
        ImageView imageView = (ImageView) view.findViewById(R.id.imageView);
        ImageLoader.getInstance().displayImage(list.get(position).getBg_pic(),imageView,options);
        container.addView(view);
        views.add(view);
        return view;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView(views.get(position));
    }
}
