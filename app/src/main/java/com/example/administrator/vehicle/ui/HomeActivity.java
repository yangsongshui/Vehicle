package com.example.administrator.vehicle.ui;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.widget.RadioGroup;

import com.example.administrator.vehicle.R;
import com.example.administrator.vehicle.adapter.TestFragmentAdapter;
import com.example.administrator.vehicle.base.BaseActivity;
import com.example.administrator.vehicle.ui.fragment.KuangFragment;
import com.example.administrator.vehicle.ui.fragment.LiangFragment;
import com.example.administrator.vehicle.ui.fragment.MeFragment;
import com.example.administrator.vehicle.ui.fragment.QuFragment;
import com.example.administrator.vehicle.widget.MyViewPager;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.OnClick;

public class HomeActivity extends BaseActivity {


    @BindView(R.id.home_rg)
    RadioGroup homeRg;
    @BindView(R.id.pager)
    MyViewPager pager;
    private List<Fragment> frags;
    TestFragmentAdapter mAdapter;
    @Override
    protected int getContentView() {
        return R.layout.activity_home;
    }

    @Override
    protected void init(Bundle savedInstanceState) {
        homeRg.check(R.id.home_liang_rb);
        homeRg.setOnCheckedChangeListener(new CheckedChangeListener());
        frags = new ArrayList<>();
        frags.add(new LiangFragment());
        frags.add(new KuangFragment());
        frags.add(new QuFragment());
        frags.add(new MeFragment());
        mAdapter = new TestFragmentAdapter(getSupportFragmentManager(), frags);
        pager.setAdapter(mAdapter);
    }


    @OnClick(R.id.home_jian)
    public void onViewClicked() {
        //点击中间车间按钮
    }


    //底部导航栏监听
    private class CheckedChangeListener implements RadioGroup.OnCheckedChangeListener {
        @Override
        public void onCheckedChanged(RadioGroup group, int checkedId) {
            switch (checkedId) {
                case R.id.home_liang_rb:
                    pager.setCurrentItem(0);
                    break;
                case R.id.home_kuang_rb:
                    pager.setCurrentItem(1);
                    break;
                case R.id.home_qu_rb:
                    pager.setCurrentItem(2);
                    break;
                case R.id.home_wo_rb:
                    pager.setCurrentItem(3);
                    break;

            }
        }
    }
}
