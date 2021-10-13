package com.example.myapplication;

import android.app.Application;
import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("ayC2kCPdJXO6aRp5e1qI01XrBTdsuvGnQkjW6k4y")
                .clientKey("ykorT4szp7ZssEMAG4NLQYgXCG70Z4wUXw76MKWt")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
