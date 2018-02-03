package com.example.nehru.binar.config;

import android.app.Application;

import com.activeandroid.ActiveAndroid;

/**
 * Created by nehru on 03/02/2018.
 */

public class AppConfig extends Application{

    @Override
    public void onCreate() {
        super.onCreate();
        ActiveAndroid.initialize(this);
    }
}
