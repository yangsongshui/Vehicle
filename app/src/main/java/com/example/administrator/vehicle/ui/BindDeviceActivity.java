package com.example.administrator.vehicle.ui;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.administrator.vehicle.R;
import com.example.administrator.vehicle.app.MyApplication;
import com.example.administrator.vehicle.base.BaseActivity;
import com.example.administrator.vehicle.bean.Msg;
import com.example.administrator.vehicle.presenter.BindingPresenterImp;
import com.example.administrator.vehicle.util.Constan;
import com.example.administrator.vehicle.view.MsgView;
import com.example.administrator.vehicle.zxing.activity.CaptureActivity;

import java.util.HashMap;
import java.util.Map;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class BindDeviceActivity extends BaseActivity implements MsgView {


    @BindView(R.id.binding_et)
    EditText bindingEt;
    @BindView(R.id.binding_sn_et)
    EditText bindingSnEt;
    BindingPresenterImp bindingPresenterImp;
    ProgressDialog progressDialog;

    @Override
    protected int getContentView() {
        return R.layout.activity_bind_device;
    }

    @Override
    protected void init(Bundle savedInstanceState) {
        bindingPresenterImp = new BindingPresenterImp(this, this);
        progressDialog = new ProgressDialog(this);
        //progressDialog.setTitle();
        progressDialog.setMessage(getString(R.string.dialog_msg));
        progressDialog.setCanceledOnTouchOutside(false);
    }

    @OnClick({R.id.register_left_iv, R.id.binding_tv, R.id.binding_zxing_iv})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.register_left_iv:
                finish();
                break;
            case R.id.binding_tv:
                Map<String, String> map = new HashMap<>();
                map.put("deviceId", bindingEt.getText().toString());
                map.put("deviceKey",  bindingSnEt.getText().toString());
                map.put("consumerCode", MyApplication.newInstance().getUsercoe());
                bindingPresenterImp.Registration(map);
                break;
            case R.id.binding_zxing_iv:
                startActivity(new Intent(this, CaptureActivity.class));
                break;
        }
    }

    @Override
    public void disimissProgress() {
        progressDialog.dismiss();
    }

    @Override
    public void loadDataSuccess(Msg tData) {
        toastor.showSingletonToast(Constan.getMsg(tData.getStatus()));
        finish();
    }

    @Override
    public void loadDataError(Throwable throwable) {
        progressDialog.dismiss();
    }
}
