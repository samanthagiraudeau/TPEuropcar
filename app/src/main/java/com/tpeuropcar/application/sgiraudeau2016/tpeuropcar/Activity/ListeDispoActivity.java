package com.tpeuropcar.application.sgiraudeau2016.tpeuropcar.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.Toast;

import com.tpeuropcar.application.sgiraudeau2016.tpeuropcar.Adapter.VehiculeDisponibleAdapter;
import com.tpeuropcar.application.sgiraudeau2016.tpeuropcar.Classe.VehiculeDisponible;
import com.tpeuropcar.application.sgiraudeau2016.tpeuropcar.R;
import com.tpeuropcar.application.sgiraudeau2016.tpeuropcar.Service.VehiculeDisponibleService;

public class ListeDispoActivity extends AppCompatActivity {

    private VehiculeDisponibleService vehiculeDisponibleService;
    ListView listeVehicules;

    ImageButton afficherListeLoue;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_liste_disponibles);

        afficherListeLoue = findViewById(R.id.afficher_liste_loues);
        afficherListeLoue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ListeDispoActivity.this, ListeLoueActivity.class);
                startActivity(intent);
            }
        });


    }


    @Override
    protected void onResume() {
        super.onResume();

        listeVehicules = findViewById(R.id.liste_vehicules_disponibles);

        VehiculeDisponibleAdapter vehiculeAdapter = new VehiculeDisponibleAdapter(ListeDispoActivity.this, VehiculeDisponibleService.getInstance().getListeVehiculesDisponibles());
        listeVehicules.setAdapter(vehiculeAdapter);
    }



    // Sélection de la chanson
    public void vehiculeChoisi(View view) {
        //vehiculeLoueService.setVehicule(Integer.parseInt(view.getTag().toString()));
        VehiculeDisponible vehiculeDisponible = vehiculeDisponibleService.getVehiculeDisponibleById(Integer.parseInt(view.getTag().toString()));

        // On redirige vers le détail du véhicule pour le louer
        Intent intent = new Intent(ListeDispoActivity.this, FormulaireLocation.class);
        startActivity(intent);

    }

}
