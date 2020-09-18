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


import com.amadeo.appmislentes.Modelo.TryOn;
import com.amadeo.appmislentes.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

public class RVListaTryOnAdapter extends RecyclerView.Adapter<RVListaTryOnAdapter.ListaTryOnAdapterHolder> {

    List<TryOn> lsTrayOn = new ArrayList<TryOn>();

    public RVListaTryOnAdapter(List<TryOn> lsTrayOn) {
        this.lsTrayOn = lsTrayOn;
    }

    @NonNull
    @Override
    public RVListaTryOnAdapter.ListaTryOnAdapterHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_lista_tryon, parent, false);
        return new RVListaTryOnAdapter.ListaTryOnAdapterHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RVListaTryOnAdapter.ListaTryOnAdapterHolder holder, int position) {
        final TryOn tryOn=lsTrayOn.get(position);

        //Para agregar imagenes usamos picasso
        Picasso.get().load(tryOn.getUrlFotouno()).into(holder.imgFotoCardTryOn);
        Picasso.get().load(tryOn.getUrlFotodos()).into(holder.idcolor1cardTryOn);
        Picasso.get().load(tryOn.getUrlFototres()).into(holder.idcolor2cardTryOn);
    }

    @Override
    public int getItemCount() {
        return lsTrayOn.size();
    }

    public class ListaTryOnAdapterHolder extends RecyclerView.ViewHolder {

        CardView cvListaTryOn;
        LinearLayout btnBuscarTryOn;
        TextView NombreGafacardTryOn;
        ImageView imgFotoCardTryOn, idcolor1cardTryOn, idcolor2cardTryOn;

        public ListaTryOnAdapterHolder(@NonNull View itemView) {
            super(itemView);
            cvListaTryOn = itemView.findViewById(R.id.cvListaTryOn);
            NombreGafacardTryOn = itemView.findViewById(R.id.NombreGafacardTryOn);
            imgFotoCardTryOn = itemView.findViewById(R.id.imgFotoCardTryOn);
            idcolor1cardTryOn = itemView.findViewById(R.id.idcolor1cardTryOn);
            idcolor2cardTryOn = itemView.findViewById(R.id.idcolor2cardTryOn);
            btnBuscarTryOn = itemView.findViewById(R.id.btnBuscarTryOn);
        }
    }
}
