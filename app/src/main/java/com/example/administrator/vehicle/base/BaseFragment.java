package com.example.administrator.vehicle.base;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.administrator.vehicle.util.Toastor;

import butterknife.ButterKnife;
import butterknife.Unbinder;


public abstract class BaseFragment extends Fragment {
    private static final String TAG = BaseFragment.class.getName();
    protected View layout;
    private Unbinder unbinder;
    public Toastor toastor;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        layout = inflater.inflate(getContentView(), null);
        // 注解Fragment
        unbinder= ButterKnife.bind(this, layout);
        initData(layout, savedInstanceState);
        toastor=new Toastor(getActivity());
        return layout;
    }

    protected abstract void initData(View layout, Bundle savedInstanceState);

    protected abstract int getContentView();

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }
}
