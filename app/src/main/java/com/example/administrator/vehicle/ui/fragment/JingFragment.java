package com.example.administrator.vehicle.ui.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.administrator.vehicle.R;
import com.example.administrator.vehicle.base.BaseFragment;

import butterknife.BindView;

/**
 * A simple {@link Fragment} subclass.
 */
public class JingFragment extends BaseFragment {


    @BindView(R.id.car_warning1)
    ImageView carWarning1;
    @BindView(R.id.top_left)
    TextView topLeft;
    @BindView(R.id.left)
    TextView left;
    @BindView(R.id.car_warning2)
    ImageView carWarning2;
    @BindView(R.id.top_rig)
    TextView topRig;
    @BindView(R.id.right)
    TextView right;
    @BindView(R.id.car_warning3)
    ImageView carWarning3;
    @BindView(R.id.bottom_left)
    TextView bottomLeft;
    @BindView(R.id.bleft)
    TextView bleft;
    @BindView(R.id.car_warning4)
    ImageView carWarning4;
    @BindView(R.id.bottom_rig)
    TextView bottomRig;
    @BindView(R.id.bright)
    TextView bright;

    @Override
    protected void initData(View layout, Bundle savedInstanceState) {

    }

    @Override
    protected int getContentView() {
        return R.layout.fragment_jing;
    }


}
