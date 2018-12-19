package com.example.administrator.vehicle.ui.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.View;
import android.widget.TextView;

import com.example.administrator.vehicle.R;
import com.example.administrator.vehicle.base.BaseFragment;

import butterknife.BindView;
import butterknife.OnClick;

/**
 * A simple {@link Fragment} subclass.
 */
public class GuFragment extends BaseFragment {


    @BindView(R.id.normal_1)
    TextView normal1;
    @BindView(R.id.normal_2)
    TextView normal2;
    @BindView(R.id.normal_3)
    TextView normal3;
    @BindView(R.id.normal_4)
    TextView normal4;
    @BindView(R.id.normal_5)
    TextView normal5;
    @BindView(R.id.normal_6)
    TextView normal6;
    @BindView(R.id.normal_7)
    TextView normal7;
    public GuFragment() {
        // Required empty public constructor
    }


    @Override
    protected void initData(View layout, Bundle savedInstanceState) {

    }

    @Override
    protected int getContentView() {
        return R.layout.fragment_gu;
    }


    @OnClick({R.id.car_1, R.id.car_2, R.id.car_3, R.id.car_4, R.id.car_5, R.id.car_6, R.id.car_7})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.car_1:
                break;
            case R.id.car_2:
                break;
            case R.id.car_3:
                break;
            case R.id.car_4:
                break;
            case R.id.car_5:
                break;
            case R.id.car_6:
                break;
            case R.id.car_7:
                break;
        }
    }
}
