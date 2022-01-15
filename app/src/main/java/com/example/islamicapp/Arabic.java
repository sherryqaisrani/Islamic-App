package com.example.islamicapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


public class Arabic extends Fragment {
    TextView textView;




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_arabic, container, false);


        String text=getArguments().getString("First");
        textView= view.findViewById(R.id.imge);
        textView.setText(text);

       /* switch (getId())
        {
            case 0:
                textView.setImageResource(pics[0]);
                break;
            case 1:
                imageView.setImageResource(pics[1]);
                break;
            case 2:
                imageView.setImageResource(pics[2]);
                break;
            case 3:
                imageView.setImageResource(pics[3]);
                break;
            case 4:
                imageView.setImageResource(pics[4]);
                break;
            case 5:
                imageView.setImageResource(pics[5]);
                break;
        }*/


        return view;
    }

}
