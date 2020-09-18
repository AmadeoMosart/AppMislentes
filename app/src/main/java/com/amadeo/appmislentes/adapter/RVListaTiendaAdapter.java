package com.amadeo.appmislentes.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.amadeo.appmislentes.Modelo.Tienda;
import com.amadeo.appmislentes.R;
import com.amadeo.appmislentes.Vista.ViewProvador.PruebaActivity;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

public class RVListaTiendaAdapter extends RecyclerView.Adapter<RVListaTiendaAdapter.ListaTiendaAdapterHolder> {

    List<Tienda> lsTienda = new ArrayList<Tienda>();
    Context context;

    public RVListaTiendaAdapter(List<Tienda> lsTienda) {
        this.lsTienda = lsTienda;
    }

    @NonNull
    @Override
    public ListaTiendaAdapterHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_lista_tienda, parent, false);
        return new ListaTiendaAdapterHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListaTiendaAdapterHolder holder, int position) {
         final Tienda tienda=lsTienda.get(position);

        holder.NombreGafacardTienda.setText(tienda.getTitulo());

        //Para agregar imagenes usamos picasso
        Picasso.get().load(tienda.getUrlFotouno()).into(holder.imgFotoCardTienda);
        Picasso.get().load(tienda.getUrlFotodos()).into(holder.idcolor1cardTienda);
        Picasso.get().load(tienda.getUrlFototres()).into(holder.idcolor2cardTienda);

        holder.btnBuscarTienda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(v.getContext(),PruebaActivity.class);
                v.getContext().startActivity(intent);
            }
        });
    }
    @Override
    public int getItemCount() {
        return lsTienda.size();

    }

    public class ListaTiendaAdapterHolder extends RecyclerView.ViewHolder {

        CardView cvListaTienda;
        LinearLayout btnBuscarTienda;
        TextView NombreGafacardTienda;
        ImageView imgFotoCardTienda,idcolor1cardTienda,idcolor2cardTienda;

        public ListaTiendaAdapterHolder(@NonNull View itemView) {
            super(itemView);
            cvListaTienda= itemView.findViewById(R.id.cvListaTienda);
            NombreGafacardTienda= itemView.findViewById(R.id.NombreGafacardTienda);
            imgFotoCardTienda= itemView.findViewById(R.id.imgFotoCardTienda);
            idcolor1cardTienda= itemView.findViewById(R.id.idcolor1cardTienda);
            idcolor2cardTienda= itemView.findViewById(R.id.idcolor2cardTienda);
            btnBuscarTienda= itemView.findViewById(R.id.btnBuscarTienda);
        }
    }
}
