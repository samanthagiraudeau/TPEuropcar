package com.tpeuropcar.application.sgiraudeau2016.tpeuropcar.Interface;

import com.tpeuropcar.application.sgiraudeau2016.tpeuropcar.Classe.VehiculeDisponible;
import com.tpeuropcar.application.sgiraudeau2016.tpeuropcar.Classe.VehiculeLoue;

import java.util.List;

/**
 * Created by fgicquiaud2016 on 09/04/2018.
 */

public interface IVehiculeDisponibleDao {

    VehiculeDisponible getVehiculeDisponibleById(int id);

    void insertVehiculeDisponible(VehiculeDisponible vehiculeDisponible);

    List<VehiculeDisponible> listeVehicules();

}
