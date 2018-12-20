package com.example.administrator.vehicle.presenter;

import android.content.Context;

import com.example.administrator.vehicle.base.BasePresenterImp;
import com.example.administrator.vehicle.bean.Code;
import com.example.administrator.vehicle.model.CodeModelImp;
import com.example.administrator.vehicle.view.CodeView;

public class CodePresenterImp extends BasePresenterImp<CodeView, Code> {
    private Context context = null;
    private CodeModelImp codeModelImp = null;
    /**
     * @param view 具体业务的视图接口对象
     * @descriptoin 构造方法
     * @author ys
     * @date 2017/6/13 15:12
     */
    public CodePresenterImp(CodeView view, Context context) {
        super(view);
        this.context = context;
        this.codeModelImp = new CodeModelImp(context);
    }

    public void GetCode(String phone) {

        codeModelImp.getCode(phone, this);

    }

    public void unSubscribe() {
        codeModelImp.onUnsubscribe();
    }
}
