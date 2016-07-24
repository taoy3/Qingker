package com.game.taoy3.qingker.utils;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.game.taoy3.qingker.adapter.SwitchPagerAdapter;

/**
 * Created by taoy3 on 16/4/9.
 */
public class FragmentSwitchUtils implements ViewPager.OnPageChangeListener, RadioGroup.OnCheckedChangeListener {
    private ViewPager viewPager;
    private RadioButton[] radioButtons;
    private int selectIndex;

    public FragmentSwitchUtils(FragmentManager manager, Fragment[] fragments, RadioGroup radioGroup, ViewPager viewPager) {
        this.viewPager = viewPager;
        radioButtons = new RadioButton[radioGroup.getChildCount()];
        for(int i = 0;i<radioButtons.length;i++){
            radioButtons[i] = (RadioButton) radioGroup.getChildAt(i);
        }
        if(null==radioButtons[0]){
            return;
        }
        radioButtons[selectIndex].setChecked(true);
        viewPager.setAdapter(new SwitchPagerAdapter(manager,fragments));
        viewPager.setCurrentItem(selectIndex);
        viewPager.addOnPageChangeListener(this);
        radioGroup.setOnCheckedChangeListener(this);
    }

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

    }

    @Override
    public void onPageSelected(int position) {
        setSelectIndex(position);
    }

    @Override
    public void onPageScrollStateChanged(int state) {

    }

    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {
        for(int i=0;i<radioButtons.length;i++){
            if(checkedId==radioButtons[i].getId()){
                setSelectIndex(i);
                break;

            }
        }
    }
    private void setSelectIndex(int position){
        if(position!=selectIndex){
            radioButtons[position].setChecked(true);
            viewPager.setCurrentItem(position);
            selectIndex = position;
        }
    }
}
