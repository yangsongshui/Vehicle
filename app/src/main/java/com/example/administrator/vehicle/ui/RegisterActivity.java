package com.example.administrator.vehicle.ui;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.example.administrator.vehicle.R;
import com.example.administrator.vehicle.base.BaseActivity;

import butterknife.BindView;
import butterknife.OnClick;

public class RegisterActivity extends BaseActivity {


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

    @Override
    protected int getContentView() {
        return R.layout.activity_register;
    }

    @Override
    protected void init(Bundle savedInstanceState) {
        int type = getIntent().getIntExtra("type", -1);
        if (type == 1) {
            title.setText(R.string.register_title2);
            msg.setVisibility(View.GONE);
        }
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
                break;
            case R.id.complete:
                break;
        }
    }


}
