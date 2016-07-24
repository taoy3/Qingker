package com.game.taoy3.qingker.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.game.taoy3.qingker.R;

/**
 * Created by taoy3 on 16/4/9.
 */
public abstract class BaseFragment extends Fragment{
    protected ImageView leftView;
    protected TextView titleView;
    protected ImageView rightView;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view =  inflater.inflate(getLayoutId(), container, false);
        initData();
        initHead(view);
        initView(view);
        return view;
    }
    private void initHead(View view) {
        leftView = (ImageView) view.findViewById(R.id.head_left);
        titleView = (TextView) view.findViewById(R.id.head_title);
        rightView = (ImageView) view.findViewById(R.id.head_right);
    }

    protected abstract void initView(View view);

    protected abstract void initData();

    protected abstract int getLayoutId();
}
