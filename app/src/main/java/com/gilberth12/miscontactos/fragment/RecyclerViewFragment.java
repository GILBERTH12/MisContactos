package com.gilberth12.miscontactos.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.gilberth12.miscontactos.R;
import com.gilberth12.miscontactos.adapter.ContactoAdaptador;
import com.gilberth12.miscontactos.pojo.Contacto;

import java.util.ArrayList;

/**
 * Created by Win 10 on 2/07/2017.
 */

public class RecyclerViewFragment extends Fragment {

    ArrayList<Contacto> contactos;
    private RecyclerView rvContactos;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //return super.onCreateView(inflater, container, savedInstanceState);
        View v = inflater.inflate(R.layout.fragment_recyclerview, container, false);

        rvContactos = (RecyclerView) v.findViewById(R.id.rvContactos);

        LinearLayoutManager llm = new LinearLayoutManager(getActivity());
        llm.setOrientation(LinearLayoutManager.VERTICAL);

        rvContactos.setLayoutManager(llm);
        inicializarListaContactos();
        inicializarAdaptador();

        return v;
    }

    public ContactoAdaptador adaptador;

    public void inicializarAdaptador(){
        adaptador = new ContactoAdaptador(contactos, getActivity());
        rvContactos.setAdapter(adaptador);
    }

    public void inicializarListaContactos(){
        contactos = new ArrayList<Contacto>();

        contactos.add(new Contacto(R.drawable.shock_rave_bonus_icon, "Anahi Salgado", "77779999", "anahi@gmail.com"));
        contactos.add(new Contacto(R.drawable.shock_rave_bonus_icon, "Pedro Salgado", "77779988", "pedro@gmail.com"));
        contactos.add(new Contacto(R.drawable.shock_rave_bonus_icon, "Juan Salgado", "77779921", "juan@gmail.com"));
        contactos.add(new Contacto(R.drawable.shock_rave_bonus_icon, "Maria Salgado", "77779911", "maria@gmail.com"));
    }
}
