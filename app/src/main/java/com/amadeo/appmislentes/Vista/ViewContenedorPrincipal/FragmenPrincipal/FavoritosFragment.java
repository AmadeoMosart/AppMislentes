package com.amadeo.appmislentes.Vista.ViewContenedorPrincipal.FragmenPrincipal;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.amadeo.appmislentes.Modelo.Favoritos;
import com.amadeo.appmislentes.Modelo.TryOn;
import com.amadeo.appmislentes.R;
import com.amadeo.appmislentes.adapter.RVListaFavoritosAdapter;
import com.amadeo.appmislentes.adapter.RVListaTryOnAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link FavoritosFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FavoritosFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    List<Favoritos> lsFavoritos = new ArrayList<Favoritos>();

    public FavoritosFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment FavoritosFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static FavoritosFragment newInstance(String param1, String param2) {
        FavoritosFragment fragment = new FavoritosFragment();
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
        View view = inflater.inflate(R.layout.fragment_favoritos, container, false);


        obtenerdato();

        //paso 01 Manager
        LinearLayoutManager llManager = new LinearLayoutManager(getActivity().getApplicationContext());
        llManager.setOrientation(RecyclerView.VERTICAL);
        //*************************************************************************************
        //paso 02 Adapter
        RVListaFavoritosAdapter rvListaFavoritosAdapter = new RVListaFavoritosAdapter(lsFavoritos);
        //*************************************************************************************
        //paso 03 Recycler
        RecyclerView rvListaFavorito = view.findViewById(R.id.rvListaFavorito);
        rvListaFavorito.setLayoutManager(llManager);
        rvListaFavorito.setAdapter(rvListaFavoritosAdapter);
        return  view;
    }

    private void obtenerdato() {
        lsFavoritos.add(new Favoritos("S/200.00",
                "https://i.warbycdn.com/s/c/12d6afdcd7326251ee982f8e88e07a51c3812543?quality=75&width=361"));
        lsFavoritos.add(new Favoritos("S/150.00",
                "https://i.warbycdn.com/s/c/3bbcdc990e4a7bb6f5dac59dc6d80978d1c6115a?quality=75&width=361"));
        lsFavoritos.add(new Favoritos("S/80.00",
                "https://i.warbycdn.com/s/c/362f6e151c993745c931fc1cf81139d0b503d319?quality=75&width=361"));
        lsFavoritos.add(new Favoritos("S/200.00",
                "https://i.warbycdn.com/s/c/acec581754ee0f2af56f3b797c4b89241b99f7bc?quality=75&width=361"));

        lsFavoritos.add(new Favoritos("S/180.00",
                "https://i.warbycdn.com/s/c/f068e5ccd8f6ce5765ee6132addc96d9eaba0589?quality=75&width=361"));
        lsFavoritos.add(new Favoritos("S/250.00",
                "https://i.warbycdn.com/s/c/6642374b33b9aef3472047af97f2893b3cd72727?quality=75&width=361"));
    }
}