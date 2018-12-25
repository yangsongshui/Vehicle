package com.example.administrator.vehicle.ui;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.example.administrator.vehicle.R;
import com.example.administrator.vehicle.app.MyApplication;
import com.example.administrator.vehicle.base.BaseActivity;
import com.example.administrator.vehicle.bean.Device;
import com.example.administrator.vehicle.bean.User;
import com.example.administrator.vehicle.presenter.DeviceListPresenterImp;
import com.example.administrator.vehicle.presenter.LoginPresenterImp;
import com.example.administrator.vehicle.util.Constan;
import com.example.administrator.vehicle.util.SpUtils;
import com.example.administrator.vehicle.view.DeviceView;
import com.example.administrator.vehicle.view.UserView;

import butterknife.BindView;
import butterknife.OnClick;

public class MainActivity extends BaseActivity implements UserView {


    @BindView(R.id.num)
    TextView num;
    @BindView(R.id.phone)
    EditText phone;
    @BindView(R.id.psw)
    EditText psw;
    LoginPresenterImp loginPresenterImp;
    ProgressDialog progressDialog;
    @Override
    protected int getContentView() {
        return R.layout.activity_main;
    }

    @Override
    protected void init(Bundle savedInstanceState) {
        progressDialog = new ProgressDialog(this);
        //progressDialog.setTitle();
        progressDialog.setMessage(getString(R.string.dialog_msg));
        progressDialog.setCanceledOnTouchOutside(false);
        loginPresenterImp = new LoginPresenterImp(this, this);

    }


    @OnClick({R.id.select_num, R.id.login, R.id.login_register, R.id.login_forget, R.id.login_wechat})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.select_num:
                break;
            case R.id.login:
                progressDialog.show();
                loginPresenterImp.Login(phone.getText().toString(), psw.getText().toString());

                break;
            case R.id.login_register:
                startActivity(new Intent(this, RegisterActivity.class).putExtra("type", 0));
                break;
            case R.id.login_forget:
                startActivity(new Intent(this, RegisterActivity.class).putExtra("type", 1));
                break;
            case R.id.login_wechat:
                break;
        }
    }

    @Override
    public void disimissProgress() {
        progressDialog.dismiss();
    }



    @Override
    protected void onResume() {
        super.onResume();
        String phone=SpUtils.getString("phone","");
        String password=SpUtils.getString("password","");
            if (!phone.isEmpty()&&!password.isEmpty()){
                progressDialog.show();
                loginPresenterImp.Login(phone, password);
            }
    }

    @Override
    public void loadDataSuccess(User tData) {
        toastor.showSingletonToast(Constan.getMsg(tData.getStatus()));
        Log.e("Code", tData.toString());
        if (tData.getStatus() == 0){
            SpUtils.putString("phone", phone.getText().toString());
            SpUtils.putString("password", psw.getText().toString());
            MyApplication.newInstance().setUser(tData);
            startActivity(new Intent(this, HomeActivity.class));
            finish();
        }

    }

    @Override
    public void loadDataError(Throwable throwable) {
        toastor.showSingletonToast("服务器连接失败");
    }
}
