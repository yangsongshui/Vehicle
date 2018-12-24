package com.example.administrator.vehicle.model;

import android.content.Context;

import com.example.administrator.vehicle.api.ServiceApi;
import com.example.administrator.vehicle.app.MyApplication;
import com.example.administrator.vehicle.base.BaseModel;
import com.example.administrator.vehicle.base.IBaseRequestCallBack;
import com.example.administrator.vehicle.bean.Msg;

import java.util.Map;

import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;
import rx.subscriptions.CompositeSubscription;

public class BindingModelImp extends BaseModel {
    private Context context = null;
    private ServiceApi serviceApi;
    private CompositeSubscription mCompositeSubscription;

    public BindingModelImp(Context context) {
        this.context = context;
        serviceApi = retrofitManager.getService();
        mCompositeSubscription = new CompositeSubscription();
    }
    public void  userBindingDevice(Map<String, String> map ,final IBaseRequestCallBack<Msg> iBaseRequestCallBack){
        mCompositeSubscription.add(serviceApi.userBindingDevice(map,MyApplication.newInstance().getToken())
                .observeOn(AndroidSchedulers.mainThread())//指定事件消费线程
                .subscribeOn(Schedulers.io())   //指定 subscribe() 发生在 IO 线程
                .subscribe(new Subscriber<Msg>() {
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
                    public void onNext(Msg msg) {
                        iBaseRequestCallBack.requestSuccess(msg);
                    }
                }));
    }

    public void onUnsubscribe() {
        mCompositeSubscription.unsubscribe();
    }
}
