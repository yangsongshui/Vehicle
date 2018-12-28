package com.example.administrator.vehicle.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.administrator.vehicle.R;
import com.example.administrator.vehicle.base.BaseActivity;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class SettingActivity extends BaseActivity {


    @Override
    protected int getContentView() {
        return R.layout.activity_setting;
    }

    @Override
    protected void init(Bundle savedInstanceState) {

    }

    @OnClick({R.id.register_left_iv, R.id.set_msg, R.id.set_msg2, R.id.set_msg3, R.id.set_msg4, R.id.set_msg5, R.id.set_msg6, R.id.set_msg7})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.register_left_iv:
                finish();
                break;
            case R.id.set_msg:
                startActivity(new Intent(this,MyInfoActivity.class));
                break;
            case R.id.set_msg2:
                break;
            case R.id.set_msg3:
                break;
            case R.id.set_msg4:
                break;
            case R.id.set_msg5:
                break;
            case R.id.set_msg6:
                break;
            case R.id.set_msg7:
                break;
        }
    }
}
