package com.example.administrator.vehicle.base;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.util.TypedValue;

import com.example.administrator.vehicle.util.Toastor;

import butterknife.ButterKnife;


public abstract class BaseActivity extends AppCompatActivity {
    //添加到活动管理集合中
    public Toastor toastor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        setContentView(getContentView());
        toastor=new Toastor(this);
        ButterKnife.bind(this);
        //用于显示当前位于哪个活动
        Log.d("BaseActivity", getClass().getSimpleName());
        init(savedInstanceState);
    }




    //注入布局
    protected abstract int getContentView();

    //初始化
    protected abstract void init(Bundle savedInstanceState);

    // dp转px
    protected int dp2px(int dp) {
        return (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, dp,
                getResources().getDisplayMetrics());
    }

}
