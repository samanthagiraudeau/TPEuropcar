package com.tpeuropcar.application.sgiraudeau2016.tpeuropcar.Classe;

/**
 * Created by fgicquiaud2016 on 09/04/2018.
 */

public class VehiculeDisponible {

    private int id;
    private String libelle;

    public VehiculeDisponible(int id, String libelle) {
        this.id = id;
        this.libelle = libelle;
    }

    public VehiculeDisponible(String libelle) {
        this.libelle = libelle;
    }

    public int getId() {
        return id;
    }

    public String getLibelle() {
        return libelle;
    }

}
