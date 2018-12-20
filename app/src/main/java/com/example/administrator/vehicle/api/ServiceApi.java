package com.example.administrator.vehicle.api;


import com.example.administrator.vehicle.bean.Code;
import com.example.administrator.vehicle.bean.Msg;
import com.example.administrator.vehicle.bean.User;

import java.util.Map;

import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;
import rx.Observable;


/**
 * 描述：retrofit的接口service定义
 */
public interface ServiceApi {
    //获取验证码
    @POST("/appuser/sendSMS?")
    Observable<Code> getCode(@Query("phone") String phoneNumber);
    //注册
    @POST("/appregistration/phoneRegistration?")
    Observable<Msg> phoneRegistration(@QueryMap Map<String, String> map );
    //登录
    @POST("/jwt/auth?")
    Observable<User> Login(@Query("loginId") String loginId,@Query("passWord") String passWord);
}
