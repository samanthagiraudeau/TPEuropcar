package com.tpeuropcar.application.sgiraudeau2016.tpeuropcar.Mock;

import com.tpeuropcar.application.sgiraudeau2016.tpeuropcar.Classe.Utilisateur;
import com.tpeuropcar.application.sgiraudeau2016.tpeuropcar.Interface.IUtilisateurDao;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by fgicquiaud2016 on 09/04/2018.
 */

public class UtilisateurMock implements IUtilisateurDao{

    private List<Utilisateur> utilisateurs;

    private static UtilisateurMock instance;

    private UtilisateurMock(){
        utilisateurs = populateListMock();
    }

    public static UtilisateurMock getInstance() {
        if(instance == null){
            instance = new UtilisateurMock();
        }
        return instance;
    }

    @Override
    public Utilisateur getUtilisateurByMail(String mail) {
        return null;
    }

    @Override
    public Utilisateur getUtilisateurById(int id) {
        for(Utilisateur u : utilisateurs){
            if(u.getId() == id){
                return u;
            }
        }

        return null;
    }

    @Override
    public void insertUtilisateur(Utilisateur utilisateur) {

    }

    @Override
    public List<Utilisateur> listeUtilisateurs() {
        return utilisateurs;
    }

    private List<Utilisateur> populateListMock(){
        List<Utilisateur> utilisateurs = new ArrayList<>();
        utilisateurs.add(new Utilisateur(1, "mail1@mail.test", "password"));
        utilisateurs.add(new Utilisateur(2, "mail2@mail.test", "password"));
        utilisateurs.add(new Utilisateur(3, "mail3@mail.test", "password"));
        utilisateurs.add(new Utilisateur(4, "mail4@mail.test", "password"));

        return utilisateurs;
    }
}
