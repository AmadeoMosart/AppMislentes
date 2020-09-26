package com.amadeo.appmislentes.Vista.ViewContenedorPrincipal.FragmenPrincipal.FragmentCuenta;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.amadeo.appmislentes.R;
import com.amadeo.appmislentes.Vista.ViewContenedorPrincipal.FragmenPrincipal.FragmentCuenta.ViewMenuCuenta.OdenesFragment;
import com.amadeo.appmislentes.Vista.ViewContenedorPrincipal.FragmenPrincipal.FragmentCuenta.ViewMenuCuenta.PerfilFragment;
import com.amadeo.appmislentes.Vista.ViewContenedorPrincipal.FragmenPrincipal.FragmentCuenta.ViewMenuCuenta.PrescripcionFragment;
import com.amadeo.appmislentes.Vista.ViewContenedorPrincipal.FragmenPrincipal.FragmentCuenta.ViewMenuCuenta.UbicacionTiendaFragment;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link MenuCuentaFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class MenuCuentaFragment extends Fragment implements View.OnClickListener {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    LinearLayout lnOrdenesCuenta,lnPrescripcionCuenta,lnUbicacionTiendaCuenta,lnPrefislCuenta,lnFAQCuenta,lnNotificacionCuenta,lnReseñaCuenta;
    FragmentTransaction transaction;
    Fragment fragmentOrdenes,fragmentPrescripcion,fragmentUbicacion,fragmentPerfil;

    public MenuCuentaFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment MenuCuentaFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static MenuCuentaFragment newInstance(String param1, String param2) {
        MenuCuentaFragment fragment = new MenuCuentaFragment();
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
       View view=inflater.inflate(R.layout.fragment_menu_cuenta, container, false);

        lnOrdenesCuenta=view.findViewById(R.id.lnOrdenesCuenta);
        lnOrdenesCuenta.setOnClickListener(this);

        lnPrescripcionCuenta=view.findViewById(R.id.lnPrescripcionCuenta);
        lnPrescripcionCuenta.setOnClickListener(this);

        lnUbicacionTiendaCuenta=view.findViewById(R.id.lnUbicacionTiendaCuenta);
        lnUbicacionTiendaCuenta.setOnClickListener(this);

        lnPrefislCuenta=view.findViewById(R.id.lnPrefislCuenta);
        lnPrefislCuenta.setOnClickListener(this);

        lnFAQCuenta=view.findViewById(R.id.lnFAQCuenta);
        lnFAQCuenta.setOnClickListener(this);

        lnNotificacionCuenta=view.findViewById(R.id.lnNotificacionCuenta);
        lnNotificacionCuenta.setOnClickListener(this);

        lnReseñaCuenta=view.findViewById(R.id.lnReseñaCuenta);
        lnReseñaCuenta.setOnClickListener(this);

       fragmentOrdenes=new OdenesFragment();
       fragmentPrescripcion=new PrescripcionFragment();
       fragmentUbicacion=new UbicacionTiendaFragment();
       fragmentPerfil=new PerfilFragment();

       return view;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.lnOrdenesCuenta:
                transaction=getActivity().getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.frameLayoutPrincipal,fragmentOrdenes).commit();
                break;
            case R.id.lnPrescripcionCuenta:
                transaction=getActivity().getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.frameLayoutPrincipal,fragmentPrescripcion).commit();
                break;
            case R.id.lnUbicacionTiendaCuenta:
                transaction=getActivity().getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.frameLayoutPrincipal,fragmentUbicacion).commit();
                break;
            case R.id.lnPrefislCuenta:
                transaction=getActivity().getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.frameLayoutPrincipal,fragmentPerfil).commit();
                break;
            case R.id.lnFAQCuenta:
                Toast.makeText(getContext(), "FAQ", Toast.LENGTH_SHORT).show();
                break;
            case R.id.lnNotificacionCuenta:
                Toast.makeText(getContext(), "Notificaciones", Toast.LENGTH_SHORT).show();
                break;
            case R.id.lnReseñaCuenta:
                Toast.makeText(getContext(), "Reseñas", Toast.LENGTH_SHORT).show();
                break;
        }

    }
}