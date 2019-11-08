package com.example.a2navegacionactividades;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class A extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a);
    }

    public void navegar(View v){
        Intent intent = null;

        switch(v.getId()){
            case R.id.buttonb:
                intent = new Intent(A.this, B.class);
                startActivity(intent);
                break;

            case R.id.buttonc:
                intent = new Intent(A.this, C.class);
                startActivity(intent);
                break;

            case R.id.buttond:
                intent = new Intent(A.this, D.class);
                startActivity(intent);
                break;
        }
    }

}
