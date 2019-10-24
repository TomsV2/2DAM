package com.example.ilm.datepicker;

import android.app.Activity;

import android.app.Dialog;
import android.app.DialogFragment;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.widget.TimePicker;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Created by ilm on 11/10/2014.
 */
public class DialogoHora extends DialogFragment implements TimePickerDialog.OnTimeSetListener{

    OnHoraSeleccionada f;
    @Override
    public void onAttach(Activity activity) {
        f=(OnHoraSeleccionada)activity;
        super.onAttach(activity);
    }

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        Calendar c=Calendar.getInstance();
        int hora=c.get(Calendar.HOUR);
        int minutos=c.get(Calendar.MINUTE);

        return new TimePickerDialog(getActivity(),this,hora,minutos,true);
    }

    @Override
    public void onTimeSet(TimePicker timePicker, int i, int i2) {
        GregorianCalendar g=new GregorianCalendar();
        g.set(Calendar.HOUR,i);
        g.set(Calendar.MINUTE,i2);
        f.onResultadoHora(g);
    }

    public interface OnHoraSeleccionada{
        public void onResultadoHora(GregorianCalendar hora);
    }


}


