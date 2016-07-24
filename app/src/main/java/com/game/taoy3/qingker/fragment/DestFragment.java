package com.game.taoy3.qingker.fragment;


import android.support.v4.app.Fragment;
import android.view.View;
import android.widget.GridView;

import com.game.taoy3.qingker.R;
import com.game.taoy3.qingker.adapter.BaseListAdapter;
import com.game.taoy3.qingker.adapter.DestAdapter;
import com.game.taoy3.qingker.bean.RecommDest;
import com.game.taoy3.qingker.constant.UrlConstant;
import com.game.taoy3.qingker.utils.GsonUtils;
import com.game.taoy3.qingker.utils.HttpRequest;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class DestFragment extends BaseFragment {

    private GridView gridView;
    private List<RecommDest> list = new ArrayList<>();
    private int page = 1;
    private BaseListAdapter<RecommDest> adapter;

    public DestFragment() {
        // Required empty public constructor
    }

    @Override
    protected void initView(View view) {
        titleView.setText(R.string.dest);
        rightView.setImageResource(R.mipmap.search);
        rightView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        gridView = (GridView) view.findViewById(R.id.dest_grid);
        adapter = new DestAdapter(list,getActivity());
        gridView.setAdapter(adapter);
    }

    @Override
    protected void initData() {
        HttpRequest.getInstance().get(UrlConstant.getRecommdests(page),getActivity(),null,new HttpRequest.RequestCallBack(){
            @Override
            public void onFail(Exception e) {

            }

            @Override
            public void onSucceed(String result) {
                List<RecommDest> temp = GsonUtils.getInstance().parseArray(result,RecommDest.class);
                if(null!=temp&&temp.size()>0){
                    list.addAll(temp);
                    adapter.notifyDataSetChanged();
                }
            }
        });
    }

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_dest;
    }

}
