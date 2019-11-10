package com.example.a3intentexplicito;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity implements View.OnClickListener {

    Button bt_volver;

    TextView tv_contador;

    int boton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        bt_volver = (Button)findViewById(R.id.bt_volver);

        tv_contador = (TextView)findViewById(R.id.tv_contador);

        bt_volver.setOnClickListener(this);

        mostrarContador();
    }



    @Override
    public void onClick(View v) {
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("contador",tv_contador.getText().toString());
        intent.putExtra("boton", boton);
        startActivity(intent);
    }

    public void mostrarContador() {
        //Obtener el Intent que hemos recibido
        Intent intent = getIntent();
        //Obtener el nombre
        String contador = intent.getStringExtra("contador");
        boton = intent.getIntExtra("boton", 0);
        //Establecer el texto y mostrar contador
        tv_contador.setText( String.valueOf(Integer.valueOf(contador)+1) );
    }

    /*@Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
    }*/
}
