package com.example.administrator.vehicle.ui.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.View;
import android.widget.TextView;

import com.example.administrator.vehicle.R;
import com.example.administrator.vehicle.base.BaseFragment;
import com.example.administrator.vehicle.widget.CircleProgressBar;

import butterknife.BindView;

/**
 * A simple {@link Fragment} subclass.
 */
public class LiangFragment extends BaseFragment {
    @BindView(R.id.home_data)
    TextView homeData;
    @BindView(R.id.home_data2)
    TextView homeData2;
    @BindView(R.id.home_data3)
    TextView homeData3;
    @BindView(R.id.home_data4)
    TextView homeData4;
    @BindView(R.id.color_progress_view)
    CircleProgressBar colorProgressView;

    public LiangFragment() {
        // Required empty public constructor
    }


    @Override
    protected void initData(View layout, Bundle savedInstanceState) {


        colorProgressView.setMaxStepNum(100);
        colorProgressView.update(50, 1000);
    }

    @Override
    protected int getContentView() {
        return R.layout.fragment_liang;
    }


}
