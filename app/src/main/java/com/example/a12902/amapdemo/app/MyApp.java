package com.example.a12902.amapdemo.app;

import android.app.Application;

public class MyApp extends Application {
    private static MyApp instance;
    @Override
    public void onCreate() {
        super.onCreate();
        instance=this;
    }

    public static MyApp getInstance(){
        return instance;
    }
}
