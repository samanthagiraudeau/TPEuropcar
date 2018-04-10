package com.tpeuropcar.application.sgiraudeau2016.tpeuropcar.Classe;

/**
 * Created by fgicquiaud2016 on 09/04/2018.
 */

public class VehiculeDisponible {

    private int id;
    private String libelle;
    private int nbPlaces;
    private int nbJoursMinLocation;
    private int nbJoursMaxLocation;
    private double tarifMinLocation;
    private double tarifMaxLocation;


    public VehiculeDisponible(int id, String libelle) {
        this.id = id;
        this.libelle = libelle;
    }

    public VehiculeDisponible(String libelle) {
        this.libelle = libelle;
    }

    public VehiculeDisponible(int id, String libelle, int nbPlaces, int nbJoursMinLocation, int nbJoursMaxLocation, double tarifMinLocation, double tarifMaxLocation) {
        this.id = id;
        this.libelle = libelle;
        this.nbPlaces = nbPlaces;
        this.nbJoursMinLocation = nbJoursMinLocation;
        this.nbJoursMaxLocation = nbJoursMaxLocation;
        this.tarifMinLocation = tarifMinLocation;
        this.tarifMaxLocation = tarifMaxLocation;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public int getNbPlaces() {
        return nbPlaces;
    }

    public void setNbPlaces(int nbPlaces) {
        this.nbPlaces = nbPlaces;
    }

    public int getNbJoursMinLocation() {
        return nbJoursMinLocation;
    }

    public void setNbJoursMinLocation(int nbJoursMinLocation) {
        this.nbJoursMinLocation = nbJoursMinLocation;
    }

    public int getNbJoursMaxLocation() {
        return nbJoursMaxLocation;
    }

    public void setNbJoursMaxLocation(int nbJoursMaxLocation) {
        this.nbJoursMaxLocation = nbJoursMaxLocation;
    }

    public double getTarifMinLocation() {
        return tarifMinLocation;
    }

    public void setTarifMinLocation(double tarifMinLocation) {
        this.tarifMinLocation = tarifMinLocation;
    }

    public double getTarifMaxLocation() {
        return tarifMaxLocation;
    }

    public void setTarifMaxLocation(double tarifMaxLocation) {
        this.tarifMaxLocation = tarifMaxLocation;
    }
}
