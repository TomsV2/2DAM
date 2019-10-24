package com.example.activity1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void irActivity2(View view) {

        Intent int_sec = new Intent(this,Activity2.class);

        int_sec.putExtra("Nombre", "Manolo");
        int_sec.putExtra("edad",30);
        int_sec.putExtra("curso","2DAM");

        startActivity(int_sec);
    }
}
