package me.letsroast.sizzle.Activities;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.parse.Parse;

import me.letsroast.sizzle.R;

public class SplashActivity extends AppCompatActivity {

    // Duration of wait in milliseconds
    private final int SPLASH_DISPLAY_LENGTH = 2500;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        // Enable Parse local data store.
        Parse.enableLocalDatastore(this);
        Parse.initialize(this,
                "ITBX0xVookLOeoIB7FTKm8OFrxa5D7oZ22Meij4I", // Parse Application ID
                "ymB28zhf7GOe6YjsFEuij6mVfJabk3Mq9OpQM2vx"); // Parse Client Key

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                // Create an Intent that will start the Menu-Activity.
                Intent intent = new Intent(SplashActivity.this, MainActivity.class);
                SplashActivity.this.startActivity(intent);
                SplashActivity.this.finish();
            }
        }, SPLASH_DISPLAY_LENGTH);
    }
}
