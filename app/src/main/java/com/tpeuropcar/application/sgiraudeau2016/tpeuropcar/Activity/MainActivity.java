package com.tpeuropcar.application.sgiraudeau2016.tpeuropcar.Activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.tpeuropcar.application.sgiraudeau2016.tpeuropcar.R;

public class MainActivity extends AppCompatActivity implements ConnexionFragment.OnConnexionListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    // Se connecter
    @Override
    public void seConnecter(String identifiant) {
        /*Intent intent = new Intent(MainActivity.this, ListeResultatsActivity.class);
        intent.putExtra("motClef", motClef);
        startActivity(intent);*/
    }
}
