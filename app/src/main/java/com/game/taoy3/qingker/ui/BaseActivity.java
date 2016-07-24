package com.game.taoy3.qingker.ui;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import com.game.taoy3.qingker.R;

/**
 * Created by taoy3 on 16/4/9.
 */
public abstract class BaseActivity extends AppCompatActivity{
    protected ImageView leftView;
    protected TextView titleView;
    protected ImageView rightView;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView();
        initData();
        initHead();
        initView();
    }

    private void initHead() {
        if(null!=findViewById(R.id.head_left)){
            leftView = (ImageView) findViewById(R.id.head_left);
        }
        if(null!=findViewById(R.id.head_title)){
            titleView = (TextView) findViewById(R.id.head_title);
        }
        if(null!=findViewById(R.id.head_right)){
            rightView = (ImageView) findViewById(R.id.head_right);
        }
    }

    protected abstract void initData();

    protected abstract void initView();

    protected abstract void setContentView();
}
