package com.example.a3intentexplicito;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button bt_1;
    Button bt_2;
    Button bt_3;
    Button bt_4;

    TextView tv_1;
    TextView tv_2;
    TextView tv_3;
    TextView tv_4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bt_1 = (Button)findViewById(R.id.bt_1);
        bt_2 = (Button)findViewById(R.id.bt_2);
        bt_3 = (Button)findViewById(R.id.bt_3);
        bt_4 = (Button)findViewById(R.id.bt_4);

        tv_1 = (TextView)findViewById(R.id.tv_1);
        tv_2 = (TextView)findViewById(R.id.tv_2);
        tv_3 = (TextView)findViewById(R.id.tv_3);
        tv_4 = (TextView)findViewById(R.id.tv_4);

        bt_1.setOnClickListener(this);
        bt_2.setOnClickListener(this);
        bt_3.setOnClickListener(this);
        bt_4.setOnClickListener(this);

        mostrarContador();
    }

    @Override
    public void onClick(View v) {

        Intent intent = new Intent(this, Main2Activity.class);

        switch(v.getId()){
            case R.id.bt_1:
                intent.putExtra("contador", tv_1.getText().toString());
                intent.putExtra("boton", 1);
            break;

            case R.id.bt_2:
                intent.putExtra("contador", tv_2.getText().toString());
                intent.putExtra("boton", 2);
            break;

            case R.id.bt_3:
                intent.putExtra("contador", tv_3.getText().toString());
                intent.putExtra("boton", 3);
            break;

            case R.id.bt_4:
                intent.putExtra("contador", tv_4.getText().toString());
                intent.putExtra("boton", 4);
            break;
        }

        startActivity(intent);
    }

    public void mostrarContador(){
        Intent intent = getIntent();

        int boton = intent.getIntExtra("boton",0);
        String contador = intent.getStringExtra("contador");

        switch(boton){
            case 1:
                tv_1.setText(contador);
            break;

            case 2:
                tv_2.setText(contador);
            break;

            case 3:
                tv_3.setText(contador);
            break;

            case 4:
                tv_4.setText(contador);
            break;
        }
    }

}
