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

import com.tpeuropcar.application.sgiraudeau2016.tpeuropcar.Classe.Agence;
import com.tpeuropcar.application.sgiraudeau2016.tpeuropcar.R;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link AgenceListener} interface
 * to handle interaction events.
 * Use the {@link AgenceFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class AgenceFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    private EditText raisonSociale;
    private EditText siret;
    private EditText voie;
    private EditText codePostal;
    private EditText ville;
    private Button boutonModifier;

    private Agence agenceRecuperee;


    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private AgenceListener mListener;

    public AgenceFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment AgenceFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static AgenceFragment newInstance(String param1, String param2) {
        AgenceFragment fragment = new AgenceFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_agence, container, false);
        raisonSociale = v.findViewById(R.id.raison_sociale);
        siret = v.findViewById(R.id.siret);
        voie = v.findViewById(R.id.voie);
        codePostal = v.findViewById(R.id.code_postal);
        ville = v.findViewById(R.id.ville);
        boutonModifier = v.findViewById(R.id.btn_modifier);


        //Création des events associés aux éléments
        boutonModifier.setOnClickListener(createModifierListener());

        return v;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof AgenceListener) {
            mListener = (AgenceListener) context;
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

    public void remplirChampsAgence(Agence agence){
        agenceRecuperee = agence;
        raisonSociale.setText(agenceRecuperee.getRaisonSociale());
        siret.setText(agenceRecuperee.getSiret());
        voie.setText(agenceRecuperee.getVoie());
        codePostal.setText(agenceRecuperee.getCodePostal());
        ville.setText(agenceRecuperee.getVille());
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface AgenceListener {
       void onClickModifierAgence(Agence agence);
    }

    private View.OnClickListener createModifierListener(){

        return new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Agence agence = new Agence(
                        agenceRecuperee.getId(),
                        raisonSociale.getText().toString(),
                        siret.getText().toString(),
                        voie.getText().toString(),
                        codePostal.getText().toString(),
                        ville.getText().toString()
                        );
                mListener.onClickModifierAgence(agence);
            }
        };
    }
}
