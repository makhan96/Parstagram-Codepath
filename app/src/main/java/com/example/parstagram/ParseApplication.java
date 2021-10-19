package com.example.parstagram;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        // Register your parse models
        ParseObject.registerSubclass(Post.class);
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("KaKNEXKOlQNH0POxrJw2RVgIjlX8cEZtoiEmwVdv")
                .clientKey("Q57DGziRajrRVGrabi4qm06FlZnDDWiUesPd5ojf")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
