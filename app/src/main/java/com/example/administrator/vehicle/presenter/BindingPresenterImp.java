package com.example.administrator.vehicle.presenter;

import android.content.Context;

import com.example.administrator.vehicle.base.BasePresenterImp;
import com.example.administrator.vehicle.bean.Msg;
import com.example.administrator.vehicle.model.BindingModelImp;
import com.example.administrator.vehicle.model.ModifyModelImp;
import com.example.administrator.vehicle.view.MsgView;

import java.util.Map;

public class BindingPresenterImp extends BasePresenterImp<MsgView, Msg> {
    private Context context = null;
    private BindingModelImp bindingModelImp = null;
    /**
     * @param view 具体业务的视图接口对象
     * @descriptoin 构造方法
     * @author ys
     * @date 2017/6/13 15:12
     */
    public BindingPresenterImp(MsgView view, Context context) {
        super(view);
        this.context = context;
        this.bindingModelImp = new BindingModelImp(context);
    }

    public void Registration(Map<String, String> map ) {

        bindingModelImp.userBindingDevice(map, this);

    }

    public void unSubscribe() {
        bindingModelImp.onUnsubscribe();
    }
}
