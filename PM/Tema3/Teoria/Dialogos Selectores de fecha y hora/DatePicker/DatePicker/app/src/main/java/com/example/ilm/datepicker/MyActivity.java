package com.example.ilm.datepicker;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class MyActivity extends Activity implements DialogoFecha.OnFechaSeleccionada,DialogoHora.OnHoraSeleccionada{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);

    }

    public void onClickFecha(View view) {
        DialogoFecha d=new DialogoFecha();
        d.show(getFragmentManager(),"Mi diálogo Fecha");
    }
    public void onClickHora(View view){
        DialogoHora d=new DialogoHora();
        d.show(getFragmentManager(),"Mi diálogo Hora");

    }
    @Override
    public void onResultadoFecha(GregorianCalendar fecha) {
        EditText et=(EditText)findViewById(R.id.etFechaNacimiento);
        et.setText(fecha.get(Calendar.DAY_OF_MONTH)+"/"+(fecha.get(Calendar.MONTH)+1)+"/"+fecha.get(Calendar.YEAR));
    }


    @Override
    public void onResultadoHora(GregorianCalendar hora) {
        EditText et=(EditText)findViewById(R.id.etHora);
        et.setText(hora.get(Calendar.HOUR)+":"+hora.get(Calendar.MINUTE));
    }
}
