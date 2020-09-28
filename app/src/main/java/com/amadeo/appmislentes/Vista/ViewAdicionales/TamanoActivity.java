package com.amadeo.appmislentes.Vista.ViewAdicionales;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.amadeo.appmislentes.R;

public class TamanoActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnTamañoSiguiente;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tamano);

        btnTamañoSiguiente=findViewById(R.id.btnTamañoSiguiente);
        btnTamañoSiguiente.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnTamañoSiguiente:
                Intent intent=new Intent(TamanoActivity.this,PrescripcionActivity.class);
                Toast.makeText(this, "", Toast.LENGTH_SHORT).show();
                startActivity(intent);
                break;
        }
    }
}