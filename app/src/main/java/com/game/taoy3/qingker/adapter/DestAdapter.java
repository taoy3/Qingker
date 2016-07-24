package com.game.taoy3.qingker.adapter;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.game.taoy3.qingker.R;
import com.game.taoy3.qingker.bean.RecommDest;
import com.game.taoy3.qingker.widght.CircularImageView;

import java.util.List;

/**
 * Created by taoy3 on 16/4/15.
 */
public class DestAdapter extends BaseListAdapter<RecommDest>{
    public DestAdapter(List<RecommDest> list, Activity activity) {
        super(list, activity);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if(null==convertView){
            convertView = inflater.inflate(R.layout.dest_adapter,parent,false);
            holder = new ViewHolder(convertView);
            convertView.setTag(holder);
        }
        holder = (ViewHolder) convertView.getTag();
        holder.textView.setText(list.get(position).getName());
        holder.imageView.setBackgroundColor(list.get(position).getBg_color());
        loadImage(list.get(position).getBg_pic(),holder.imageView);
        return convertView;
    }
    private static class ViewHolder{
        private CircularImageView imageView;
        private TextView textView;
        private ViewHolder(View view){
            imageView = (CircularImageView) view.findViewById(R.id.imageView);
            textView = (TextView) view.findViewById(R.id.name);
        }
    }
}
