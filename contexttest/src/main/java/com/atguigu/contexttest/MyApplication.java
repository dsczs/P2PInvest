package com.atguigu.contexttest;

import android.app.Application;
import android.util.Log;

/**
 * Created by shkstart on 2016/12/5 0005.
 */
public class MyApplication extends Application {

    private String data;

    public MyApplication() {
        Log.e("TAG", "MyApplication MyApplication()");
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        Log.e("TAG", "MyApplication onCreate()");
    }
}
