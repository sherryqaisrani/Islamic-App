package com.example.islamicapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

public class DashBoard extends AppCompatActivity {
    GridView gridView;

    int [] pics={R.drawable.kalmas,R.drawable.namaz,R.drawable.hadees,R.drawable.opened};
    String [] texts={};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dash_board);

        gridView=findViewById(R.id.gridview);

        GridAdapter adapter=new GridAdapter(DashBoard.this,pics,texts);
        gridView.setAdapter(adapter);
    }
}