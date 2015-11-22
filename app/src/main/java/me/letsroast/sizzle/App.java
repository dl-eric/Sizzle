package me.letsroast.sizzle;

import android.app.Application;

import com.parse.Parse;

/**
 * Created by Orang on 11/22/2015.
 */
public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        // Enable Parse local data store.
        Parse.enableLocalDatastore(this);

        // Initialize Parse
        Parse.initialize(this,
                "ITBX0xVookLOeoIB7FTKm8OFrxa5D7oZ22Meij4I", // Parse Application ID
                "ymB28zhf7GOe6YjsFEuij6mVfJabk3Mq9OpQM2vx"); // Parse Client Key
    }
}
