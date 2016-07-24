package com.game.taoy3.qingker.fragment;


import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import com.game.taoy3.qingker.R;
import com.game.taoy3.qingker.adapter.BaseRecyclerAdapter;
import com.game.taoy3.qingker.adapter.SelectedRecAdapter;
import com.game.taoy3.qingker.bean.RecommsBean;
import com.game.taoy3.qingker.constant.UrlConstant;
import com.game.taoy3.qingker.utils.BufferDialog;
import com.game.taoy3.qingker.utils.GsonUtils;
import com.game.taoy3.qingker.utils.HttpRequest;
import com.game.taoy3.qingker.widght.DividerItemDecoration;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;


public class SelectedFragment extends BaseFragment implements BaseRecyclerAdapter.OnItemClickListener {
    private SelectedRecAdapter adapter;
    private RecyclerView recyclerView;
    private List<RecommsBean> list = new ArrayList<>();
    private int page =1;
    private BufferDialog dialog;
    public SelectedFragment() {}

    @Override
    protected void initView(View view) {
        recyclerView = (RecyclerView) view.findViewById(R.id.select_recycler);
        recyclerView.addItemDecoration(new DividerItemDecoration(getActivity(), DividerItemDecoration.VERTICAL_LIST));
        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext(),LinearLayoutManager.VERTICAL,false);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        adapter = new SelectedRecAdapter(list,getActivity());
        recyclerView.setAdapter(adapter);
        adapter.setOnItemClickListener(this);
        dialog = new BufferDialog(getActivity());

        dialog.show();
    }

    @Override
    protected void initData() {
        HttpRequest.getInstance().get(UrlConstant.getSelected(page),getActivity(), null, new HttpRequest.RequestCallBack() {
            @Override
            public void onFail(Exception e) {
                Toast.makeText(getActivity(),e.getMessage(),Toast.LENGTH_SHORT).show();
                dialog.dismiss();
            }

            @Override
            public void onSucceed(String result) {
                dialog.dismiss();
                try {
                    String json = new JSONObject(result).getString("recomms");
                    List<RecommsBean> recommsBeen = GsonUtils.getInstance().parseArray(json, RecommsBean.class);
                    if(null!=recommsBeen&&recommsBeen.size()>0){
                        list.addAll(recommsBeen);
                        adapter.notifyDataSetChanged();
                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        });
    }

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_selected;
    }

    @Override
    public void onItemClick(int type, String msg) {

    }
}
