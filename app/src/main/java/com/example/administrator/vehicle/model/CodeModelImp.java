package com.example.administrator.vehicle.model;

import android.content.Context;

import com.example.administrator.vehicle.api.ServiceApi;
import com.example.administrator.vehicle.base.BaseModel;
import com.example.administrator.vehicle.base.IBaseRequestCallBack;
import com.example.administrator.vehicle.bean.Code;


import io.reactivex.disposables.Disposable;

import rx.Observer;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;
import rx.subscriptions.CompositeSubscription;


public class CodeModelImp extends BaseModel {
    private Context context = null;
    private ServiceApi serviceApi;
    private CompositeSubscription mCompositeSubscription;

    public CodeModelImp(Context context) {
        this.context = context;
        serviceApi = retrofitManager.getService();
        mCompositeSubscription = new CompositeSubscription();
    }
    public void  getCode(String phone,final IBaseRequestCallBack<Code> iBaseRequestCallBack){
        mCompositeSubscription.add(serviceApi.getCode(phone)
                .observeOn(AndroidSchedulers.mainThread())//指定事件消费线程
                .subscribeOn(Schedulers.io())   //指定 subscribe() 发生在 IO 线程
                .subscribe(new Subscriber<Code>() {
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
                    public void onNext(Code code) {
                        iBaseRequestCallBack.requestSuccess(code);
                    }
                }));

    }

    public void onUnsubscribe() {
        mCompositeSubscription.unsubscribe();
    }
}
