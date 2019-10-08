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

    String r;

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

                int n1;
                int n2;
                String operador;

                n1 = Integer.parseInt(numero1.getText().toString());
                n2 = Integer.parseInt(numero2.getText().toString());
                operador = operadores.getSelectedItem().toString();

                switch (operador){
                    case "+":
                        r = String.valueOf(n1 + n2);
                        break;

                    case "-":
                        r = String.valueOf(n1 - n2);
                        break;

                    case "*":
                        r = String.valueOf(n1 * n2);
                        break;

                    case "/":
                        if(n1==0 && n2==0){
                            r = "Indt";
                        }
                        else{
                            if(n1!=0 && n2==0){
                                r = "±∞";
                            }
                            else{
                                r = String.valueOf(n1 / n2);
                            }
                        }
                        break;
                }

                resultado.setText(r);

            }
        });
    }
}
