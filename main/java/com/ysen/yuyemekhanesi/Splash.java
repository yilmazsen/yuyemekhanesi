package com.ysen.yuyemekhanesi;

import android.content.Intent;
import android.os.Bundle;

import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by ysen on 23/07/2017.
 */

public class Splash extends AppCompatActivity {
    public static final int time=2000;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent=new Intent(Splash.this,MainActivity.class);
                Splash.this.finishAffinity();
                startActivity(intent);
            }
        },time);

    }
}
