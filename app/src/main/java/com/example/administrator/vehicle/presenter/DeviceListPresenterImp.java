package com.example.administrator.vehicle.presenter;

import android.content.Context;

import com.example.administrator.vehicle.base.BasePresenterImp;
import com.example.administrator.vehicle.bean.Device;
import com.example.administrator.vehicle.bean.Msg;
import com.example.administrator.vehicle.model.BindingModelImp;
import com.example.administrator.vehicle.model.DeviceListModelImp;
import com.example.administrator.vehicle.view.DeviceView;
import com.example.administrator.vehicle.view.MsgView;

import java.util.Map;

public class DeviceListPresenterImp extends BasePresenterImp<DeviceView, Device> {
    private Context context = null;
    private DeviceListModelImp deviceListModelImp = null;

    /**
     * @param view 具体业务的视图接口对象
     * @descriptoin 构造方法
     * @author ys
     * @date 2017/6/13 15:12
     */
    public DeviceListPresenterImp(DeviceView view, Context context) {
        super(view);
        this.context = context;
        this.deviceListModelImp = new DeviceListModelImp(context);
    }

    public void Registration(String consumerCode) {

        deviceListModelImp.deviceList(consumerCode, this);

    }

    public void unSubscribe() {
        deviceListModelImp.onUnsubscribe();
    }
}
