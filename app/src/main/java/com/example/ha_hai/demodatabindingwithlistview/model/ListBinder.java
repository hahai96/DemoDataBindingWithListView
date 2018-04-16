package com.example.ha_hai.demodatabindingwithlistview.model;

import android.databinding.BindingAdapter;
import android.databinding.ObservableArrayList;
import android.widget.ListAdapter;
import android.widget.ListView;

import com.example.ha_hai.demodatabindingwithlistview.R;
import com.example.ha_hai.demodatabindingwithlistview.adapter.UserAdapter;

/**
 * Created by ha_hai on 4/16/2018.
 */

public class ListBinder {
    @BindingAdapter("bind:items")
    public static void bindList(ListView listView, ObservableArrayList<User> list) {
        UserAdapter adapter = new UserAdapter(list);
        listView.setAdapter(adapter);
    }
}
