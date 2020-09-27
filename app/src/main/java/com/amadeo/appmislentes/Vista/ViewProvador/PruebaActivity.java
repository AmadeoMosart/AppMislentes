package com.amadeo.appmislentes.Vista.ViewProvador;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.amadeo.appmislentes.Modelo.RVImagenPrueba.ImagenPrueba;
import com.amadeo.appmislentes.Modelo.Tienda;
import com.amadeo.appmislentes.R;
import com.amadeo.appmislentes.Vista.ViewAdicionales.TamanoActivity;
import com.amadeo.appmislentes.adapter.RVListaPruebaAdapter;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

public class PruebaActivity extends AppCompatActivity implements View.OnClickListener {

    List<ImagenPrueba> listImagenPrueba = new ArrayList<ImagenPrueba>();
    Button btnPruebaComprar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prueba);

        Obtenerdatos();
        //paso 01 Manager
        LinearLayoutManager llManager = new LinearLayoutManager(getApplicationContext());
        llManager.setOrientation(RecyclerView.HORIZONTAL);
        //*************************************************************************************
        RVListaPruebaAdapter rvListaPruebaAdapter=new RVListaPruebaAdapter(listImagenPrueba);
        //paso 03 Recycler
        RecyclerView rvImagenPrueba=findViewById(R.id.rvImagenPrueba);
        rvImagenPrueba.setLayoutManager(llManager);
        rvImagenPrueba.setAdapter(rvListaPruebaAdapter);


        btnPruebaComprar=findViewById(R.id.btnPruebaComprar);
        btnPruebaComprar.setOnClickListener(this);
    }
    private void Obtenerdatos() {

        listImagenPrueba.add(new ImagenPrueba(
                "https://i.warbycdn.com/s/c/9e664f8776d35b8bc472ef2780dee7d7247de1ba?quality=80&width=500")
        );
        listImagenPrueba.add(new ImagenPrueba(
                "https://i.warbycdn.com/s/c/115cd6e18f98c966f693dbdb67fe4ccaa100bd9f?quality=80&width=500")
        );
        listImagenPrueba.add(new ImagenPrueba(
                "https://i.warbycdn.com/s/c/9364bd33d91d3b3151535692cee138b88d165151?quality=80&width=500")
        );
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnPruebaComprar:
                Intent intent=new Intent(this, TamanoActivity.class);
                startActivity(intent);
                break;
        }
    }
}