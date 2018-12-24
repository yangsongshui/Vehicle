package com.example.administrator.vehicle.util;

/**
 * 描述:全局常量
 */
public class Constan {

    public static final String BASE_URL = "https://chejian.chehaode.com";


    /*请求码状态*/
    public static final String getMsg(int code) {
        String msg ;
        switch (code) {
            case 9999:
                msg = "Token无效,请重新登录获取最新token";
                break;
            case 999:
                msg = "参数不合格";
                break;
            case 998:
                msg = "用户名或密码错误";
                break;
            case 888:
                msg = "只能查询7天范围内的数据";
                break;
            case 887:
                msg = "查询时间范围为空，请输入查询时间范围";
                break;
            case 886:
                msg = "上传成功";
                break;
            case 885:
                msg = "该手机号码已经注册";
                break;
            case 884:
                msg = "不允许重复注册";
                break;
            case 883:
                msg = "设备ID已存在";
                break;
            case 882:
                msg = "上传失败:文件内容为空";
                break;
            case 881:
                msg = "用户不存在，如注册，请先绑定手机号";
                break;
            case 880:
                msg = "发送失败！请稍后重试";
                break;
            case 879:
                msg = "该用户角色不为普通用户，不允许成为您的业务员！";
                break;
            case 878:
                msg = "营业执照注册号输入错误！";
                break;
            case 877:
                msg = "该商家已被注册，不可重复注册！";
                break;
            case 876:
                msg = "设备未绑定业务员，无法接车！";
                break;
            case 875:
                msg = "商家文件获取失败！";
                break;
            case 874:
                msg = "仅允许普通用户、商家老板注册为商家！";
                break;
            case 873:
                msg = "仅允许普通用户、商家老板注册为商家！";
                break;
            case 102:
                msg = "请先获取验证码";
                break;
            case 101:
                msg = "验证码无效，请重新获取";
                break;
            case 100:
                msg = "发送失败！请稍后重试";
                break;
            case -1:
                msg = "系统异常(获取异常信息并打印)";
                break;
            case 0:
                msg = "成功";
                break;
            default:
                msg = "失败";
                break;
        }
        return msg;

    }
}
