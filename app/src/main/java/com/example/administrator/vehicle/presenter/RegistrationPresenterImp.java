package com.example.administrator.vehicle.presenter;

import android.content.Context;

import com.example.administrator.vehicle.base.BasePresenterImp;
import com.example.administrator.vehicle.bean.Code;
import com.example.administrator.vehicle.bean.Msg;
import com.example.administrator.vehicle.model.CodeModelImp;
import com.example.administrator.vehicle.model.RegistrationModelImp;
import com.example.administrator.vehicle.view.CodeView;
import com.example.administrator.vehicle.view.MsgView;

import java.util.Map;

public class RegistrationPresenterImp extends BasePresenterImp<MsgView, Msg> {
    private Context context = null;
    private RegistrationModelImp presenterImp = null;
    /**
     * @param view 具体业务的视图接口对象
     * @descriptoin 构造方法
     * @author ys
     * @date 2017/6/13 15:12
     */
    public RegistrationPresenterImp(MsgView view, Context context) {
        super(view);
        this.context = context;
        this.presenterImp = new RegistrationModelImp(context);
    }

    public void Registration(Map<String, String> map ) {

        presenterImp.registration(map, this);

    }

    public void unSubscribe() {
        presenterImp.onUnsubscribe();
    }
}
