package com.amadeo.appmislentes.Vista.ViewContenedorPrincipal.FragmenteTienda;

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
import com.amadeo.appmislentes.Vista.ViewContenedorPrincipal.FragmenteTienda.ListaLentesTienda.ListaTiendaragment;

public class LentesContactoFragment extends Fragment implements View.OnClickListener {

    Button btnTiendaOmbreCON,btnTiendaMujerCON,btnTiendaNiñoCON;
    FragmentTransaction transaction;
    Fragment fragmentListaTienda;


    public LentesContactoFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_contacto, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        fragmentListaTienda=new ListaTiendaragment();

        btnTiendaOmbreCON=view.findViewById(R.id.btnTiendaOmbreCON);
        btnTiendaOmbreCON.setOnClickListener(this);

        btnTiendaMujerCON=view.findViewById(R.id.btnTiendaMujerCON);
        btnTiendaMujerCON.setOnClickListener(this);

        btnTiendaNiñoCON=view.findViewById(R.id.btnTiendaNiñoCON);
        btnTiendaNiñoCON.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        String anteojo="Lentes de Contacto";
        String genero;
        Bundle bundle=new Bundle();
        switch (v.getId()){
            case R.id.btnTiendaOmbreCON:

                genero="Masculino";

                bundle.putString("anteojos",anteojo);
                bundle.putString("genero",genero);
                getParentFragmentManager().setFragmentResult("Key",bundle);
                transaction=getActivity().getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.frameLayoutPrincipal,fragmentListaTienda).commit();
                break;
            case R.id.btnTiendaMujerCON:
                genero="Femenino";

                bundle.putString("anteojos",anteojo);
                bundle.putString("genero",genero);
                getParentFragmentManager().setFragmentResult("Key",bundle);
                transaction=getActivity().getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.frameLayoutPrincipal,fragmentListaTienda).commit();
                break;
            case R.id.btnTiendaNiñoCON:
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