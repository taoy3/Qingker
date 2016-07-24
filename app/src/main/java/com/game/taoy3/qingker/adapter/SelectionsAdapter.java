package com.game.taoy3.qingker.adapter;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.game.taoy3.qingker.R;
import com.game.taoy3.qingker.bean.Discover;
import com.game.taoy3.qingker.widght.CircularImageView;

import java.util.List;

/**
 * Created by taoy3 on 16/4/13.
 */
public class SelectionsAdapter extends BaseListAdapter<Discover.TopSelectionsBean>{
    public SelectionsAdapter(List<Discover.TopSelectionsBean> list, Activity activity) {
        super(list, activity);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder = null;
        if(convertView ==null){
            convertView = inflater.inflate(R.layout.adapter_selection,parent,false);
            holder = new ViewHolder(convertView);
            convertView.setTag(holder);
        }
        holder = (ViewHolder) convertView.getTag();
        holder.titleTv.setText(list.get(position).getSelection().getTitle()
                +list.get(position).getSelection().getSub_title());
        holder.tipTv.setText(list.get(position).getHotness()+"%的小伙伴浏览了");
        holder.imageView.setBackgroundColor(list.get(position).getSelection().getBg_color());
        loadImage(list.get(position).getSelection().getBg_pic(),holder.imageView);
        return convertView;
    }
    private static class ViewHolder{
        private CircularImageView imageView;
        private TextView tipTv;
        private TextView titleTv;
        private ViewHolder(View view){
            imageView = (CircularImageView) view.findViewById(R.id.image);
            tipTv = (TextView) view.findViewById(R.id.tip);
            titleTv = (TextView) view.findViewById(R.id.title);
        }
    }
}
