package com.dmitrymalkovich.android.popularmoviesapp;

import android.app.Application;

import com.contentsquare.android.ContentSquare;

public class MainApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        ContentSquare.startWithProjectId(getApplicationContext(), "popularmoviesapp");
    }
}
