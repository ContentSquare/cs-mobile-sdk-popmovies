package com.dmitrymalkovich.android.popularmoviesapp;

import android.app.Application;

import com.contentsquare.android.ContentSquare;
import com.crashlytics.android.Crashlytics;
import io.fabric.sdk.android.Fabric;

public class MainApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Fabric.with(this, new Crashlytics());
        ContentSquare.startWithProjectId(getApplicationContext(), "popularmoviesapp");
    }
}
