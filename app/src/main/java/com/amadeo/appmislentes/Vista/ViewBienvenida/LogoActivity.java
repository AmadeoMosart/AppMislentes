package com.amadeo.appmislentes.Vista.ViewBienvenida;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import com.amadeo.appmislentes.R;
import com.amadeo.appmislentes.Vista.ViewContenedorPrincipal.ContenedorPrincipalActivity;

public class LogoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_logo);
        //Agregar Animacion
        Animation animation1= AnimationUtils.loadAnimation(this,R.anim.desplazamiento_arriba);
        Animation animation2= AnimationUtils.loadAnimation(this,R.anim.desplazamiento_abajoa);
        TextView misb=findViewById(R.id.txvMisB);
        TextView lentesb=findViewById(R.id.txvLentesB);
        ImageView LogoImageView=findViewById(R.id.LogoImageView);

        misb.setAnimation(animation2);
        lentesb.setAnimation(animation2);
        LogoImageView.setAnimation(animation1);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent=new Intent(LogoActivity.this, ContenedorPrincipalActivity.class);
                startActivity(intent);
                finish();
            }
        },4000);
    }
}