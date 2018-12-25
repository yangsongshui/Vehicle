package com.example.administrator.vehicle.ui.fragment;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.administrator.vehicle.R;
import com.example.administrator.vehicle.app.MyApplication;
import com.example.administrator.vehicle.base.BaseFragment;
import com.example.administrator.vehicle.bean.Device;
import com.example.administrator.vehicle.event.event;
import com.example.administrator.vehicle.ui.DeviceListActivity;
import com.example.administrator.vehicle.util.Log;
import com.example.administrator.vehicle.widget.CircleProgressBar;
import com.example.administrator.vehicle.zxing.activity.CaptureActivity;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

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
    @BindView(R.id.car_logo)
    ImageView carLogo;
    @BindView(R.id.car_name)
    TextView carName;
    @BindView(R.id.car_num)
    TextView carNum;
    @BindView(R.id.car_key)
    TextView carKey;
    @BindView(R.id.car_status)
    LinearLayout carStatus;
    @BindView(R.id.liang_data)
    TextView liangData;
    @BindView(R.id.liang_data2)
    TextView liangData2;
    @BindView(R.id.liang_data3)
    TextView liangData3;
    @BindView(R.id.liang_data4)
    TextView liangData4;
    @BindView(R.id.liang_data5)
    TextView liangData5;
    @BindView(R.id.liang_data6)
    TextView liangData6;
    @BindView(R.id.car_ll)
    LinearLayout carLl;


    public LiangFragment() {
        // Required empty public constructor
    }


    @Override
    protected void initData(View layout, Bundle savedInstanceState) {

        //注册EventBus
        EventBus.getDefault().register(this);
        colorProgressView.setMaxStepNum(100);
        colorProgressView.update(50, 1000);
    }


    @Override
    protected int getContentView() {
        return R.layout.fragment_liang;
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onEventMainThread(event event) {
        Device device = event.getDevice();
        Log.e("device", "获取到设备信息");
        carNum.setText("设备号:" + device.getData().get(0).getDeviceId());

        if (device.getData().get(0).getLogoPath() != null) {
            MyApplication.newInstance().getGlide().load(device.getData().get(0).getLogoPath()).into(carLogo);
        }
        carName.setText(device.getData().get(0).getBrandName());
        carKey.setText("key:" + device.getData().get(0).getFrameNo());
        if (device.getData().get(0).getFaultCodes() != null) {
            carLl.setVisibility(View.GONE);
            carStatus.setVisibility(View.VISIBLE);
        } else {
            carLl.setVisibility(View.VISIBLE);
            carStatus.setVisibility(View.GONE);

        }
    }

    @OnClick({R.id.register_left_iv, R.id.register_rig_iv})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.register_left_iv:
                startActivity(new Intent(getActivity(), DeviceListActivity.class));
                break;
            case R.id.register_rig_iv:
                Intent intent = new Intent(getActivity(), CaptureActivity.class);
                startActivity(intent);
                break;
        }
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        EventBus.getDefault().unregister(this);
    }


}
