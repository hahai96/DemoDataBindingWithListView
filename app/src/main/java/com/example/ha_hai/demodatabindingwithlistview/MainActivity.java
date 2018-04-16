package com.example.ha_hai.demodatabindingwithlistview;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.ha_hai.demodatabindingwithlistview.databinding.ActivityMainBinding;
import com.example.ha_hai.demodatabindingwithlistview.model.ListUserInfo;

public class MainActivity extends AppCompatActivity {

    ListUserInfo userInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActivityMainBinding mainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        userInfo = new ListUserInfo();
        mainBinding.setInfors(userInfo);
    }
}
