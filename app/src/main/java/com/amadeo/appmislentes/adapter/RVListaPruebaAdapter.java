package com.amadeo.appmislentes.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.amadeo.appmislentes.Modelo.RVImagenPrueba.ImagenPrueba;
import com.amadeo.appmislentes.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

public class RVListaPruebaAdapter extends RecyclerView.Adapter<RVListaPruebaAdapter.ListaPruebaAdapterHolder> {
    List<ImagenPrueba> listaimagenPruebaModel= new ArrayList<ImagenPrueba>();

    public RVListaPruebaAdapter(List<ImagenPrueba> listaimagenPruebaModel) {
        this.listaimagenPruebaModel = listaimagenPruebaModel;
    }


    @NonNull
    @Override
    public RVListaPruebaAdapter.ListaPruebaAdapterHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_listaimf, parent, false);
        return new ListaPruebaAdapterHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RVListaPruebaAdapter.ListaPruebaAdapterHolder holder, int position) {
        final ImagenPrueba imgImagenPrueba = listaimagenPruebaModel.get(position);

        Picasso.get().load(imgImagenPrueba.getLangLogo()).into(holder.img_view);
    }

    @Override
    public int getItemCount() {
        return listaimagenPruebaModel.size();
    }

    public class ListaPruebaAdapterHolder extends RecyclerView.ViewHolder {
        ImageView img_view;
        CardView cvImagenPrueba;

        public ListaPruebaAdapterHolder(@NonNull View itemView) {
            super(itemView);
            img_view = itemView.findViewById(R.id.img_view);
            cvImagenPrueba = itemView.findViewById(R.id.cvImagenPrueba);
        }
    }
}
