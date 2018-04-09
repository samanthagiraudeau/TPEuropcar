package com.tpeuropcar.application.sgiraudeau2016.tpeuropcar.Interface;

import com.tpeuropcar.application.sgiraudeau2016.tpeuropcar.Classe.VehiculeLoue;

import java.util.List;

/**
 * Created by fgicquiaud2016 on 09/04/2018.
 */

public interface IVehiculeDao {

    VehiculeLoue getVehiculeById(int id);

    void insertVehicule(VehiculeLoue vehiculeLoue);

    List<VehiculeLoue> listeVehicules();

}
