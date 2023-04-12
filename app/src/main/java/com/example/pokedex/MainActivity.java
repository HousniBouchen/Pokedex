package com.example.pokedex;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button)findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v)
            {
                ImageView imgView = (ImageView)findViewById(R.id.imageView);
                imgView.setVisibility(View.INVISIBLE);
                TextView txtView = (TextView)findViewById(R.id.textView);
                txtView.setVisibility(View.INVISIBLE);
                ImageView imgView2 = (ImageView)findViewById(R.id.imageView2);
                imgView2.setVisibility(View.VISIBLE);
                TextView txtView2 = (TextView)findViewById(R.id.textView2);
                txtView2.setVisibility(View.VISIBLE);
            }
        });
        Button button2 = (Button)findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v)
            {
                ImageView imgView = (ImageView)findViewById(R.id.imageView);
                imgView.setVisibility(View.INVISIBLE);
                TextView txtView = (TextView)findViewById(R.id.textView);
                txtView.setVisibility(View.INVISIBLE);
                ImageView imgView2 = (ImageView)findViewById(R.id.imageView2);
                imgView2.setVisibility(View.VISIBLE);
                TextView txtView2 = (TextView)findViewById(R.id.textView2);
                txtView2.setVisibility(View.VISIBLE);
            }
        });
    }
}