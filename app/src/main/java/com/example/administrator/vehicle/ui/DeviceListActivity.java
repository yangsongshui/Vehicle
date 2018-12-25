package com.example.administrator.vehicle.ui;

import android.Manifest;
import android.app.ProgressDialog;
import android.content.Intent;
import android.hardware.Camera;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.example.administrator.vehicle.R;
import com.example.administrator.vehicle.adapter.DeviceAdapter;
import com.example.administrator.vehicle.app.MyApplication;
import com.example.administrator.vehicle.base.BaseActivity;
import com.example.administrator.vehicle.bean.Device;
import com.example.administrator.vehicle.bean.Msg;
import com.example.administrator.vehicle.bean.User;
import com.example.administrator.vehicle.presenter.BindingPresenterImp;
import com.example.administrator.vehicle.presenter.DeviceListPresenterImp;
import com.example.administrator.vehicle.util.Constan;
import com.example.administrator.vehicle.util.Log;
import com.example.administrator.vehicle.view.DeviceView;
import com.example.administrator.vehicle.view.MsgView;
import com.example.administrator.vehicle.zxing.activity.CaptureActivity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class DeviceListActivity extends BaseActivity implements DeviceView {


    @BindView(R.id.device_list)
    RecyclerView deviceList;
    DeviceAdapter adapter;
    private RecyclerView.LayoutManager mLayoutManager;
    //打开扫描界面请求码
    private int REQUEST_CODE = 0x01;
    //扫描成功返回码
    private int RESULT_OK = 0xA1;
    DeviceListPresenterImp deviceListPresenterImp;
    ProgressDialog progressDialog;
    @Override
    protected int getContentView() {
        return R.layout.activity_device_list;
    }

    @Override
    protected void init(Bundle savedInstanceState) {

        adapter = new DeviceAdapter(new Device(), this);
        progressDialog = new ProgressDialog(this);
        //progressDialog.setTitle();
        progressDialog.setMessage(getString(R.string.dialog_msg));
        progressDialog.setCanceledOnTouchOutside(false);
        //RecyclerView初始化
        mLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        deviceList.setLayoutManager(mLayoutManager);
        deviceList.setAdapter(adapter);

        deviceListPresenterImp=new DeviceListPresenterImp(this, this);

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {

        super.onActivityResult(requestCode, resultCode, data);
        //扫描结果回调
        if (resultCode == RESULT_OK) {

        }

    }


    @Override
    protected void onStart() {
        super.onStart();
        deviceListPresenterImp.Registration(MyApplication.newInstance().getUsercoe());
    }

    @OnClick({R.id.register_left_iv, R.id.device_add})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.register_left_iv:
                finish();
                break;
            case R.id.device_add:
                if (isCameraCanUse()) {
                    Intent intent = new Intent(this, CaptureActivity.class);
                    startActivityForResult(intent, REQUEST_CODE);
                }

                break;
        }
    }
    public static boolean isCameraCanUse() {
        boolean canUse = true;
        Camera mCamera = null;
        try {
            mCamera = Camera.open();
        } catch (Exception e) {
            canUse = false;
        }
        if (canUse) {
            if (mCamera != null)
                mCamera.release();
            mCamera = null;
        }
        return canUse;
    }


    @Override
    public void disimissProgress() {

    }

    @Override
    public void loadDataSuccess(Device tData) {
        adapter.updateData(tData);
    }

    @Override
    public void loadDataError(Throwable throwable) {

    }
}
