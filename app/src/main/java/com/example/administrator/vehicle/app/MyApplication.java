package com.example.administrator.vehicle.app;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.pm.PackageManager;


import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestManager;
import com.example.administrator.vehicle.bean.User;
import com.example.administrator.vehicle.util.AppContextUtil;
import com.example.administrator.vehicle.util.Log;
import com.example.administrator.vehicle.util.SpUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;


public class MyApplication extends Application {
    private static final String TAG = "MyApplication";

    private static MyApplication instance;
    public static List<Activity> activitiesList = new ArrayList<Activity>(); // 活动管理集合
    public User user;
    public static Map<String, Integer> mMap = new HashMap<>();
    private String token;

    /**
     * 获取单例
     *
     * @return MyApplication
     */
    public static MyApplication newInstance() {
        return instance;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
        user = new User();
        if (user.getData() == null)
            user.setData(new User.DataBean());
        AppContextUtil.init(this);
        SpUtils.init(this);
        Log.isPrint=true;
    }

    public RequestManager getGlide() {

        return Glide.with(this);


    }


    public int getWeather(String key) {
        return mMap.get(key);
    }

    /**
     * 把活动添加到活动管理集合
     *
     * @param activity
     */
    public void addActyToList(Activity activity) {
        if (!activitiesList.contains(activity))
            activitiesList.add(activity);
    }

    /**
     * 把活动从活动管理集合移除
     *
     * @param activity
     */
    public void removeActyFromList(Activity activity) {
        if (activitiesList.contains(activity))
            activitiesList.remove(activity);
    }

    /**
     * 程序退出
     */
    public void clearAllActies() {
        for (Activity acty : activitiesList) {
            if (acty != null)
                acty.finish();
        }
        /*try {
            System.exit(0);
		} catch (Exception e) {
			e.printStackTrace();
		}*/
    }


    public void setUser(User user) {
        this.user = user;
        Log.e("user", this.user.toString());
        setToken(user.getData().getToken());

    }


    public User getUser() {
        return user;
    }

    public void outLogin() {
        user = null;
        SpUtils.putString("phone", "");
        SpUtils.putString("password", "");

    }


    private String getAppName(int pID) {
        String processName = null;
        ActivityManager am = (ActivityManager) this.getSystemService(ACTIVITY_SERVICE);
        List l = am.getRunningAppProcesses();
        Iterator i = l.iterator();
        PackageManager pm = this.getPackageManager();
        while (i.hasNext()) {
            ActivityManager.RunningAppProcessInfo info = (ActivityManager.RunningAppProcessInfo) (i.next());
            try {
                if (info.pid == pID) {
                    processName = info.processName;
                    return processName;
                }
            } catch (Exception e) {
                // Log.d("Process", "Error>> :"+ e.toString());
            }
        }
        return processName;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = "CheJianToken"+token;
    }
}
