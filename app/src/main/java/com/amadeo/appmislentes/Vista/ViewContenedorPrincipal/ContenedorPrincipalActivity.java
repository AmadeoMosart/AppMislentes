package com.amadeo.appmislentes.Vista.ViewContenedorPrincipal;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;

import com.amadeo.appmislentes.R;
import com.amadeo.appmislentes.Vista.ViewContenedorPrincipal.FragmenPrincipal.CarritoFragment;
import com.amadeo.appmislentes.Vista.ViewContenedorPrincipal.FragmenPrincipal.CuentaFragment;
import com.amadeo.appmislentes.Vista.ViewContenedorPrincipal.FragmenPrincipal.FavoritosFragment;
import com.amadeo.appmislentes.Vista.ViewContenedorPrincipal.FragmenPrincipal.TiendaFragment;
import com.amadeo.appmislentes.Vista.ViewContenedorPrincipal.FragmenPrincipal.TryOnFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class ContenedorPrincipalActivity extends AppCompatActivity {
    BottomNavigationView bnvNavigator;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contenedor_principal);

        this.initObjects();

        bnvNavigator.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                Fragment fragmentSelect=new Fragment();

                switch (item.getItemId()){
                    case R.id.item_Shop:
                        fragmentSelect=new TiendaFragment();
                        break;
                    case R.id.item_try_On:
                        fragmentSelect=new TryOnFragment();
                        break;
                    case R.id.item_favorites:
                        fragmentSelect=new FavoritosFragment();
                        break;
                    case R.id.item_Account:
                        fragmentSelect=new CuentaFragment();
                        break;
                    case R.id.item_car:
                        fragmentSelect=new CarritoFragment();
                        break;
                }
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.frameLayoutPrincipal,fragmentSelect);
                transaction.commit();
                return true;
            }
        });
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.frameLayoutPrincipal,new TiendaFragment());
        transaction.commit();
    }
    private void initObjects() {
        bnvNavigator = findViewById(R.id.bnvNavigator);
    }
}