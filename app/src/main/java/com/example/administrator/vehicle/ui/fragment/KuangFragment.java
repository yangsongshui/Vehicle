package com.example.administrator.vehicle.ui.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.View;

import com.example.administrator.vehicle.R;
import com.example.administrator.vehicle.base.BaseFragment;
import com.example.administrator.vehicle.bean.TabEntity;
import com.flyco.tablayout.CommonTabLayout;
import com.flyco.tablayout.listener.CustomTabEntity;
import com.flyco.tablayout.listener.OnTabSelectListener;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;


public class KuangFragment extends BaseFragment implements OnTabSelectListener {

    @BindView(R.id.tl_4)
    CommonTabLayout mTabLayout_4;
    private int position=0; //当前选中的位置
    private Fragment mFragment;//刚显示的Fragment
    private List<Fragment> frags;
    private ArrayList<CustomTabEntity> mTabEntities = new ArrayList<>();
    @Override
    protected void initData(View layout, Bundle savedInstanceState) {
        frags = new ArrayList<>();
        frags.add(new GuFragment());
        frags.add(new JingFragment());
        //设置Tab菜单
        mTabEntities.add(new TabEntity(getActivity().getString(R.string.kuang_data)));
        mTabEntities.add(new TabEntity(getActivity().getString(R.string.kuang_data2)));
        mTabLayout_4.setTabData(mTabEntities);
        mTabLayout_4.setOnTabSelectListener(this);

    }

    @Override
    protected int getContentView() {
        return R.layout.fragment_kuang;
    }

    @Override
    public void onTabSelect(int position) {
        //tab选中
        this.position=position;
        Fragment currentFragment = getFragment();
        replaceFragment(mFragment,currentFragment);
    }

    @Override
    public void onTabReselect(int position) {

    }

    @Override
    public void onStart() {
        super.onStart();
        Fragment currentFragment = getFragment();
        replaceFragment(mFragment,currentFragment);
    }

    /**
     *
     * @param lastFragment
     * @param currentFragment
     */
    private void replaceFragment(Fragment lastFragment, Fragment currentFragment) {
        FragmentManager fm =getChildFragmentManager();
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
                transaction.add(R.id.kuang_fl,currentFragment).commit();
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
