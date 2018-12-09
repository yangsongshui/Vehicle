package com.example.administrator.vehicle.ui;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.example.administrator.vehicle.R;
import com.example.administrator.vehicle.base.BaseActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends BaseActivity {


    @BindView(R.id.num)
    TextView num;
    @BindView(R.id.phone)
    EditText phone;
    @BindView(R.id.psw)
    EditText psw;

    @Override
    protected int getContentView() {
        return R.layout.activity_main;
    }

    @Override
    protected void init(Bundle savedInstanceState) {

    }



    @OnClick({R.id.select_num, R.id.login, R.id.login_register, R.id.login_forget})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.select_num:
                break;
            case R.id.login:
                break;
            case R.id.login_register:
                break;
            case R.id.login_forget:
                break;
        }
    }
}
