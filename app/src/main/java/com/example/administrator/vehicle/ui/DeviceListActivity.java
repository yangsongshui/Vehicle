package com.example.administrator.vehicle.ui;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.administrator.vehicle.R;
import com.example.administrator.vehicle.adapter.DeviceAdapter;
import com.example.administrator.vehicle.adapter.QuAdapter;
import com.example.administrator.vehicle.base.BaseActivity;
import com.example.administrator.vehicle.bean.Device;
import com.example.administrator.vehicle.bean.ItemArticle;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class DeviceListActivity extends BaseActivity {


    @BindView(R.id.device_list)
    RecyclerView deviceList;
    DeviceAdapter adapter;
    private RecyclerView.LayoutManager mLayoutManager;
    @Override
    protected int getContentView() {
        return R.layout.activity_device_list;
    }

    @Override
    protected void init(Bundle savedInstanceState) {
        ArrayList<Device> data = new ArrayList<>();

        data.add(new Device());
        data.add(new Device());
        data.add(new Device());
        data.add(new Device());
        data.add(new Device());
        adapter=new DeviceAdapter(data,this);

        //RecyclerView初始化
        mLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);

        deviceList.setLayoutManager(mLayoutManager);
        // 设置adapter
        deviceList.setAdapter(adapter);
    }

    @OnClick(R.id.register_left_iv)
    public void onViewClicked() {
        finish();
    }
}
