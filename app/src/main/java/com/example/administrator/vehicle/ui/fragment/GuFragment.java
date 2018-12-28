package com.example.administrator.vehicle.ui.fragment;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.View;
import android.widget.TextView;

import com.example.administrator.vehicle.R;
import com.example.administrator.vehicle.base.BaseFragment;
import com.example.administrator.vehicle.ui.ErrorCodeActivity;

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
       Intent intent= new Intent(getActivity(),ErrorCodeActivity.class);
        switch (view.getId()) {
            case R.id.car_1:
                intent.putExtra("name",R.string.gu_data);
                break;
            case R.id.car_2:
                intent.putExtra("name",R.string.gu_data2);
                break;
            case R.id.car_3:
                intent.putExtra("name",R.string.gu_data3);
                break;
            case R.id.car_4:
                intent.putExtra("name",R.string.gu_data4);
                break;
            case R.id.car_5:
                intent.putExtra("name",R.string.gu_data5);
                break;
            case R.id.car_6:
                intent.putExtra("name",R.string.gu_data6);
                break;
            case R.id.car_7:
                intent.putExtra("name",R.string.gu_data7);
                break;
        }
        startActivity(intent);
    }
}
