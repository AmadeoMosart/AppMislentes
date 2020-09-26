package com.amadeo.appmislentes.Vista.ViewFiltros;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.amadeo.appmislentes.R;
import com.amadeo.appmislentes.Vista.ViewContenedorPrincipal.FragmenPrincipal.FragmenteTienda.AnteojoFragment;
import com.amadeo.appmislentes.Vista.ViewContenedorPrincipal.FragmenPrincipal.FragmenteTienda.ListaLentesTienda.ListaTiendaragment;

public class FiltrosActivity extends AppCompatActivity implements View.OnClickListener {
    ImageView clouseFiltro;
    FragmentTransaction transaction;
    Fragment listaTiendaFragment ,anteojosFragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_filtros);

        clouseFiltro = findViewById(R.id.clouseFiltro);
        clouseFiltro.setOnClickListener(this);

        listaTiendaFragment=new ListaTiendaragment();
        anteojosFragment=new AnteojoFragment();

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.clouseFiltro:
                finish();
                break;
        }
    }
}