package com.example.administrator.vehicle.presenter;

import android.content.Context;

import com.example.administrator.vehicle.base.BasePresenterImp;
import com.example.administrator.vehicle.bean.Code;
import com.example.administrator.vehicle.bean.User;
import com.example.administrator.vehicle.model.CodeModelImp;
import com.example.administrator.vehicle.model.LoginModelImp;
import com.example.administrator.vehicle.view.CodeView;
import com.example.administrator.vehicle.view.UserView;

public class LoginPresenterImp extends BasePresenterImp<UserView, User> {
    private Context context = null;
    private LoginModelImp loginModelImp = null;
    /**
     * @param view 具体业务的视图接口对象
     * @descriptoin 构造方法
     * @author ys
     * @date 2017/6/13 15:12
     */
    public LoginPresenterImp(UserView view, Context context) {
        super(view);
        this.context = context;
        this.loginModelImp = new LoginModelImp(context);
    }

    public void Login(String phone,String passWord) {

        loginModelImp.getCode(phone, passWord, this);

    }

    public void unSubscribe() {
        loginModelImp.onUnsubscribe();
    }
}
