package com.example.islamicapp;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.cardview.widget.CardView;

public class GridAdapter extends BaseAdapter {
    Context context;
    LayoutInflater inflater;
    int []pics;
    String []texts;

    public GridAdapter(Context context, int[] pics, String[] texts) {
        this.context = context;
        inflater = LayoutInflater.from(context);
        this.pics = pics;
        this.texts = texts;
    }

    @Override
    public int getCount() {
        return pics.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(final int position, View convertView, final ViewGroup parent) {
        convertView=inflater.inflate(R.layout.custom_file, null);
        final ImageView imageView=convertView.findViewById(R.id.imgid);

        imageView.setImageResource(pics[position]);


        convertView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (position==0)
                {
                  context.startActivity(new Intent(context,MainActivity.class));
                }
                else if (position==1)
                {
                    context.startActivity(new Intent(context,MasnoonDuayn.class));
                }
                else if (position==2)
                {
                    context.startActivity(new Intent(context,Hadith.class));
                }
                else if (position==3)
                {
                    context.startActivity(new Intent(context,MainActivity.class));
                }
            }
        });

        return convertView;
    }
}
