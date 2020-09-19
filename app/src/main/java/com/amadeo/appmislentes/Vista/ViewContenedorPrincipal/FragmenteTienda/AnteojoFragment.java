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
import android.widget.Toast;

import com.amadeo.appmislentes.R;
import com.amadeo.appmislentes.Vista.ViewContenedorPrincipal.FragmenteTienda.ListaLentesTienda.ListaTiendaragment;

public class AnteojoFragment extends Fragment implements View.OnClickListener {

    Button btnTiendaOmbreFA,btnTiendaMujerFA,btnTiendaNiñoFA;
    FragmentTransaction transaction;
    Fragment fragmentListaTienda;

    public AnteojoFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_anteojo, container, false);

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        fragmentListaTienda=new ListaTiendaragment();

        btnTiendaOmbreFA=view.findViewById(R.id.btnTiendaOmbreFA);
        btnTiendaOmbreFA.setOnClickListener(this);

        btnTiendaMujerFA=view.findViewById(R.id.btnTiendaMujerFA);
        btnTiendaMujerFA.setOnClickListener(this);

        btnTiendaNiñoFA=view.findViewById(R.id.btnTiendaNiñoFA);
        btnTiendaNiñoFA.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        String anteojo="Anteojos";
        String genero;
        Bundle bundle=new Bundle();
        switch (v.getId()){
            case R.id.btnTiendaOmbreFA:

                genero="Masculino";

                bundle.putString("anteojos",anteojo);
                bundle.putString("genero",genero);
                getParentFragmentManager().setFragmentResult("Key",bundle);
                transaction=getActivity().getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.frameLayoutPrincipal,fragmentListaTienda).commit();
                break;
            case R.id.btnTiendaMujerFA:
                genero="Femenino";

                bundle.putString("anteojos",anteojo);
                bundle.putString("genero",genero);
                getParentFragmentManager().setFragmentResult("Key",bundle);
                transaction=getActivity().getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.frameLayoutPrincipal,fragmentListaTienda).commit();
                break;
            case R.id.btnTiendaNiñoFA:
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