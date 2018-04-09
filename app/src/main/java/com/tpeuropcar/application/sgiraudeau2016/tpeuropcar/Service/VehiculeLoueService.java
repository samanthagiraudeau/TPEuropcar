package com.tpeuropcar.application.sgiraudeau2016.tpeuropcar.Service;

import com.tpeuropcar.application.sgiraudeau2016.tpeuropcar.Classe.VehiculeDisponible;
import com.tpeuropcar.application.sgiraudeau2016.tpeuropcar.Classe.VehiculeLoue;
import com.tpeuropcar.application.sgiraudeau2016.tpeuropcar.Mock.VehiculeLoueMock;

import java.util.ArrayList;

/**
 * Created by sgiraudeau2016 on 09/04/2018.
 */

public class VehiculeLoueService {
    static VehiculeLoueService instance;
    private ArrayList<VehiculeLoue> vehiculesLoues;

    private VehiculeLoueService(){
        vehiculesLoues = new ArrayList<>();
    }

    public static VehiculeLoueService getInstance() {
        if(instance == null){
            instance = new VehiculeLoueService();
        }
        return instance;
    }


    public ArrayList<VehiculeLoue> getListeVehiculesLoues() {
         return vehiculesLoues = VehiculeLoueMock.getInstance().listeVehicules();
    }



    public VehiculeLoue getVehiculeLoueById(int id) {
        for(VehiculeLoue v : vehiculesLoues) {
            if(v.getId() == id) {
                return v;
            }
        }
        return null;
    }



}
