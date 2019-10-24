package com.example.holamundo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView texto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.i("TAG ciclo vida", "onCreate");

        texto = (TextView)findViewById(R.id.textEvent);

        texto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "He pulsado el texto", Toast.LENGTH_LONG).show();
            }
        });

    }

    /*
        android:onClick="initSecActivity"
    public void initSecActivity(View view) {
        Toast.makeText(this, "Se ha pulsado el texto", Toast.LENGTH_LONG).show();
    }*/
}
