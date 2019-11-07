package com.example.a12comunicacioncomponentes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void abrir(View v){

        Intent i = new Intent();
        Intent chooser = null;

        switch(v.getId()){
            case R.id.bt_url:
                EditText edURL = (EditText)findViewById(R.id.et_url);

                i.setAction(Intent.ACTION_VIEW);
                i.setData(Uri.parse(edURL.getText().toString()));

                chooser = i.createChooser(i,"Elige un navegador");

                startActivity(chooser);

                Toast.makeText(this.getApplicationContext(),"Acceso a web!",Toast.LENGTH_LONG).show();
            break;

            case R.id.bt_mapa:
                EditText edLongitud = (EditText)findViewById(R.id.et_longitud);
                EditText edLatitud = (EditText)findViewById(R.id.et_latitud);

                i.setAction(Intent.ACTION_VIEW);
                i.setData(Uri.parse("geo:" + edLatitud.getText().toString() + "," +edLongitud.getText().toString()));

                chooser = i.createChooser(i,"Lanzar Maps");

                startActivity(chooser);

                Toast.makeText(this.getApplicationContext(),"Acceso a mapas!",Toast.LENGTH_LONG).show();
            break;

            case R.id.bt_email:
                EditText edEmail = (EditText)findViewById(R.id.et_email);

                i.setAction(Intent.ACTION_SEND);
                i.setData(Uri.parse("mailto:"));

                String para[] = {edEmail.getText().toString(),"charialcazar@gmail.es","otro@gmail.com"};

                i.putExtra(Intent.EXTRA_EMAIL,para);
                i.putExtra(Intent.EXTRA_SUBJECT,"Saludos desde Android");
                i.putExtra(Intent.EXTRA_TEXT,"Hola!. Este es nuestro primer email!!");
                i.setType("message/rfc822");

                chooser = i.createChooser(i,"Enviar email");

                startActivity(chooser);

                Toast.makeText(this.getApplicationContext(),"Envía el email!!",Toast.LENGTH_LONG).show();
            break;
        }
    }


}
