package com.tpeuropcar.application.sgiraudeau2016.tpeuropcar.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.tpeuropcar.application.sgiraudeau2016.tpeuropcar.Classe.VehiculeDisponible;
import com.tpeuropcar.application.sgiraudeau2016.tpeuropcar.R;

import java.util.ArrayList;

/**
 * Created by sgiraudeau2016 on 09/04/2018.
 */

public class VehiculeDisponibleAdapter extends BaseAdapter {

    private ArrayList<VehiculeDisponible> tousLesVehiculeLoues;
    private LayoutInflater vehiculeInf;

    public VehiculeDisponibleAdapter(Context c, ArrayList<VehiculeDisponible> theVehiculeDisponibles){
        tousLesVehiculeLoues = theVehiculeDisponibles;
        vehiculeInf = LayoutInflater.from(c);
    }


    @Override
    public int getCount() {
        return tousLesVehiculeLoues.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup parent) {
        LinearLayout vehiculeLay = (LinearLayout)vehiculeInf.inflate
                (R.layout.un_vehicule_disponible, parent, false);

        TextView libelleView = (TextView)vehiculeLay.findViewById(R.id.libelle_vehicule);
        TextView idView = (TextView)vehiculeLay.findViewById(R.id.id_vehicule);
        TextView nbPlacesView = (TextView)vehiculeLay.findViewById(R.id.nombre_places);
        TextView locaMinView = (TextView)vehiculeLay.findViewById(R.id.loca_min_vehicule);
        TextView locaMaxView = (TextView)vehiculeLay.findViewById(R.id.loca_max_vehicule);
        TextView tarifMinView = (TextView)vehiculeLay.findViewById(R.id.tarif_min_vehicule);
        TextView tarifMaxView = (TextView)vehiculeLay.findViewById(R.id.tarif_max_vehicule);

        VehiculeDisponible currVehiculeLoue = tousLesVehiculeLoues.get(i);

        libelleView.setText(currVehiculeLoue.getLibelle());
        idView.setText(String.valueOf(currVehiculeLoue.getId()));
        nbPlacesView.setText(String.valueOf(currVehiculeLoue.getNbPlaces()));
        locaMinView.setText(String.valueOf(currVehiculeLoue.getNbJoursMinLocation()));
        locaMaxView.setText(String.valueOf(currVehiculeLoue.getNbJoursMaxLocation()));
        tarifMinView.setText(String.valueOf(currVehiculeLoue.getTarifMinLocation()));
        tarifMaxView.setText(String.valueOf(currVehiculeLoue.getTarifMaxLocation()));


        vehiculeLay.setTag(i);
        return vehiculeLay;
    }
}
