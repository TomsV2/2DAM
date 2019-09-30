package com.example.fibonacci;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button boton;
    TextView sFibonacci;
    Integer iFibonacci;
    int antFibonacci = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        boton = (Button) findViewById(R.id.boton);
        sFibonacci = (TextView) findViewById(R.id.fibonacci);

        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, (CharSequence) sFibonacci, Toast.LENGTH_LONG).show();
            }
        });

        /*sFibonacci = (TextView) findViewById(R.id.fibonacci);

        iFibonacci = Integer.parseInt(String.valueOf(sFibonacci));

        iFibonacci = antFibonacci + iFibonacci;

        Toast.makeText(MainActivity.this, String.valueOf(iFibonacci), Toast.LENGTH_LONG).show();*/

        //sFibonacci.append(String.valueOf(iFibonacci));

    }
}
