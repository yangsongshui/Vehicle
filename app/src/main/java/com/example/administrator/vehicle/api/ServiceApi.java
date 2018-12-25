package com.example.administrator.vehicle.api;


import com.example.administrator.vehicle.bean.Appmoments;
import com.example.administrator.vehicle.bean.Code;
import com.example.administrator.vehicle.bean.Device;
import com.example.administrator.vehicle.bean.DeviceInfo;
import com.example.administrator.vehicle.bean.Msg;
import com.example.administrator.vehicle.bean.User;

import java.util.Map;

import retrofit2.http.Header;
import retrofit2.http.Headers;
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
    //修改密码
    @POST("/appuser/modifyPwd?")
    Observable<Msg> modifyPwd(@QueryMap Map<String, String> map);
    //首页数据
    @POST("/appuser/index")
    Observable<DeviceInfo> getIndext(@Query("deviceId") String deviceId, @Query("frameNo") String frameNo, @Header("Authorization") String token);
    //设备列表
    @POST("/appuser/deviceList")
    Observable<Device> deviceList(@Query("consumerCode") String consumerCode, @Header("Authorization") String token);
    //绑定设备
    @POST("/appmerchants/userBindingDevice")
    Observable<Msg> userBindingDevice(@QueryMap Map<String, String> map,@Header("Authorization") String token);

    @POST("/appmoments/list")
    Observable<Appmoments> appmoments(@QueryMap Map<String, String> map, @Header("Authorization") String token);
}
