package com.carry.httprequest.comm;

import android.app.Application;

import com.carry.httprequest.http.HttpMethods;

public class MobileShopApp  extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        HttpMethods.getInstance();
    }
}
