package com.amadeo.appmislentes.Vista.ViewContenedorPrincipal.FragmenteTienda.ListaLentesTienda;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentResultListener;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import com.amadeo.appmislentes.Modelo.Favoritos;
import com.amadeo.appmislentes.Modelo.Tienda;
import com.amadeo.appmislentes.R;
import com.amadeo.appmislentes.Vista.ViewContenedorPrincipal.FragmenPrincipal.TiendaFragment;
import com.amadeo.appmislentes.Vista.ViewFiltros.FiltrosActivity;
import com.amadeo.appmislentes.adapter.RVListaTiendaAdapter;

import java.util.ArrayList;
import java.util.List;


public class ListaTiendaragment extends Fragment implements View.OnClickListener {

    List<Tienda> listTienda = new ArrayList<Tienda>();
    ImageView imgListaTienda,imgFiltro;
    FragmentTransaction transaction;
    Fragment tiendaFragment;
    Switch switestado;
    TextView edtResultado;

    public ListaTiendaragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
            getParentFragmentManager().setFragmentResultListener("Key", this, new FragmentResultListener() {
                @Override
                public void onFragmentResult(@NonNull String requestKey, @NonNull Bundle result) {
                    String antojo=result.getString("anteojos");
                    String genero=result.getString("genero");

                    edtResultado.setText(antojo);
                }
            });
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_lista_tiendaragment, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        switestado = view.findViewById(R.id.switestado);
        switestado.setOnClickListener(this);

        imgListaTienda = view.findViewById(R.id.imgListaTienda);
        imgListaTienda.setOnClickListener(this);

        imgFiltro= view.findViewById(R.id.imgFiltro);
        imgFiltro.setOnClickListener(this);


        edtResultado=view.findViewById(R.id.edtResultado);

        obtenerdato();

        //paso 01 Manager
        LinearLayoutManager llManager = new LinearLayoutManager(getActivity().getApplicationContext());
        llManager.setOrientation(RecyclerView.VERTICAL);
        //*************************************************************************************
        //paso 02 Adapter
        RVListaTiendaAdapter rvListaTiendaAdapter = new RVListaTiendaAdapter(listTienda);
        //*************************************************************************************
        //paso 03 Recycler
        RecyclerView rvListaTienda = view.findViewById(R.id.rvListaTienda);
        rvListaTienda.setLayoutManager(llManager);
        rvListaTienda.setAdapter(rvListaTiendaAdapter);

        tiendaFragment = new TiendaFragment();
    }

    private void obtenerdato() {
        listTienda.add(new Tienda("S/100.00",
                "https://i.warbycdn.com/s/c/3bbcdc990e4a7bb6f5dac59dc6d80978d1c6115a?quality=75&width=361"));
        listTienda.add(new Tienda("S/220.00",
                "https://i.warbycdn.com/s/c/362f6e151c993745c931fc1cf81139d0b503d319?quality=75&width=361"));
        listTienda.add(new Tienda("S/90.00",
                "https://i.warbycdn.com/s/c/53a9cc64fa7c7a8f7e0fc7b3732954dbe35cbdc4?quality=75&width=361"));
        listTienda.add(new Tienda("S/1500.00",
                "https://i.warbycdn.com/s/c/faf1f5ffde4ab4b80d8fbfa8a23b3cfeb9b2e1a8?quality=75&width=361"));
        listTienda.add(new Tienda("S/1800.00",
                "https://i.warbycdn.com/s/c/c0d4c74f843a01d60ab36b86b3a414b9e7b3279a?quality=75&width=361"));
        listTienda.add(new Tienda("S/200.00",
                "https://i.warbycdn.com/s/c/55b64b4544ceaaa5a61d98dad5b059915483cd1a?quality=75&width=361"));
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.imgListaTienda:
                transaction = getActivity().getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.frameLayoutPrincipal, tiendaFragment).commit();
                break;
            case R.id.switestado:
                if (switestado.isChecked()) {
                    Toast.makeText(getContext(), "Disponible", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getContext(), "No disponible", Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.imgFiltro:
                Intent intent=new Intent(v.getContext(), FiltrosActivity.class);
                v.getContext().startActivity(intent);
                break;


        }
    }
}