package com.amadeo.appmislentes.Vista.ViewContenedorPrincipal.FragmenPrincipal.FragmentCuenta.ViewMenuCuenta;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.amadeo.appmislentes.R;

public class PrescripcionFragment extends Fragment {



    public PrescripcionFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_prescripcion, container, false);
    }
}