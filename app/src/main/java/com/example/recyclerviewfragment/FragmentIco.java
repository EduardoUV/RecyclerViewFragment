package com.example.recyclerviewfragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;


public class FragmentIco extends Fragment {

    ArrayList<Iconos> listaIco;
    RecyclerView recyclerIconos;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment,container,false);
        listaIco = new ArrayList<>();
        recyclerIconos = (RecyclerView) view.findViewById(R.id.recyclerview);
        recyclerIconos.setLayoutManager(new LinearLayoutManager(getActivity()));

        llenarIconos();
        AdaptadorIconos adapter = new AdaptadorIconos(listaIco);
        recyclerIconos.setAdapter(adapter);


        return view;
    }




    private void llenarIconos() {
        listaIco.add(new Iconos(R.drawable.help, "Help"));
        listaIco.add(new Iconos(R.drawable.rating_favorite, "Favorite"));
        listaIco.add(new Iconos(R.drawable.rating_important, "Important"));
        listaIco.add(new Iconos(R.drawable.rating_good, "Good"));
        listaIco.add(new Iconos(R.drawable.collections_cloud, "Cloud"));
        listaIco.add(new Iconos(R.drawable.content_discard, "Discard"));

    }
}
