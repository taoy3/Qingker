package com.game.taoy3.qingker;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.widget.RadioGroup;

import com.game.taoy3.qingker.fragment.BaseFragment;
import com.game.taoy3.qingker.fragment.DestFragment;
import com.game.taoy3.qingker.fragment.FindFragment;
import com.game.taoy3.qingker.fragment.MyFragment;
import com.game.taoy3.qingker.fragment.SelectedFragment;
import com.game.taoy3.qingker.utils.FragmentSwitchUtils;

public class MainActivity extends AppCompatActivity {
    private ViewPager viewPager;
    private RadioGroup radioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewPager = (ViewPager) findViewById(R.id.main_pager);
        radioGroup = (RadioGroup) findViewById(R.id.main_group);
        BaseFragment[] fragments = new BaseFragment[]{new SelectedFragment(),new FindFragment()
                                                    ,new DestFragment(),new MyFragment()};
        new FragmentSwitchUtils(getSupportFragmentManager(),fragments,radioGroup,viewPager);
    }
}
