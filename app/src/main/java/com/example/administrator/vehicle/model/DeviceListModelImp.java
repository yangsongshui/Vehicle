package com.example.administrator.vehicle.model;

import android.content.Context;

import com.example.administrator.vehicle.api.ServiceApi;
import com.example.administrator.vehicle.app.MyApplication;
import com.example.administrator.vehicle.base.BaseModel;
import com.example.administrator.vehicle.base.IBaseRequestCallBack;
import com.example.administrator.vehicle.bean.Device;
import com.example.administrator.vehicle.bean.Msg;

import java.util.Map;

import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;
import rx.subscriptions.CompositeSubscription;

public class DeviceListModelImp extends BaseModel {
    private Context context = null;
    private ServiceApi serviceApi;
    private CompositeSubscription mCompositeSubscription;

    public DeviceListModelImp(Context context) {
        this.context = context;
        serviceApi = retrofitManager.getService();
        mCompositeSubscription = new CompositeSubscription();
    }
    public void  deviceList(String consumerCode ,final IBaseRequestCallBack<Device> iBaseRequestCallBack){
        mCompositeSubscription.add(serviceApi.deviceList(consumerCode,MyApplication.newInstance().getToken())
                .observeOn(AndroidSchedulers.mainThread())//指定事件消费线程
                .subscribeOn(Schedulers.io())   //指定 subscribe() 发生在 IO 线程
                .subscribe(new Subscriber<Device>() {
                    @Override
                    public void onCompleted() {
                        iBaseRequestCallBack.requestComplete();
                    }

                    @Override
                    public void onError(Throwable e) {
                        //回调接口：请求异常
                        iBaseRequestCallBack.requestError(e);
                    }

                    @Override
                    public void onNext(Device device) {
                        iBaseRequestCallBack.requestSuccess(device);
                    }
                }));
    }

    public void onUnsubscribe() {
        mCompositeSubscription.unsubscribe();
    }
}
