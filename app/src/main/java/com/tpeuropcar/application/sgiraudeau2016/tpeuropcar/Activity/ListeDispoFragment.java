package com.tpeuropcar.application.sgiraudeau2016.tpeuropcar.Activity;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ListView;

import com.tpeuropcar.application.sgiraudeau2016.tpeuropcar.Adapter.VehiculeDisponibleAdapter;
import com.tpeuropcar.application.sgiraudeau2016.tpeuropcar.Classe.VehiculeDisponible;
import com.tpeuropcar.application.sgiraudeau2016.tpeuropcar.R;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link ListeDisponiblesListener} interface
 * to handle interaction events.
 * Use the {@link ListeDispoFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ListeDispoFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private ListView listeDisponibles;
    private ImageButton btnListeLoues;

    private ListeDisponiblesListener mListener;

    List<VehiculeDisponible> vehiculeDisponibleList;

    public ListeDispoFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment ListeDispoFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static ListeDispoFragment newInstance(String param1, String param2) {
        ListeDispoFragment fragment = new ListeDispoFragment();
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
        View v = inflater.inflate(R.layout.fragment_liste_dispo, container, false);

        listeDisponibles = v.findViewById(R.id.liste_vehicules_disponibles);
        btnListeLoues = v.findViewById(R.id.afficher_liste_loues);

        btnListeLoues.setOnClickListener(onClickListenerBtnListeLouees());
        listeDisponibles.setOnItemClickListener(onItemClickListenerListeDispo());

        return v;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof ListeDisponiblesListener) {
            mListener = (ListeDisponiblesListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement ListeDisponiblesListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
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
    public interface ListeDisponiblesListener {
        // TODO: Update argument type and name
        void onClickListLoues();
        void onClickElementListe(VehiculeDisponible vehiculeDisponible);
    }

    private View.OnClickListener onClickListenerBtnListeLouees(){
        return new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mListener.onClickListLoues();
            }
        };
    }

    private AdapterView.OnItemClickListener onItemClickListenerListeDispo(){
        return new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                mListener.onClickElementListe(vehiculeDisponibleList.get(i));
            }
        };
    }

    public void setListe(ArrayList<VehiculeDisponible> liste){
        vehiculeDisponibleList = liste;
        VehiculeDisponibleAdapter adapter = new VehiculeDisponibleAdapter(this.getContext(), liste);
        listeDisponibles.setAdapter(adapter);
    }
}
