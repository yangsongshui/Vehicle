package com.example.administrator.vehicle.ui;

import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.administrator.vehicle.R;
import com.example.administrator.vehicle.adapter.CarAdapter;
import com.example.administrator.vehicle.base.BaseActivity;
import com.example.administrator.vehicle.bean.CarServices;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class CarServicesActivity extends BaseActivity {


    @BindView(R.id.car_rv)
    RecyclerView carRv;
    CarAdapter carAdapter;
    @Override
    protected int getContentView() {
        return R.layout.activity_car_services;
    }

    @Override
    protected void init(Bundle savedInstanceState) {
        GridLayoutManager layoutManage = new GridLayoutManager(this, 4);
        carRv.setLayoutManager(layoutManage);
        List<CarServices> mList=new ArrayList<>();
        mList.add(new CarServices(R.string.main_car_1,R.drawable.main_car_1));
        mList.add(new CarServices(R.string.main_car_2,R.drawable.main_car_2));
        mList.add(new CarServices(R.string.main_car_3,R.drawable.main_car_3));
        mList.add(new CarServices(R.string.main_car_4,R.drawable.main_car_4));
        mList.add(new CarServices(R.string.main_car_5,R.drawable.main_car_5));
        mList.add(new CarServices(R.string.main_car_6,R.drawable.main_car_6));
        mList.add(new CarServices(R.string.main_car_7,R.drawable.main_car_7));
        mList.add(new CarServices(R.string.main_car_8,R.drawable.main_car_8));
        mList.add(new CarServices(R.string.main_car_9,R.drawable.main_car_9));
        mList.add(new CarServices(R.string.main_car_10,R.drawable.main_car_10));
        mList.add(new CarServices(R.string.main_car_11,R.drawable.main_car_11));
        mList.add(new CarServices(R.string.main_car_12,R.drawable.main_car_12));
        mList.add(new CarServices(R.string.main_car_13,R.drawable.main_car_13));
        mList.add(new CarServices(R.string.main_car_14,R.drawable.main_car_14));
        mList.add(new CarServices(R.string.main_car_15,R.drawable.main_car_15));

        carAdapter=new CarAdapter(mList,this);
        carRv.setAdapter(carAdapter);
    }

    @OnClick(R.id.register_left_iv)
    public void onViewClicked() {
        finish();
    }

}
