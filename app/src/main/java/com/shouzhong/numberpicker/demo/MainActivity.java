package com.shouzhong.numberpicker.demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.shouzhong.numberpicker.NumberPicker;

public class MainActivity extends AppCompatActivity {

    private NumberPicker np1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        np1 = findViewById(R.id.np1);
        np1.setMaxValue(2100);
        np1.setMinValue(2000);
    }
}
