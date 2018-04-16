package com.example.ha_hai.demodatabindingwithlistview.model;

import android.databinding.ObservableArrayList;
import android.util.Log;
import android.view.View;

import java.util.Random;

/**
 * Created by ha_hai on 4/14/2018.
 */

public class ListUserInfo {

    public ObservableArrayList<User> list = new ObservableArrayList<>();
    private int total = 500;
    Random random = new Random();

    public ListUserInfo() {
        getAllInfo();
    }

    public void getAllInfo() {
        for (int i = 0; i < total; i++) {
            String name = "Ten " + i;
            String phone = "097" + random.nextInt(7);
            User user = new User(name, phone);
            list.add(user);
        }
    }

    public void add(View view) {
        Log.d("Add", "add");
        String name = "Ten " + (list.size() + 1);
        String phone = "097" + random.nextInt(7);
        User user = new User(name, phone);
        list.add(user);
    }

    public void remove(View view) {
        if (!list.isEmpty()) {
            list.remove(0);
        }
    }
}
