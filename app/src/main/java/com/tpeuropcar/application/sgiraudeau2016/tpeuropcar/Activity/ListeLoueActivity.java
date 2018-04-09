package com.tpeuropcar.application.sgiraudeau2016.tpeuropcar.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.Toast;

import com.tpeuropcar.application.sgiraudeau2016.tpeuropcar.Adapter.VehiculeDisponibleAdapter;
import com.tpeuropcar.application.sgiraudeau2016.tpeuropcar.Adapter.VehiculeLoueAdapter;
import com.tpeuropcar.application.sgiraudeau2016.tpeuropcar.Classe.VehiculeDisponible;
import com.tpeuropcar.application.sgiraudeau2016.tpeuropcar.R;
import com.tpeuropcar.application.sgiraudeau2016.tpeuropcar.Service.VehiculeDisponibleService;
import com.tpeuropcar.application.sgiraudeau2016.tpeuropcar.Service.VehiculeLoueService;

public class ListeLoueActivity extends AppCompatActivity {

    private VehiculeLoueService vehiculeLoueService;
    ListView listeVehicules;

    ImageButton afficherListeDisponible;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_liste_loues);

        afficherListeDisponible = findViewById(R.id.afficher_liste_dispo);
        afficherListeDisponible.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ListeLoueActivity.this, ListeDispoActivity.class);
                startActivity(intent);
            }
        });


    }


    @Override
    protected void onResume() {
        super.onResume();

        listeVehicules = findViewById(R.id.liste_vehicules_loues);

        VehiculeLoueAdapter vehiculeAdapter = new VehiculeLoueAdapter(ListeLoueActivity.this, VehiculeLoueService.getInstance().getListeVehiculesLoues());
        listeVehicules.setAdapter(vehiculeAdapter);

    }




}
