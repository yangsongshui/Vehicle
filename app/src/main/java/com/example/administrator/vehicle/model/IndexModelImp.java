package com.example.administrator.vehicle.model;

import android.content.Context;

import com.example.administrator.vehicle.api.ServiceApi;
import com.example.administrator.vehicle.app.MyApplication;
import com.example.administrator.vehicle.base.BaseModel;
import com.example.administrator.vehicle.base.IBaseRequestCallBack;
import com.example.administrator.vehicle.bean.Device;
import com.example.administrator.vehicle.bean.DeviceInfo;
import com.example.administrator.vehicle.bean.Msg;

import java.util.Map;

import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;
import rx.subscriptions.CompositeSubscription;

public class IndexModelImp extends BaseModel {
    private Context context = null;
    private ServiceApi serviceApi;
    private CompositeSubscription mCompositeSubscription;

    public IndexModelImp(Context context) {
        this.context = context;
        serviceApi = retrofitManager.getService();
        mCompositeSubscription = new CompositeSubscription();
    }
    public void  getIndext(String deviceId, String frameNo ,final IBaseRequestCallBack<DeviceInfo> iBaseRequestCallBack){
        mCompositeSubscription.add(serviceApi.getIndext(deviceId,frameNo,MyApplication.newInstance().getToken())
                .observeOn(AndroidSchedulers.mainThread())//指定事件消费线程
                .subscribeOn(Schedulers.io())   //指定 subscribe() 发生在 IO 线程
                .subscribe(new Subscriber<DeviceInfo>() {
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
                    public void onNext(DeviceInfo deviceInfo) {
                        iBaseRequestCallBack.requestSuccess(deviceInfo);
                    }
                }));
    }

    public void onUnsubscribe() {
        mCompositeSubscription.unsubscribe();
    }
}
