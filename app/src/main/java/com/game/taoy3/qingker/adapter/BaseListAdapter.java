package com.game.taoy3.qingker.adapter;

import android.app.Activity;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import com.nostra13.universalimageloader.core.DisplayImageOptions;
import com.nostra13.universalimageloader.core.ImageLoader;

import java.util.List;

/**
 * Created by taoy3 on 16/4/13.
 */
public abstract class BaseListAdapter<T> extends BaseAdapter{
    protected List<T> list;
    protected LayoutInflater inflater;
    private DisplayImageOptions options;

    public BaseListAdapter(List<T> list, Activity activity) {
        this.inflater = LayoutInflater.from(activity);
        this.list = list;
        options = new DisplayImageOptions.Builder().cacheInMemory(true).cacheOnDisk(true)
                .bitmapConfig(Bitmap.Config.RGB_565).build();
    }
    protected void loadImage(String url, ImageView view){
        ImageLoader.getInstance().displayImage(url,view,options);
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }
}
