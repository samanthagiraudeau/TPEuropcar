package com.tpeuropcar.application.sgiraudeau2016.tpeuropcar.Classe;

import java.util.Date;

/**
 * Created by fgicquiaud2016 on 09/04/2018.
 */

public class VehiculeLoue {

    private int id;
    private String libelle;
    private Date dateDebut;
    private Date dateFin;
    private double tarif;

    public VehiculeLoue(int id, String libelle) {
        this.id = id;
        this.libelle = libelle;
    }

    public VehiculeLoue(String libelle) {
        this.libelle = libelle;
    }

    public VehiculeLoue(int id, String libelle, Date dateDebut, Date dateFin, double tarif) {
        this.id = id;
        this.libelle = libelle;
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
        this.tarif = tarif;
    }

    public int getId() {
        return id;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public Date getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(Date dateDebut) {
        this.dateDebut = dateDebut;
    }

    public Date getDateFin() {
        return dateFin;
    }

    public void setDateFin(Date dateFin) {
        this.dateFin = dateFin;
    }

    public double getTarif() {
        return tarif;
    }

    public void setTarif(double tarif) {
        this.tarif = tarif;
    }
}
