package com.game.taoy3.qingker.adapter;

import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.game.taoy3.qingker.R;
import com.game.taoy3.qingker.bean.Discover;

import java.util.List;

/**
 * Created by taoy3 on 16/4/9.
 */
public class TagsRecAdapter extends BaseRecyclerAdapter<Discover.TagsBean>{

    public TagsRecAdapter(Activity activity, List<Discover.TagsBean> list) {
        super(list,activity);
    }


    @Override
    public TagsRecAdapter.TagsHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.adapter_tags,parent,false);

        return new TagsHolder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        if(holder instanceof TagsHolder){
            TagsHolder tagsHolder = (TagsHolder) holder;
            tagsHolder.namrTv.setText(list.get(position).getName());
            loadImage(list.get(position).getIcon(),tagsHolder.iconIv);
            tagsHolder.itemView.setOnClickListener(new ItemClickListener(0,list.get(position).getId()+""));
        }
    }


    public class TagsHolder extends RecyclerView.ViewHolder {
        private ImageView iconIv;
        private TextView namrTv;

        public TagsHolder(View view) {
        super(view);
            iconIv = (ImageView) view.findViewById(R.id.icon);
            namrTv = (TextView) view.findViewById(R.id.name);
    }
}


}
