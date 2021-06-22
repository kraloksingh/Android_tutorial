package com.example.numaiappea;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    private Object TabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // TabLayout Call
        TabLayout tabLayout = (com.google.android.material.tabs.TabLayout) findViewById(R.id.tab_layout);
        tabLayout.addTab(tabLayout.newTab().setText(R.string.crop_plan));
        tabLayout.addTab(tabLayout.newTab().setText(R.string.clout_e_shop));
        tabLayout.addTab(tabLayout.newTab().setText(R.string.crop_soil_health));
        tabLayout.addTab(tabLayout.newTab().setText(R.string.explor_xpace));

        tabLayout.addOnTabSelectedListener();


        // TabLayout Call with xml declaration
        /*
        TabLayout tabLayout1;
        tabLayout.addTab(tabLayout1.newTab().setText("Tab 1"));
        tabLayout.addTab(tabLayout1.newTab().setText("Tab 2"));
        tabLayout.addTab(tabLayout1.newTab().setText("Tab 3"));
         */

    }
}