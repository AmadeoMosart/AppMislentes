package com.amadeo.appmislentes.Vista.ViewContenedorPrincipal.FragmenPrincipal;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.amadeo.appmislentes.Modelo.Tienda;
import com.amadeo.appmislentes.Modelo.TryOn;
import com.amadeo.appmislentes.R;
import com.amadeo.appmislentes.adapter.RVListaTryOnAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link TryOnFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class TryOnFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    List<TryOn> lsTrayOn = new ArrayList<TryOn>();

    public TryOnFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment TryOnFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static TryOnFragment newInstance(String param1, String param2) {
        TryOnFragment fragment = new TryOnFragment();
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
        View view =  inflater.inflate(R.layout.fragment_try_on, container, false);

        obtenerdato();

        //paso 01 Manager
        LinearLayoutManager llManager = new LinearLayoutManager(getActivity().getApplicationContext());
        llManager.setOrientation(RecyclerView.VERTICAL);
        //*************************************************************************************
        //paso 02 Adapter
        RVListaTryOnAdapter rvListaTryOnAdapter = new RVListaTryOnAdapter(lsTrayOn);
        //*************************************************************************************
        //paso 03 Recycler
        RecyclerView rvListaTryOn = view.findViewById(R.id.rvListaTryOn);
        rvListaTryOn.setLayoutManager(llManager);
        rvListaTryOn.setAdapter(rvListaTryOnAdapter);
        return view;
    }

    private void obtenerdato() {
            lsTrayOn.add(new TryOn("UDEMY",
                    "https://i.warbycdn.com/s/c/9e664f8776d35b8bc472ef2780dee7d7247de1ba?quality=75&width=361",
                    "https://i.warbycdn.com/-/f/fore5d60246e",
                    "https://i.warbycdn.com/-/f/color-whiskey-tortoise-44ffbb63"));
            lsTrayOn.add(new TryOn("UDEMY",
                    "https://i.warbycdn.com/s/c/7815cfc3b97240eeca06e1142b9531746cae2c72?quality=75&width=361",
                    "https://i.warbycdn.com/-/f/fore5d60246e",
                    "https://i.warbycdn.com/-/f/color-whiskey-tortoise-44ffbb63"));
            lsTrayOn.add(new TryOn("UDEMY",
                    "https://i.warbycdn.com/s/c/53a9cc64fa7c7a8f7e0fc7b3732954dbe35cbdc4?quality=75&width=361",
                    "https://i.warbycdn.com/-/f/fore5d60246e",
                    "https://i.warbycdn.com/-/f/color-whiskey-tortoise-44ffbb63"));
            lsTrayOn.add(new TryOn("UDEMY",
                    "https://i.warbycdn.com/s/c/faf1f5ffde4ab4b80d8fbfa8a23b3cfeb9b2e1a8?quality=75&width=361",
                    "https://i.warbycdn.com/-/f/fore5d60246e",
                    "https://i.warbycdn.com/-/f/color-whiskey-tortoise-44ffbb63"));
    }
}