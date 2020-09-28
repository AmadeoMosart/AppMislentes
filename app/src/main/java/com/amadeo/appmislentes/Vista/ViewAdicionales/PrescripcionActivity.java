package com.amadeo.appmislentes.Vista.ViewAdicionales;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.amadeo.appmislentes.R;

public class PrescripcionActivity extends AppCompatActivity implements View.OnClickListener {

Button btnPrescription;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prescripcion);
        btnPrescription=findViewById(R.id.btnPrescription);
        btnPrescription.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
     switch (v.getId()){
         case R.id.btnPrescription:
             Intent intent = new Intent(PrescripcionActivity.this, TipoLenteActivity.class);
             Toast.makeText(this, "", Toast.LENGTH_SHORT).show();
             startActivity(intent);
             break;
     }
    }
}