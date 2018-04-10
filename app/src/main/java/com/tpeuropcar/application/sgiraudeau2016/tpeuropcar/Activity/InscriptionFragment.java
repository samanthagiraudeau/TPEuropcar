package com.tpeuropcar.application.sgiraudeau2016.tpeuropcar.Activity;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.tpeuropcar.application.sgiraudeau2016.tpeuropcar.Classe.Utilisateur;
import com.tpeuropcar.application.sgiraudeau2016.tpeuropcar.R;


public class InscriptionFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    private InscriptionFragment.OnInscriptionListener mListener;
    private Button sInscrire;
    private EditText nomUtilisateur;
    private EditText motDePasse;
    private EditText motDePasseConfirmation;
    private EditText token;



    public InscriptionFragment() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_inscription, container, false);

        this.nomUtilisateur = v.findViewById(R.id.nom_utilisateur);
        this.motDePasse = v.findViewById(R.id.mot_de_passe);
        this.motDePasseConfirmation = v.findViewById(R.id.mot_de_passe_confirmation);
        this.token = v.findViewById(R.id.token);
        this.sInscrire = v.findViewById(R.id.inscription);



        sInscrire.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boolean inscrire = false;

                // Vérif token
                if(!token.getText().toString().isEmpty()) {
                    inscrire = true;  // d'autres vérifs à faire
                } else {
                    token.setError("Le token ne peut pas être vide.");
                }


                // vérif mot de passe
                if(motDePasse.getText().toString().equals(motDePasseConfirmation.getText().toString())) {
                    inscrire = true;
                } else {
                    inscrire = false;
                    motDePasseConfirmation.setError("La confirmation du mot de passe ne correspond pas.");
                }

                if(inscrire) {
                    Utilisateur newUtilisateur = new Utilisateur();
                    newUtilisateur.setMail(nomUtilisateur.getText().toString());
                    newUtilisateur.setMotDePasse(motDePasse.getText().toString());
                    newUtilisateur.setToken(token.getText().toString());
                    mListener.inscrireNewUtilisateur(newUtilisateur);
                    //mListener.inscrireNewUtilisateur(nomUtilisateur.getText().toString());
                }
            }
        });


        return v;
    }



    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnInscriptionListener) {
            mListener = (OnInscriptionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement AgenceListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }


    public interface OnInscriptionListener {
       void inscrireNewUtilisateur(Utilisateur utilisateur);
       //void inscrireNewUtilisateur(String identifiant);
    }
}
