package com.example.ejercicio6calculadorasencilla;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button calcular;
    EditText numero1;
    EditText numero2;

    TextView resultado;

    Spinner operadores;

    int n1;
    int n2;
    double r;
    String operador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        calcular = (Button) findViewById(R.id.botonCalcular);

        numero1 = (EditText) findViewById(R.id.numero1);
        numero2 = (EditText) findViewById(R.id.numero2);

        resultado = (TextView) findViewById(R.id.resultado);

        operadores = (Spinner) findViewById(R.id.spinner);

        calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (operador){
                    case "+":
                        r = n1 + n2;
                        break;

                    case "-":
                        r = n1 - n2;
                        break;

                    case "*":
                        r = n1 * n2;
                        break;

                    case "/":
                        r = n1 / n2;
                        break;
                }

                resultado.setText(String.valueOf(r));

            }
        });

        numero1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // Toast.makeText(MainActivity.this, numero1.getText().toString(), Toast.LENGTH_LONG).show();

                n1 = Integer.parseInt(numero1.getText().toString());
            }
        });

        numero2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(MainActivity.this, numero2.getText().toString(), Toast.LENGTH_LONG).show();

                n2 = Integer.parseInt(numero2.getText().toString());
            }
        });

        operadores.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                //Toast.makeText(parent.getContext(), (String) parent.getItemAtPosition(position), Toast.LENGTH_SHORT).show();

                operador = (String) parent.getItemAtPosition(position);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    }
}
