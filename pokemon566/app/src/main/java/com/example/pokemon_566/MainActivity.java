package com.example.pokemon_566;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int name = findViewById (R.id.textView);
        int image = findViewById(R.id.textView2);
        int attack = findViewById(R.id.textView3);
        int defence = findViewById(R.id.textView4);
        int total = findViewById(R.id.textView5);

    }
}