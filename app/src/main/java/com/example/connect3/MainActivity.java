package com.example.connect3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void fadeIn(View view){
        ImageView counter = (ImageView) view;
        counter.setTranslationY(-1000f);
        counter.setImageResource(R.drawable.yellow);
        counter.animate().translationYBy(1000f).setDuration(500);
    }
}