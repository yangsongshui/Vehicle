package com.example.administrator.vehicle.presenter;

import android.content.Context;

import com.example.administrator.vehicle.base.BasePresenterImp;
import com.example.administrator.vehicle.bean.Code;
import com.example.administrator.vehicle.bean.DeviceInfo;
import com.example.administrator.vehicle.model.CodeModelImp;
import com.example.administrator.vehicle.model.IndexModelImp;
import com.example.administrator.vehicle.view.CodeView;
import com.example.administrator.vehicle.view.DeviceInfoView;

public class IndexPresenterImp extends BasePresenterImp<DeviceInfoView, DeviceInfo> {
    private Context context = null;
    private IndexModelImp indexModelImp = null;
    /**
     * @param view 具体业务的视图接口对象
     * @descriptoin 构造方法
     * @author ys
     * @date 2017/6/13 15:12
     */
    public IndexPresenterImp(DeviceInfoView view, Context context) {
        super(view);
        this.context = context;
        this.indexModelImp = new IndexModelImp(context);
    }

    public void GetIndex(String deviceId, String frameNo) {

        indexModelImp.getIndext( deviceId,  frameNo, this);

    }

    public void unSubscribe() {
        indexModelImp.onUnsubscribe();
    }
}
