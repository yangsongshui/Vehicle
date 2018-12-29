package com.example.administrator.vehicle.ui.fragment;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.administrator.vehicle.R;
import com.example.administrator.vehicle.adapter.QuAdapter;
import com.example.administrator.vehicle.app.MyApplication;
import com.example.administrator.vehicle.base.BaseFragment;
import com.example.administrator.vehicle.bean.Appmoments;
import com.example.administrator.vehicle.bean.TabEntity;
import com.example.administrator.vehicle.presenter.AppmomentsPresenterImp;
import com.example.administrator.vehicle.ui.AppmomentsInfoActivity;
import com.example.administrator.vehicle.util.Constan;
import com.example.administrator.vehicle.view.AppmomentsView;
import com.flyco.tablayout.CommonTabLayout;
import com.flyco.tablayout.listener.CustomTabEntity;
import com.flyco.tablayout.listener.OnTabSelectListener;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;

/**
 * A simple {@link Fragment} subclass.
 */
public class QuFragment extends BaseFragment implements OnTabSelectListener, AppmomentsView, QuAdapter.OnMyItemClickListener {
    @BindView(R.id.qu_rv)
    RecyclerView quRv;
    @BindView(R.id.tl_4)
    CommonTabLayout mTabLayout_4;
    Unbinder unbinder;

    private ArrayList<CustomTabEntity> mTabEntities = new ArrayList<>();
    private QuAdapter mAdapter;

    private RecyclerView.LayoutManager mLayoutManager;
    AppmomentsPresenterImp presenterImp;

    @Override
    protected void initData(View layout, Bundle savedInstanceState) {
        //RecyclerView初始化
        mLayoutManager = new LinearLayoutManager(getActivity(), LinearLayoutManager.VERTICAL, false);
        mAdapter = new QuAdapter(new Appmoments(), getActivity());
        quRv.setLayoutManager(mLayoutManager);
        // 设置adapter
        quRv.setAdapter(mAdapter);
        //设置Tab菜单
        mTabEntities.add(new TabEntity(getActivity().getString(R.string.qu_data)));
        mTabEntities.add(new TabEntity(getActivity().getString(R.string.qu_data2)));
        mTabLayout_4.setTabData(mTabEntities);
        mTabLayout_4.setOnTabSelectListener(this);
        presenterImp = new AppmomentsPresenterImp(this, getActivity());
        Map<String, String> map = new HashMap<>();
        map.put("_pageNo", "1");
        map.put("_pageSize", "20");
        map.put("userCode", MyApplication.newInstance().getUsercoe());
        presenterImp.Registration(map);
        mAdapter.setOnMyItemClickListener(this);
    }

    @Override
    protected int getContentView() {
        return R.layout.fragment_qu;
    }


    @Override
    public void onTabSelect(int position) {
        //tab选中
    }

    @Override
    public void onTabReselect(int position) {

    }

    @Override
    public void disimissProgress() {

    }

    @Override
    public void loadDataSuccess(Appmoments tData) {
        toastor.showSingletonToast(Constan.getMsg(tData.getStatus()));
        if (tData.getStatus() == 0) {
            mAdapter.updateData(tData);
        }
    }

    @Override
    public void loadDataError(Throwable throwable) {
        toastor.showSingletonToast("服务器连接失败");
    }

    @Override
    public void myClick(View v, int pos) {
        startActivity(new Intent(getActivity(), AppmomentsInfoActivity.class));
    }

    @Override
    public void mLongClick(View v, int pos) {

    }




    @OnClick(R.id.qu_add)
    public void onViewClicked() {
        //发表帖子
    }
}
