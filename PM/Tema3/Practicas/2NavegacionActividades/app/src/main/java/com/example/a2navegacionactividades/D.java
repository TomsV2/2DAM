package com.example.a2navegacionactividades;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class D extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_d);
    }

    public void navegar(View v){
        Intent intent = null;

        switch(v.getId()){
            case R.id.buttona:
                intent = new Intent(D.this, A.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
                startActivity(intent);
                break;

            case R.id.buttonb:
                intent = new Intent(D.this, B.class);
                startActivity(intent);
                break;

            case R.id.buttonc:
                intent = new Intent(D.this, C.class);
                startActivity(intent);
                break;
        }
    }
}
