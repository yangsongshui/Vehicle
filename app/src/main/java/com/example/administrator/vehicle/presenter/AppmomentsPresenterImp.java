package com.example.administrator.vehicle.presenter;

import android.content.Context;

import com.example.administrator.vehicle.base.BasePresenterImp;
import com.example.administrator.vehicle.bean.Appmoments;
import com.example.administrator.vehicle.bean.Msg;
import com.example.administrator.vehicle.model.AppmomentsModelImp;
import com.example.administrator.vehicle.model.BindingModelImp;
import com.example.administrator.vehicle.view.AppmomentsView;
import com.example.administrator.vehicle.view.MsgView;

import java.util.Map;

public class AppmomentsPresenterImp extends BasePresenterImp<AppmomentsView, Appmoments> {
    private Context context = null;
    private AppmomentsModelImp appmomentsModelImp = null;
    /**
     * @param view 具体业务的视图接口对象
     * @descriptoin 构造方法
     * @author ys
     * @date 2017/6/13 15:12
     */
    public AppmomentsPresenterImp(AppmomentsView view, Context context) {
        super(view);
        this.context = context;
        this.appmomentsModelImp = new AppmomentsModelImp(context);
    }

    public void Registration(Map<String, String> map ) {

        appmomentsModelImp.appmoments(map, this);

    }

    public void unSubscribe() {
        appmomentsModelImp.onUnsubscribe();
    }
}
