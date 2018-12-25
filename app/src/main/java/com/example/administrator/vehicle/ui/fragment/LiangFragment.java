package com.example.administrator.vehicle.ui.fragment;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.administrator.vehicle.R;
import com.example.administrator.vehicle.base.BaseFragment;
import com.example.administrator.vehicle.ui.DeviceListActivity;
import com.example.administrator.vehicle.widget.CircleProgressBar;
import com.example.administrator.vehicle.zxing.activity.CaptureActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;

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



    @OnClick({R.id.register_left_iv, R.id.register_rig_iv})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.register_left_iv:
                startActivity(new Intent(getActivity(),DeviceListActivity.class));
                break;
            case R.id.register_rig_iv:
                Intent intent = new Intent(getActivity(), CaptureActivity.class);
                startActivity(intent);
                break;
        }
    }
}
