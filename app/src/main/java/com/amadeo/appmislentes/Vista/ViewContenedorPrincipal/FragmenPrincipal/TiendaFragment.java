package com.amadeo.appmislentes.Vista.ViewContenedorPrincipal.FragmenPrincipal;

import android.os.Bundle;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.amadeo.appmislentes.R;
import com.amadeo.appmislentes.Vista.ViewContenedorPrincipal.FragmenteTienda.AnteojoFragment;
import com.amadeo.appmislentes.Vista.ViewContenedorPrincipal.FragmenteTienda.LentesContactoFragment;
import com.amadeo.appmislentes.Vista.ViewContenedorPrincipal.FragmenteTienda.LentesSolFragment;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link TiendaFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class TiendaFragment extends Fragment implements View.OnClickListener {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    FragmentTransaction transaction;
    Fragment fragmentAnteojo, fragmentContacto, fragmentSol;
    LinearLayout gonecontacto, anteojogone, solgone;
    LinearLayout layout;

    public TiendaFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment TiendaFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static TiendaFragment newInstance(String param1, String param2) {
        TiendaFragment fragment = new TiendaFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        final View view = inflater.inflate(R.layout.fragment_tienda, container, false);

        TextView item_contacto = view.findViewById(R.id.item_contacto);
        item_contacto.setOnClickListener(this);

        TextView item_anteojos = view.findViewById(R.id.item_anteojos);
        item_anteojos.setOnClickListener(this);

        TextView item_sol = view.findViewById(R.id.item_sol);
        item_sol.setOnClickListener(this);

        gonecontacto = view.findViewById(R.id.gonecontacto);
        anteojogone = view.findViewById(R.id.anteojogone);
        solgone = view.findViewById(R.id.solgone);
        layout = view.findViewById(R.id.cl);
        layout.setBackgroundResource(R.drawable.gafas);

        fragmentContacto = new LentesContactoFragment();
        fragmentAnteojo = new AnteojoFragment();
        fragmentSol = new LentesSolFragment();

        getActivity().getSupportFragmentManager().beginTransaction().add(R.id.frameLayoutTienda, fragmentAnteojo).commit();

        return view;

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.item_contacto:
                transaction = getActivity().getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.frameLayoutTienda, fragmentContacto).commit();

                anteojogone.setVisibility(View.INVISIBLE);
                gonecontacto.setVisibility(View.VISIBLE);
                solgone.setVisibility(View.INVISIBLE);

                layout.setBackgroundResource(R.drawable.contacimg);
                break;
            case R.id.item_anteojos:
                transaction = getActivity().getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.frameLayoutTienda, fragmentAnteojo).commit();

                anteojogone.setVisibility(View.VISIBLE);
                gonecontacto.setVisibility(View.INVISIBLE);
                solgone.setVisibility(View.INVISIBLE);

                layout.setBackgroundResource(R.drawable.gafas);
                break;
            case R.id.item_sol:
                transaction = getActivity().getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.frameLayoutTienda, fragmentSol).commit();

                anteojogone.setVisibility(View.INVISIBLE);
                gonecontacto.setVisibility(View.INVISIBLE);
                solgone.setVisibility(View.VISIBLE);

                layout.setBackgroundResource(R.drawable.solimg);
                break;
        }
    }
}