package com.example.ejercicio8puzle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class MainActivity extends AppCompatActivity {

    Button b1;
    Button b2;
    Button b3;
    Button b4;
    Button b5;
    Button b6;
    Button b7;
    Button b8;
    Button b9;
    Button barajar;

    ArrayList<String> numeros = new ArrayList<String>();

    boolean completado = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1 = (Button)findViewById(R.id.boton1);
        b2 = (Button)findViewById(R.id.boton2);
        b3 = (Button)findViewById(R.id.boton3);
        b4 = (Button)findViewById(R.id.boton4);
        b5 = (Button)findViewById(R.id.boton5);
        b6 = (Button)findViewById(R.id.boton6);
        b7 = (Button)findViewById(R.id.boton7);
        b8 = (Button)findViewById(R.id.boton8);
        b9 = (Button)findViewById(R.id.boton9);
        barajar = (Button)findViewById(R.id.boton_barajar);

        numeros.add(b1.getText().toString());
        numeros.add(b2.getText().toString());
        numeros.add(b3.getText().toString());
        numeros.add(b4.getText().toString());
        numeros.add(b5.getText().toString());
        numeros.add(b6.getText().toString());
        numeros.add(b7.getText().toString());
        numeros.add(b8.getText().toString());
        numeros.add(b9.getText().toString());

        if( b1.getText().toString().equals("1") &&
            b2.getText().toString().equals("2") &&
            b3.getText().toString().equals("3") &&
            b4.getText().toString().equals("4") &&
            b5.getText().toString().equals("5") &&
            b6.getText().toString().equals("6") &&
            b7.getText().toString().equals("7") &&
            b8.getText().toString().equals("8") &&
            b9.getText().toString().equals("") && completado==true)
        {
            Toast.makeText(MainActivity.this, "Has ganao chacho", Toast.LENGTH_LONG).show();
        }

    }

    public void pulsar1(View view) {
        if(!b1.getText().toString().equals("")){
            if(b2.getText().toString().equals("")){
                b2.setText(b1.getText().toString());
                b1.setText("");
            }
            else{
                if(b4.getText().toString().equals("")){
                    b4.setText(b1.getText().toString());
                    b1.setText("");
                }
            }
        }
    }

    public void pulsar2(View view) {
        if(!b2.getText().toString().equals("")){
            if(b1.getText().toString().equals("")){
                b1.setText(b2.getText().toString());
                b2.setText("");
            }
            else{
                if(b5.getText().toString().equals("")){
                    b5.setText(b2.getText().toString());
                    b2.setText("");
                }
                else{
                    if(b3.getText().toString().equals("")){
                        b3.setText(b2.getText().toString());
                        b2.setText("");
                    }
                }
            }
        }
    }

    public void pulsar3(View view) {
        if(!b3.getText().toString().equals("")){
            if(b2.getText().toString().equals("")){
                b2.setText(b3.getText().toString());
                b3.setText("");
            }
            else{
                if(b6.getText().toString().equals("")){
                    b6.setText(b3.getText().toString());
                    b3.setText("");
                }
            }
        }
    }

    public void pulsar4(View view) {
        if(!b4.getText().toString().equals("")){
            if(b1.getText().toString().equals("")){
                b1.setText(b4.getText().toString());
                b4.setText("");
            }
            else{
                if(b5.getText().toString().equals("")){
                    b5.setText(b4.getText().toString());
                    b4.setText("");
                }
                else{
                    if(b7.getText().toString().equals("")){
                        b7.setText(b4.getText().toString());
                        b4.setText("");
                    }
                }
            }
        }
    }

    public void pulsar5(View view) {
        if(!b5.getText().toString().equals("")){
            if(b2.getText().toString().equals("")){
                b2.setText(b5.getText().toString());
                b5.setText("");
            }
            else{
                if(b4.getText().toString().equals("")){
                    b4.setText(b5.getText().toString());
                    b5.setText("");
                }
                else{
                    if(b8.getText().toString().equals("")){
                        b8.setText(b5.getText().toString());
                        b5.setText("");
                    }
                    else{
                        if(b6.getText().toString().equals("")){
                            b6.setText(b5.getText().toString());
                            b5.setText("");
                        }
                    }
                }
            }
        }
    }

    public void pulsar6(View view) {
        if(!b6.getText().toString().equals("")){
            if(b3.getText().toString().equals("")){
                b3.setText(b6.getText().toString());
                b6.setText("");
            }
            else{
                if(b5.getText().toString().equals("")){
                    b5.setText(b6.getText().toString());
                    b6.setText("");
                }
                else{
                    if(b9.getText().toString().equals("")){
                        b9.setText(b6.getText().toString());
                        b6.setText("");
                    }
                }
            }
        }
    }

    public void pulsar7(View view) {
        if(!b7.getText().toString().equals("")){
            if(b4.getText().toString().equals("")){
                b4.setText(b7.getText().toString());
                b7.setText("");
            }
            else{
                if(b8.getText().toString().equals("")){
                    b8.setText(b7.getText().toString());
                    b7.setText("");
                }
            }
        }
    }

    public void pulsar8(View view) {
        if(!b8.getText().toString().equals("")){
            if(b7.getText().toString().equals("")){
                b7.setText(b8.getText().toString());
                b8.setText("");
            }
            else{
                if(b5.getText().toString().equals("")){
                    b5.setText(b8.getText().toString());
                    b8.setText("");
                }
                else{
                    if(b9.getText().toString().equals("")){
                        b9.setText(b8.getText().toString());
                        b8.setText("");
                    }
                }
            }
        }
    }

    public void pulsar9(View view) {
        if(!b9.getText().toString().equals("")){
            if(b6.getText().toString().equals("")){
                b6.setText(b9.getText().toString());
                b9.setText("");
            }
            else{
                if(b8.getText().toString().equals("")){
                    b8.setText(b9.getText().toString());
                    b9.setText("");
                }
            }
        }
    }

    public void pulsarBarajar(View view) {

        completado=true;

        int posiconBt1 = 0;
        int posiconBt2 = 0;
        String aux = "";

        for(int i=1; i<=50; i++){
            //Collections.shuffle(numeros);

            posiconBt1 = (int)(Math.random()*9);
            posiconBt2 = (int)(Math.random()*9);

            aux = numeros.get(posiconBt1);

            numeros.set(posiconBt1, numeros.get(posiconBt2));
            numeros.set(posiconBt2, aux);

        }

        b1.setText(numeros.get(0));
        b2.setText(numeros.get(1));
        b3.setText(numeros.get(2));
        b4.setText(numeros.get(3));
        b5.setText(numeros.get(4));
        b6.setText(numeros.get(5));
        b7.setText(numeros.get(6));
        b8.setText(numeros.get(7));
        b9.setText(numeros.get(8));

    }
}
