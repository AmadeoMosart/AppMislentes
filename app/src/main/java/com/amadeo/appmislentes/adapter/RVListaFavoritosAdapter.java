package com.amadeo.appmislentes.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.amadeo.appmislentes.Modelo.Favoritos;
import com.amadeo.appmislentes.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

public class RVListaFavoritosAdapter extends RecyclerView.Adapter<RVListaFavoritosAdapter.ListaFavoritosAdapterrHolder> {
    List<Favoritos> lsFavoritos = new ArrayList<Favoritos>();


    public RVListaFavoritosAdapter(List<Favoritos> lsFavoritos) {
        this.lsFavoritos = lsFavoritos;
    }

    @NonNull
    @Override
    public RVListaFavoritosAdapter.ListaFavoritosAdapterrHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_lista_favoritos, parent, false);
        return new RVListaFavoritosAdapter.ListaFavoritosAdapterrHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RVListaFavoritosAdapter.ListaFavoritosAdapterrHolder holder, int position) {
        final Favoritos favoritos = lsFavoritos.get(position);

        holder.PrecioGafacardFavprito.setText(favoritos.getPresio());

        Picasso.get().load(favoritos.getUrlFotouno()).into(holder.imgFotoCardFavorito);

    }

    @Override
    public int getItemCount() {
        return lsFavoritos.size();
    }

    public class ListaFavoritosAdapterrHolder extends RecyclerView.ViewHolder {

        CardView cvListaFavorito;

        TextView PrecioGafacardFavprito;
        ImageView imgFotoCardFavorito, idcolor1cardFavorito, idcolor2cardFavorito;

        public ListaFavoritosAdapterrHolder(@NonNull View itemView) {
            super(itemView);
            cvListaFavorito = itemView.findViewById(R.id.cvListaFavorito);
            PrecioGafacardFavprito = itemView.findViewById(R.id.PrecioGafacardFavprito);
            imgFotoCardFavorito = itemView.findViewById(R.id.imgFotoCardFavorito);

        }
    }
}
