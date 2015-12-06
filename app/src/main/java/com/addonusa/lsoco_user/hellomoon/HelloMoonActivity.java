package com.addonusa.lsoco_user.hellomoon;

import android.os.Bundle;
import android.app.Activity;
import android.support.v4.app.FragmentActivity;

public class HelloMoonActivity extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello_moon);
    }

    public void testNewMethod() {
        // do smth
    }

}
