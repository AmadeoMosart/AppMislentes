package com.amadeo.appmislentes.Vista.ViewContenedorPrincipal.FragmenPrincipal.FragmenteTienda;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.amadeo.appmislentes.R;
import com.amadeo.appmislentes.Vista.ViewContenedorPrincipal.FragmenPrincipal.FragmenteTienda.ListaLentesTienda.ListaTiendaragment;


public class LentesSolFragment extends Fragment implements View.OnClickListener {

    Button btnTiendaOmbreSOL,btnTiendaMujerSOL,btnTiendaNiñoSOL;
    FragmentTransaction transaction;
    Fragment fragmentListaTienda;

    public LentesSolFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_lentes_sol, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        fragmentListaTienda=new ListaTiendaragment();

        btnTiendaOmbreSOL=view.findViewById(R.id.btnTiendaOmbreSOL);
        btnTiendaOmbreSOL.setOnClickListener(this);

        btnTiendaMujerSOL=view.findViewById(R.id.btnTiendaMujerSOL);
        btnTiendaMujerSOL.setOnClickListener(this);

        btnTiendaNiñoSOL=view.findViewById(R.id.btnTiendaNiñoSOL);
        btnTiendaNiñoSOL.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        String anteojo="Lentes de Sol";
        String genero;
        Bundle bundle=new Bundle();
        switch (v.getId()){
            case R.id.btnTiendaOmbreSOL:

                genero="Masculino";

                bundle.putString("anteojos",anteojo);
                bundle.putString("genero",genero);
                getParentFragmentManager().setFragmentResult("Key",bundle);
                transaction=getActivity().getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.frameLayoutPrincipal,fragmentListaTienda).commit();
                break;
            case R.id.btnTiendaMujerSOL:
                genero="Femenino";

                bundle.putString("anteojos",anteojo);
                bundle.putString("genero",genero);
                getParentFragmentManager().setFragmentResult("Key",bundle);
                transaction=getActivity().getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.frameLayoutPrincipal,fragmentListaTienda).commit();
                break;
            case R.id.btnTiendaNiñoSOL:
                genero="Niño";

                bundle.putString("anteojos",anteojo);
                bundle.putString("genero",genero);
                getParentFragmentManager().setFragmentResult("Key",bundle);
                transaction=getActivity().getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.frameLayoutPrincipal,fragmentListaTienda).commit();
                break;
        }
    }
}