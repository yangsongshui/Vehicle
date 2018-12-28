package com.example.administrator.vehicle.ui;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.administrator.vehicle.R;
import com.example.administrator.vehicle.base.BaseActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import de.hdodenhof.circleimageview.CircleImageView;

public class MyInfoActivity extends BaseActivity {


    @BindView(R.id.me_pic)
    CircleImageView mePic;
    @BindView(R.id.my_name)
    TextView myName;
    @BindView(R.id.my_bir)
    TextView myBir;
    @BindView(R.id.my_sex)
    TextView mySex;
    @BindView(R.id.my_address)
    TextView myAddress;
    @BindView(R.id.my_msg)
    TextView myMsg;

    @Override
    protected int getContentView() {
        return R.layout.activity_my_info;
    }

    @Override
    protected void init(Bundle savedInstanceState) {

    }



    @OnClick({R.id.register_left_iv, R.id.my_msg1, R.id.my_msg2, R.id.my_msg3, R.id.my_msg4, R.id.my_msg5, R.id.my_msg6})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.register_left_iv:
                finish();
                break;
            case R.id.my_msg1:
                break;
            case R.id.my_msg2:
                break;
            case R.id.my_msg3:
                break;
            case R.id.my_msg4:
                break;
            case R.id.my_msg5:
                break;
            case R.id.my_msg6:
                break;
        }
    }
}
