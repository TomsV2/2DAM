package com.example.a4intentimplicito;

import androidx.appcompat.app.AppCompatActivity;

import android.app.SearchManager;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    //Declaraciones de variables
    Button bt_ActionDial;
    Button bt_ActionWebSearch;
    Button bt_ActionView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bt_ActionDial = (Button)findViewById(R.id.bt_ActionDial);
        bt_ActionWebSearch = (Button)findViewById(R.id.bt_ActionWebSearch);
        bt_ActionView = (Button)findViewById(R.id.bt_ActionView);

        bt_ActionDial.setOnClickListener(this);
        bt_ActionWebSearch.setOnClickListener(this);
        bt_ActionView.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        Intent intent = new Intent();
        Intent chooser = null;

        switch(v.getId()){
            case R.id.bt_ActionDial:
                intent.setAction(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:628119707"));

                startActivity(intent);
            break;

            case R.id.bt_ActionWebSearch:
                intent.setAction(Intent.ACTION_WEB_SEARCH);

                intent.putExtra(SearchManager.QUERY, "https://fie.org/");

                startActivity(intent);
            break;

            case R.id.bt_ActionView:
                intent.setAction(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("content://contacts/people/"));

                startActivity(intent);
            break;
        }
    }
}
