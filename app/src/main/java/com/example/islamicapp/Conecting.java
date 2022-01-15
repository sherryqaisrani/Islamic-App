package com.example.islamicapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.google.android.material.tabs.TabLayout;

public class Conecting extends AppCompatActivity {

    TabLayout tabLayout;
    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conecting);

        tabLayout=findViewById(R.id.tab);
        viewPager=findViewById(R.id.pagerview);
        Bundle bundle=getIntent().getExtras();
        String b=bundle.getString("First");
        String msg= bundle.getString("second");
        String urd=bundle.getString("third");
        Toast.makeText(Conecting.this,""+b,Toast.LENGTH_LONG).show();

        MyAdapter adapter= new MyAdapter(getSupportFragmentManager(),getApplicationContext());
       Bundle bundle1=new Bundle();
       bundle1.putString("First",b);
       Arabic arabic = new Arabic();
       arabic.setArguments(bundle1);


       Bundle bundle2=new Bundle();
       bundle2.putString("second",msg);
       bundle2.putString("third",urd);
       English english = new English();
       english.setArguments(bundle2);






        adapter.SwipeFragment(arabic, "Arabic");
        adapter.SwipeFragment(english, "English");
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);
    }
}