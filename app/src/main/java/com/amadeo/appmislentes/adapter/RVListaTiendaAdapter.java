package com.amadeo.appmislentes.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.SurfaceControl;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

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
    public void onBindViewHolder(@NonNull final ListaTiendaAdapterHolder holder, int position) {
        final Tienda tienda = lsTienda.get(position);

        holder.PrecioGafacardTienda.setText(tienda.getPresio());

        //Para agregar imagenes usamos picasso
        Picasso.get().load(tienda.getUrlFotouno()).into(holder.imgFotoCardTienda);


        holder.btnBuscarTienda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), PruebaActivity.class);
                v.getContext().startActivity(intent);
            }
        });

        holder.estadoLike.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               holder.estadoLike.setVisibility(v.INVISIBLE);
               holder.estadodisLike.setVisibility(v.VISIBLE);
            }
        });

        holder.estadodisLike.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                holder.estadodisLike.setVisibility(v.INVISIBLE);
                holder.estadoLike.setVisibility(v.VISIBLE);
            }
        });

        holder.corazonlike.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                holder.corazonlike.setVisibility(v.INVISIBLE);
                holder.corazondislike.setVisibility(v.VISIBLE);
            }
        });

        holder.corazondislike.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                holder.corazondislike.setVisibility(v.INVISIBLE);
                holder.corazonlike.setVisibility(v.VISIBLE);
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
        TextView PrecioGafacardTienda;
        ImageView imgFotoCardTienda, estadoLike, estadodisLike,corazonlike,corazondislike;

        public ListaTiendaAdapterHolder(@NonNull View itemView) {
            super(itemView);
            cvListaTienda = itemView.findViewById(R.id.cvListaTienda);
            PrecioGafacardTienda = itemView.findViewById(R.id.PrecioGafacardTienda);
            imgFotoCardTienda = itemView.findViewById(R.id.imgFotoCardTienda);
            btnBuscarTienda = itemView.findViewById(R.id.btnBuscarTienda);

            estadoLike = itemView.findViewById(R.id.estadoLike);
            estadodisLike = itemView.findViewById(R.id.estadodisLike);

            corazonlike = itemView.findViewById(R.id.corazonlike);
            corazondislike = itemView.findViewById(R.id.corazondislike);
        }
    }
}
