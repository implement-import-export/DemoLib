package com.earneasy.demolib;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.toasty.Toaster;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toaster.simpleToast(this, "Lag gyi!");

    }
}