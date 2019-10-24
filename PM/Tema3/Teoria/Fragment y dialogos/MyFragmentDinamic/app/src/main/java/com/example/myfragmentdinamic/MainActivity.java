package com.example.myfragmentdinamic;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button bt_fr1;
    Button bt_fr2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fragment1 fragmento1 = new fragment1();
        getSupportFragmentManager().beginTransaction().add(R.id.contenedor, fragmento1);

        bt_fr1 = (Button)findViewById(R.id.bt_fr1);
        bt_fr2 = (Button)findViewById(R.id.bt_fr2);

        bt_fr1.setOnClickListener(this);
        bt_fr2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.bt_fr1:

            break;

            case R.id.bt_fr2:
                fragment2 fragmento2 = new fragment2();

                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.contenedor, fragmento2);
                transaction.commit();
            break;
        }
    }
}
