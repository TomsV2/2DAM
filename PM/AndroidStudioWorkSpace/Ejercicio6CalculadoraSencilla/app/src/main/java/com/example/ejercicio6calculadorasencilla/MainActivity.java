package com.example.ejercicio6calculadorasencilla;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button calcular;
    EditText numero1;
    EditText numero2;

    TextView resultado;

    RadioGroup operadores;

    String r;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        calcular = (Button) findViewById(R.id.botonCalcular);

        numero1 = (EditText) findViewById(R.id.numero1);
        numero2 = (EditText) findViewById(R.id.numero2);

        resultado = (TextView) findViewById(R.id.resultado);

        operadores = (RadioGroup) findViewById(R.id.rg_operadores);

        calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                double n1;
                double n2;

                n1 = Double.parseDouble(numero1.getText().toString());
                n2 = Double.parseDouble(numero2.getText().toString());

                switch (operadores.getCheckedRadioButtonId()){
                    case R.id.rb_suma:
                        r = String.valueOf(n1 + n2);
                        break;

                    case R.id.rb_resta:
                        r = String.valueOf(n1 - n2);
                        break;

                    case R.id.rb_multiplicacion:
                        r = String.valueOf(n1 * n2);
                        break;

                    case R.id.rb_divicion:
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
