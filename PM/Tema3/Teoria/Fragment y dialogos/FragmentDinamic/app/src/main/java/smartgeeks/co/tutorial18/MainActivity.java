package smartgeeks.co.tutorial18;

import android.net.Uri;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, fr1.OnFragmentInteractionListener, fr2.OnFragmentInteractionListener {
//las dos ultimas implemtaciones son necesarias para que se puedan activar los fragment
    Button btnfr1, btnfr2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fr1 fragmento1 = new fr1();//inflar este fragment dentro del elemento framelayout

        getSupportFragmentManager().beginTransaction().add(R.id.contenedor, fragmento1);
        //por defecto el fragmento que vamos a colocar dentro del contenedor
        btnfr1 = (Button)findViewById(R.id.btnFrag1);
        btnfr2 = (Button)findViewById(R.id.btnFrag2);

        //uso de los botones DELEGATE visto en ejemplo de uso de botones
        btnfr2.setOnClickListener(this);
        btnfr1.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){

            case R.id.btnFrag1:

                fr1 fragmento1 = new fr1();
                //para que permita hacer una transición cuando el botón sea pulsado
                FragmentTransaction transition =  getSupportFragmentManager().beginTransaction();
                transition.replace(R.id.contenedor, fragmento1);
                transition.commit();

                break;

            case R.id.btnFrag2:

                fr2 fragmento2 = new fr2();
                FragmentTransaction transition1 =  getSupportFragmentManager().beginTransaction();
                transition1.replace(R.id.contenedor, fragmento2);
                transition1.commit();

                break;
        }

    }

    @Override
    public void onFragmentInteraction(Uri uri) {
        
    }
}
