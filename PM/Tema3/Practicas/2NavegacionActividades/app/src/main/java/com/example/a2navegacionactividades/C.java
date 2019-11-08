package com.example.a2navegacionactividades;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class C extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c);
    }

    public void navegar(View v){
        Intent intent = null;

        switch(v.getId()){
            case R.id.buttona:
                intent = new Intent(C.this, A.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
                startActivity(intent);
                break;

            case R.id.buttonb:
                intent = new Intent(C.this, B.class);
                startActivity(intent);
                break;

            case R.id.buttond:
                intent = new Intent(C.this, D.class);
                startActivity(intent);
                break;
        }
    }
}
