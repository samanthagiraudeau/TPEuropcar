package com.tpeuropcar.application.sgiraudeau2016.tpeuropcar.Activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.tpeuropcar.application.sgiraudeau2016.tpeuropcar.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class ConnexionFragment extends Fragment {

    private OnConnexionListener mListener;
    private Button seConnecter;
    private Button sInscrire;
    private EditText nomUtilisateur;
    private EditText motDePasse;

    public ConnexionFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_connexion, container, false);

        this.nomUtilisateur = v.findViewById(R.id.nom_utilisateur);
        this.motDePasse = v.findViewById(R.id.mot_de_passe);
        this.seConnecter = v.findViewById(R.id.se_connecter);
        this.sInscrire = v.findViewById(R.id.inscription);

        this.seConnecter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (motDePasse.getText().toString().isEmpty()) {
                    motDePasse.setError("Veuillez saisir un mot de passe");
                } else {
                    mListener.seConnecter(nomUtilisateur.getText().toString(), motDePasse.getText().toString());
                }
            }
        });


        this.sInscrire.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mListener.inscrireNewUtilisateur();
            }
        });

        return v;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnConnexionListener) {
            mListener = (OnConnexionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnConnexionListener");
        }
    }

    public interface OnConnexionListener {
        void seConnecter(String identifiant, String motDePasse);
        void inscrireNewUtilisateur();
    }

}
