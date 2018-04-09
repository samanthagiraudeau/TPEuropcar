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
        this.sInscrire = v.findViewById(R.id.inscription);

        sInscrire.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(motDePasse.getText().toString() != motDePasseConfirmation.getText().toString()) {
                    motDePasseConfirmation.setError("La confirmation du mot de passe ne correspond pas.");
                } else {
                    /*Utilisateur newUtilisateur = Utilisateur();
                    // TODO setter
                    newUtilisateur.setNom();
                    mListener.inscrireNewUtilisateur(newUtilisateur);*/
                    mListener.inscrireNewUtilisateur(nomUtilisateur.getText().toString());
                }
            }
        });


        return inflater.inflate(R.layout.fragment_inscription, container, false);
    }



    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnInscriptionListener) {
            mListener = (OnInscriptionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }


    public interface OnInscriptionListener {
       //void inscrireNewUtilisateur(Utilisateur utilisateur);
        void inscrireNewUtilisateur(String identifiant);
    }
}
