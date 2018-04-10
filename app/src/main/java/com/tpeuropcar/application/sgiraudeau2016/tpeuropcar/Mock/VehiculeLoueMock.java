package com.tpeuropcar.application.sgiraudeau2016.tpeuropcar.Mock;

import com.tpeuropcar.application.sgiraudeau2016.tpeuropcar.Classe.Tools;
import com.tpeuropcar.application.sgiraudeau2016.tpeuropcar.Classe.VehiculeLoue;
import com.tpeuropcar.application.sgiraudeau2016.tpeuropcar.Interface.IVehiculeDao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by fgicquiaud2016 on 09/04/2018.
 */

public class VehiculeLoueMock implements IVehiculeDao {

    private ArrayList<VehiculeLoue> vehiculeLoues;

    private static VehiculeLoueMock instance;

    private VehiculeLoueMock(){
        vehiculeLoues = populateListMock();
    }

    public static VehiculeLoueMock getInstance() {
        if(instance == null){
            instance = new VehiculeLoueMock();
        }
        return instance;
    }


    @Override
    public void insertVehicule(VehiculeLoue vehiculeLoue) {

    }


    @Override
    public VehiculeLoue getVehiculeById(int id) {
        for(VehiculeLoue v : vehiculeLoues){
            if(v.getId() == id){
                return v;
            }
        }

        return null;
    }


    @Override
    public ArrayList<VehiculeLoue> listeVehicules() {
        return vehiculeLoues;
    }

    private ArrayList<VehiculeLoue> populateListMock(){
        ArrayList<VehiculeLoue> vehiculeLoues = new ArrayList<>();
        vehiculeLoues.add(new VehiculeLoue(1, "Citroen C3", new Date(), Tools.ajouterJour(new Date(), 5), 1256d));
        vehiculeLoues.add(new VehiculeLoue(2, "Peugeot", new Date(),  Tools.ajouterJour(new Date(), 6), 1256d));
        vehiculeLoues.add(new VehiculeLoue(3, "Passat", new Date(),  Tools.ajouterJour(new Date(), 7), 1256d));
        vehiculeLoues.add(new VehiculeLoue(4, "BM", new Date(),  Tools.ajouterJour(new Date(), 8), 1256d));

        return vehiculeLoues;
    }
}
