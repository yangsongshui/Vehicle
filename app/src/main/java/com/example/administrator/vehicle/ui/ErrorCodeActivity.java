package com.example.administrator.vehicle.ui;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

import com.example.administrator.vehicle.R;
import com.example.administrator.vehicle.adapter.ErroerAdapter;
import com.example.administrator.vehicle.adapter.QuAdapter;
import com.example.administrator.vehicle.base.BaseActivity;
import com.example.administrator.vehicle.bean.Appmoments;
import com.example.administrator.vehicle.bean.ErroerCode;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class ErrorCodeActivity extends BaseActivity {


    @BindView(R.id.error_msg)
    TextView errorMsg;
    @BindView(R.id.error_rv)
    RecyclerView errorRv;
    ErroerAdapter adapter;
    @Override
    protected int getContentView() {
        return R.layout.activity_error_code;
    }

    @Override
    protected void init(Bundle savedInstanceState) {
        int text = getIntent().getIntExtra("name", -1);
        errorMsg.setText(text);
        List<ErroerCode> mList=new ArrayList<>();
        RecyclerView.LayoutManager  mLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        errorRv.setLayoutManager(mLayoutManager);
        mList.add(new ErroerCode("探测到随机/多缸失火","P0300","异常"));
        mList.add(new ErroerCode("探测到第2缸失火","P0300","异常"));
        mList.add(new ErroerCode("探测到第4缸失火","P0300","异常"));
        mList.add(new ErroerCode("探测到第6缸失火","P0300","异常"));
        adapter=new ErroerAdapter(mList,this);
        errorRv.setAdapter(adapter);
    }



    @OnClick(R.id.register_left_iv)
    public void onViewClicked() {
        finish();
    }
}
