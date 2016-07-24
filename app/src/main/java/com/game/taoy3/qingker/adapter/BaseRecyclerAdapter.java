package com.game.taoy3.qingker.adapter;

import android.app.Activity;
import android.graphics.Bitmap;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;

import com.nostra13.universalimageloader.core.DisplayImageOptions;
import com.nostra13.universalimageloader.core.ImageLoader;

import java.util.List;

/**
 * Created by taoy3 on 16/4/13.
 */
public abstract class  BaseRecyclerAdapter<T> extends RecyclerView.Adapter<RecyclerView.ViewHolder>{
    protected List<T> list;
    protected OnItemClickListener itemClickListener;
    private String TAG = getClass().getName();
    protected LayoutInflater inflater;
    private DisplayImageOptions options;
    public BaseRecyclerAdapter(List<T> list, Activity activity) {
        this.inflater = LayoutInflater.from(activity);
        this.list = list;
        options = new DisplayImageOptions.Builder().cacheInMemory(true).cacheOnDisk(true)
                .bitmapConfig(Bitmap.Config.RGB_565).build();
    }
    protected void loadImage(String url, ImageView view){
        ImageLoader.getInstance().displayImage(url,view,options);
    }
    public interface OnItemClickListener{
        void onItemClick(int type, String msg);
    }
    @Override
    public int getItemCount() {
        return list.size();
    }
    public class ItemClickListener implements View.OnClickListener{
        private int type;
        private String msg;

        public ItemClickListener(int type, String msg) {
            this.type = type;
            this.msg = msg;
        }

        @Override
        public void onClick(View v) {
            if(null!=itemClickListener){
                itemClickListener.onItemClick(type,msg);
            }
        }
    }
    public void setOnItemClickListener(OnItemClickListener itemClickListener){
        this.itemClickListener = itemClickListener;
    }

}
