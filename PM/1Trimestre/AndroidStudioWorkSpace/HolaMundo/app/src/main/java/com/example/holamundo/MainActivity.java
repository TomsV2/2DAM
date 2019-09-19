package com.example.holamundo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.i("TAG ciclo vida", "onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("TAG ciclo vida", "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("TAG ciclo vida", "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("TAG ciclo vida", "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("TAG ciclo vida", "onStop");
    }
}
