package com.game.taoy3.qingker.fragment;


import android.support.v4.app.Fragment;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;

import com.game.taoy3.qingker.R;
import com.game.taoy3.qingker.adapter.MyCollectAdapter;
import com.game.taoy3.qingker.bean.RecommsBean;
import com.game.taoy3.qingker.widght.CirImageView;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class MyFragment extends BaseFragment {
    private TextView nameTv;
    private CirImageView iconIv;
    private TextView noteTv;
    private ListView listView;
    private MyCollectAdapter adapter;
    private List<RecommsBean> collections = new ArrayList<>();

    public MyFragment() {
        // Required empty public constructor
    }

    @Override
    protected void initView(View view) {
        leftView.setImageResource(R.mipmap.message_icon);
        leftView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        titleView.setText(R.string.me);
        rightView.setImageResource(R.mipmap.settings);
        rightView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        listView = (ListView) view.findViewById(R.id.collect_list);
        adapter = new MyCollectAdapter(collections,getActivity());
        listView.setAdapter(adapter);
        listView.addHeaderView(getHeaderView());
    }

    private View getHeaderView() {
        View view = View.inflate(getActivity(),R.layout.head_fragment_my,null);
        nameTv = (TextView) view.findViewById(R.id.name);
        iconIv = (CirImageView) view.findViewById(R.id.user_icon);
        noteTv = (TextView) view.findViewById(R.id.note);
        return view;
    }

    @Override
    protected void initData() {

    }

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_my;
    }

}
