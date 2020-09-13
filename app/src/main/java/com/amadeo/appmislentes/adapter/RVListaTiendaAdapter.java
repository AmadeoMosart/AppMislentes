package com.amadeo.appmislentes.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.amadeo.appmislentes.Modelo.Tienda;
import com.amadeo.appmislentes.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

public class RVListaTiendaAdapter extends RecyclerView.Adapter<RVListaTiendaAdapter.ListaTiendaAdapterHolder> {

    List<Tienda> lsTienda = new ArrayList<Tienda>();

    public RVListaTiendaAdapter(List<Tienda> lsTienda) {
        this.lsTienda = lsTienda;
    }

    @NonNull
    @Override
    public RVListaTiendaAdapter.ListaTiendaAdapterHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_lista_tienda, parent, false);
        ListaTiendaAdapterHolder listaTiendaAdapterHolder = new ListaTiendaAdapterHolder(view);
        return listaTiendaAdapterHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RVListaTiendaAdapter.ListaTiendaAdapterHolder holder, int position) {
        Tienda tienda=lsTienda.get(position);

        holder.NombreGafacard.setText(tienda.getTitulo());

        //Para agregar imagenes usamos picasso
        Picasso.get().load(tienda.getUrlFotouno()).into(holder.imgFotoCard);
        Picasso.get().load(tienda.getUrlFotodos()).into(holder.idcolor1card);
        Picasso.get().load(tienda.getUrlFototres()).into(holder.idcolor2card);
    }

    @Override
    public int getItemCount() {
        return lsTienda.size();
    }

    public class ListaTiendaAdapterHolder extends RecyclerView.ViewHolder {

        CardView cvListaTienda;
        TextView NombreGafacard;
        ImageView imgFotoCard,idcolor1card,idcolor2card;

        public ListaTiendaAdapterHolder(@NonNull View itemView) {
            super(itemView);
            cvListaTienda= itemView.findViewById(R.id.cvListaTienda);
            NombreGafacard= itemView.findViewById(R.id.NombreGafacard);
            imgFotoCard= itemView.findViewById(R.id.imgFotoCard);
            idcolor1card= itemView.findViewById(R.id.idcolor1card);
            idcolor2card= itemView.findViewById(R.id.idcolor2card);
        }
    }
}
