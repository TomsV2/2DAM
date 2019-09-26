package com.example.fibonacci;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView sFibonacci;
    Integer iFibonacci;
    int antFibonacci = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void calcularFibonacci(View view) {
        sFibonacci = (TextView) findViewById(R.id.fibonacci);

        iFibonacci = Integer.parseInt(String.valueOf(sFibonacci));

        iFibonacci = antFibonacci + iFibonacci;

        sFibonacci.append(String.valueOf(iFibonacci));
    }
}
