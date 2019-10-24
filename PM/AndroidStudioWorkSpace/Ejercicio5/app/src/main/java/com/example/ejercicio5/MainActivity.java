package com.example.ejercicio5;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView textoCambiante;
    CheckBox checkBox_MostrarTexto;
    RadioGroup radioGroup_Fondo;
    RadioGroup radioGroup_Texto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioGroup_Fondo = (RadioGroup) findViewById(R.id.radioGroup_Fondo);
        radioGroup_Texto = (RadioGroup) findViewById(R.id.radioGroup_Texto);

        checkBox_MostrarTexto = (CheckBox) findViewById(R.id.cb_MostrarTexto);

        textoCambiante = (TextView) findViewById(R.id.textoCambiante);

        radioGroup_Fondo.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                switch (checkedId){
                    case R.id.rb_FondoNegro:
                        textoCambiante.setBackgroundColor(Color.BLACK);
                        break;

                    case R.id.rb_FondoVerde:
                        textoCambiante.setBackgroundColor(Color.GREEN);
                        break;

                    case R.id.rb_FondoRojo:
                        textoCambiante.setBackgroundColor(Color.RED);
                        break;
                }
            }
        });

        radioGroup_Texto.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                switch (checkedId){
                    case R.id.rb_TextoBlanco:
                        textoCambiante.setTextColor(getResources().getColor(R.color.textoBlanco));
                        break;

                    case R.id.rb_TextoAmarillo:
                        textoCambiante.setTextColor(getResources().getColor(R.color.textoAmarillo));
                        break;

                    case R.id.rb_TextoAzul:
                        textoCambiante.setTextColor(getResources().getColor(R.color.textoAzul));
                        break;
                }
            }
        });

        checkBox_MostrarTexto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (checkBox_MostrarTexto.isChecked()){
                    textoCambiante.setText("Vaya texto más guapo");
                }
                else{
                    textoCambiante.setText("");
                }

            }
        });

    }
}