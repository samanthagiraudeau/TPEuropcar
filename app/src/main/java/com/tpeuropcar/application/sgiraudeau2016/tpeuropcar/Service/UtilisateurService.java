package com.tpeuropcar.application.sgiraudeau2016.tpeuropcar.Service;

import com.tpeuropcar.application.sgiraudeau2016.tpeuropcar.Classe.Utilisateur;
import com.tpeuropcar.application.sgiraudeau2016.tpeuropcar.Mock.UtilisateurMock;

/**
 * Created by fgicquiaud2016 on 09/04/2018.
 */

public class UtilisateurService {

    static UtilisateurService instance;

    private UtilisateurService(){

    }

    public static UtilisateurService getInstance() {
        if(instance == null){
            instance = new UtilisateurService();
        }
        return instance;
    }

    public void inscription(Utilisateur utilisateur){
        UtilisateurMock.getInstance().insertUtilisateur(utilisateur);
    }

    public boolean connexion(String mail, String password){
        for(Utilisateur u : UtilisateurMock.getInstance().listeUtilisateurs()){
            if(u.getMail().equals(mail)){
                return u.getMotDePasse().equals(password);
            }
        }
        return false;
    }
}
