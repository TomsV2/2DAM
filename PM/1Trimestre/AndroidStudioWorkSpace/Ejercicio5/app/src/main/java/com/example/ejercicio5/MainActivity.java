package com.example.ejercicio5;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
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

    int colorFondo;
    int colorTexto;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioGroup_Fondo = (RadioGroup) findViewById(R.id.radioGroup_Fondo);
        radioGroup_Texto = (RadioGroup) findViewById(R.id.radioGroup_Texto);

        checkBox_MostrarTexto = (CheckBox) findViewById(R.id.cb_MostrarTexto);

        textoCambiante = (TextView) findViewById(R.id.textoCambiante);

        colorFondo = 0;
        colorTexto = 0;

    }

    public void colorFondo(View view) {

        switch (radioGroup_Fondo.getCheckedRadioButtonId()){
            case R.id.rb_FondoNegro:
                textoCambiante.setBackgroundResource(R.color.fondoNegro);
                break;

            case R.id.rb_FondoVerde:
                if(radioGroup_Texto.getCheckedRadioButtonId() == R.id.rb_TextoBlanco){
                    textoCambiante.setText("¡Viva el Betis!");
                    textoCambiante.setBackgroundResource(R.color.fondoVerde);
                }
                else{
                    textoCambiante.setBackgroundResource(R.color.fondoVerde);
                }
                break;

            case R.id.rb_FondoRojo:
                textoCambiante.setBackgroundResource(R.color.fondoRojo);
                break;
        }

        /*switch(view.getId()){
            case R.id.rb_FondoNegro:
                colorFondo = 1;
                break;

            case R.id.rb_FondoVerde:
                colorFondo = 2;
                break;

            case R.id.rb_FondoRojo:
                colorFondo = 3;
                break;
        }

        Toast.makeText(this, Integer.toString(colorFondo), Toast.LENGTH_SHORT).show();*/
    }

    public void colorTexto(View view) {

        switch (radioGroup_Texto.getCheckedRadioButtonId()){
            case R.id.rb_TextoBlanco:
                if(radioGroup_Fondo.getCheckedRadioButtonId() == R.id.rb_FondoVerde){
                    textoCambiante.setText("¡Viva el Betis!");
                    textoCambiante.setTextColor(getResources().getColor(R.color.textoBlanco));
                }
                else{
                    textoCambiante.setTextColor(getResources().getColor(R.color.textoBlanco));
                }
                break;

            case R.id.rb_TextoAmarillo:
                textoCambiante.setTextColor(getResources().getColor(R.color.textoAmarillo));
                break;

            case R.id.rb_TextoAzul:
                textoCambiante.setTextColor(getResources().getColor(R.color.textoAzul));
                break;
        }

        /*switch(view.getId()){
            case R.id.rb_TextoBlanco:
                colorTexto = 1;
                break;

            case R.id.rb_TextoAmarillo:
                colorTexto = 2;
                break;

            case R.id.rb_TextoAzul:
                colorTexto = 3;
                break;
        }

        Toast.makeText(this, Integer.toString(colorTexto), Toast.LENGTH_SHORT).show();*/
    }

    public void cambiarTexto(View view) {

        if (checkBox_MostrarTexto.isChecked()){
            if(radioGroup_Fondo.getCheckedRadioButtonId() == R.id.rb_FondoVerde && radioGroup_Texto.getCheckedRadioButtonId() == R.id.rb_TextoBlanco){
                textoCambiante.setText("¡Viva el Betis!");
            }
            else{
                textoCambiante.setText("Vaya texto más guapo");
            }
        }
        else{
            textoCambiante.setText("");
        }
    }
}
