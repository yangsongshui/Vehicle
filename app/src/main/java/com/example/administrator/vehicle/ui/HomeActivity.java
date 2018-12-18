package com.example.administrator.vehicle.ui;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.widget.FrameLayout;
import android.widget.RadioGroup;

import com.example.administrator.vehicle.R;
import com.example.administrator.vehicle.base.BaseActivity;
import com.example.administrator.vehicle.ui.fragment.KuangFragment;
import com.example.administrator.vehicle.ui.fragment.LiangFragment;
import com.example.administrator.vehicle.ui.fragment.MeFragment;
import com.example.administrator.vehicle.ui.fragment.QuFragment;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.OnClick;

public class HomeActivity extends BaseActivity {
    private int position; //当前选中的位置
    private Fragment mFragment;//刚显示的Fragment
    @BindView(R.id.home_rg)
    RadioGroup homeRg;
    @BindView(R.id.fl_main)
    FrameLayout flMain;
    private List<Fragment> frags;
    @Override
    protected int getContentView() {
        return R.layout.activity_home;
    }

    @Override
    protected void init(Bundle savedInstanceState) {
        frags = new ArrayList<>();
        frags.add(new LiangFragment());
        frags.add(new KuangFragment());
        frags.add(new QuFragment());
        frags.add(new MeFragment());
        homeRg.setOnCheckedChangeListener(new CheckedChangeListener());
        homeRg.check(R.id.home_liang_rb);
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
                  //  pager.setCurrentItem(0);
                    position=0;
                    break;
                case R.id.home_kuang_rb:
                   // pager.setCurrentItem(1);
                    position=1;
                    break;
                case R.id.home_qu_rb:
                   // pager.setCurrentItem(2);
                    position=2;
                    break;
                case R.id.home_wo_rb:
                   // pager.setCurrentItem(3);
                    position=3;
                    break;

            }
            //根据位置得到对应的Fragment
            Fragment currentFragment = getFragment();
            replaceFragment(mFragment,currentFragment);
        }
    }
    /**
     *
     * @param lastFragment
     * @param currentFragment
     */
    private void replaceFragment(Fragment lastFragment, Fragment currentFragment) {
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction transaction = fm.beginTransaction();

        //如果两个不相等,说明切换了Fragment
        if(lastFragment != currentFragment){
            mFragment = currentFragment;

            //隐藏刚显示的Fragment
            if(lastFragment != null){
                transaction.hide(lastFragment);
            }
            /**
             * 显示 或者 添加当前要显示的Fragment
             *
             * 如果当前要显示的Fragment没添加过 则 添加
             * 如果当前要显示的Fragment被添加过 则 隐藏
             */
            if(!currentFragment.isAdded()){
                transaction.add(R.id.fl_main,currentFragment).commit();
            }else {
                transaction.show(currentFragment).commit();
            }
        }
    }

    /**
     * 根据返回到对应的Fragment
     * @return
     */
    private Fragment getFragment( ) {
        return frags.get(position);
    }


}
