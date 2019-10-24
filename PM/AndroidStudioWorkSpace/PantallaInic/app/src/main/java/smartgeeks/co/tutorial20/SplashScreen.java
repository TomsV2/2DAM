package smartgeeks.co.tutorial20;

import android.app.Activity;
import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashScreen extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        new Handler().postDelayed(new Runnable() {
            //este handler no indicará que debe de mostrar, cuanto ha de esperar y a qué pantalla pasar
            //Asegurarse que la librería importada no es la de Java sino la de Android
            @Override
            public void run() {

                Intent intent = new Intent(SplashScreen.this, MainActivity.class);
                startActivity(intent);

            }
        },4000);//4 segundos de espera
    }
}
