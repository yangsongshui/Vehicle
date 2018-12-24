package com.example.administrator.vehicle.ui;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.example.administrator.vehicle.R;
import com.example.administrator.vehicle.base.BaseActivity;
import com.example.administrator.vehicle.bean.Code;
import com.example.administrator.vehicle.bean.Msg;
import com.example.administrator.vehicle.model.ModifyModelImp;
import com.example.administrator.vehicle.presenter.CodePresenterImp;
import com.example.administrator.vehicle.presenter.ModifyPresenterImp;
import com.example.administrator.vehicle.presenter.RegistrationPresenterImp;
import com.example.administrator.vehicle.util.Constan;
import com.example.administrator.vehicle.util.Toastor;
import com.example.administrator.vehicle.view.CodeView;
import com.example.administrator.vehicle.view.MsgView;

import java.util.HashMap;
import java.util.Map;

import butterknife.BindView;
import butterknife.OnClick;

public class RegisterActivity extends BaseActivity implements CodeView {


    @BindView(R.id.phone)
    EditText phone;
    @BindView(R.id.psw)
    EditText psw;
    @BindView(R.id.code)
    EditText code;
    @BindView(R.id.num)
    TextView num;
    @BindView(R.id.title)
    TextView title;
    @BindView(R.id.msg)
    TextView msg;
    CodePresenterImp codePresenterImp;
    ModifyPresenterImp modelImp;
    RegistrationPresenterImp presenterImp;
    int type = 0;
    ProgressDialog progressDialog;
    @Override
    protected int getContentView() {
        return R.layout.activity_register;
    }

    @Override
    protected void init(Bundle savedInstanceState) {
        initImp();
        type = getIntent().getIntExtra("type", -1);
        if (type == 1) {
            title.setText(R.string.register_title2);
            msg.setVisibility(View.GONE);
        }
        progressDialog = new ProgressDialog(this);
        //progressDialog.setTitle();
        progressDialog.setMessage(getString(R.string.dialog_msg));
        progressDialog.setCanceledOnTouchOutside(false);
        codePresenterImp = new CodePresenterImp(this, this);

    }


    @OnClick({R.id.register_left_iv, R.id.select_num, R.id.get_code, R.id.complete})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.register_left_iv:
                finish();
                break;
            case R.id.select_num:
                break;
            case R.id.get_code:
                codePresenterImp.GetCode(phone.getText().toString());
                break;
            case R.id.complete:
                progressDialog.show();
                Map<String, String> map = new HashMap<>();

                map.put("vc", code.getText().toString());
                if (type == 0) {
                    //注册
                    map.put("phoneNo", phone.getText().toString());
                    map.put("passWord", psw.getText().toString());
                    presenterImp.Registration(map);
                } else {
                    map.put("phone", phone.getText().toString());
                    map.put("newPassword", psw.getText().toString());
                    //忘记或修改密码
                    modelImp.Registration(map);
                }

                break;
        }
    }


    @Override
    public void disimissProgress() {
        progressDialog.dismiss();
    }


    @Override
    public void loadDataSuccess(Code tData) {
        toastor.showSingletonToast(Constan.getMsg(tData.getStatus()));
        Log.e("Code", tData.toString());
    }

    @Override
    public void loadDataError(Throwable throwable) {
        toastor.showSingletonToast("服务器连接失败");
    }

    private void initImp() {
        modelImp = new ModifyPresenterImp(new MsgView() {
            @Override
            public void disimissProgress() {
                progressDialog.dismiss();
            }

            @Override
            public void loadDataSuccess(Msg tData) {
                toastor.showSingletonToast(Constan.getMsg(tData.getStatus()));
                if (tData.getStatus() == 0) {
                    finish();
                }
            }

            @Override
            public void loadDataError(Throwable throwable) {
                progressDialog.dismiss();
                toastor.showSingletonToast("服务器连接失败");
            }
        }, this);

        presenterImp = new RegistrationPresenterImp(new MsgView() {
            @Override
            public void disimissProgress() {
                progressDialog.dismiss();
            }

            @Override
            public void loadDataSuccess(Msg tData) {
                toastor.showSingletonToast(Constan.getMsg(tData.getStatus()));
                if (tData.getStatus() == 0) {
                    finish();
                }
            }

            @Override
            public void loadDataError(Throwable throwable) {
                progressDialog.dismiss();
                toastor.showSingletonToast("服务器连接失败");
            }
        }, this);
    }
}
