package com.gilberth12.miscontactos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Contacto> contactos;
    private RecyclerView rvContactos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar miActionBar = (Toolbar) findViewById(R.id.miActionBar);
        setSupportActionBar(miActionBar);

/*
        contactos = new ArrayList<Contacto>();

        contactos.add(new Contacto("Anahi Salgado", "7777777", "anahi@gmail.com"));
        contactos.add(new Contacto("Pedro Salgado", "5557777", "pedro@gmail.com"));
        contactos.add(new Contacto("Juan Salgado", "7774777", "juan@gmail.com"));
        contactos.add(new Contacto("Maria Salgado", "7775447", "maria@gmail.com"));

        ArrayList<String> nombresContacto = new ArrayList<>();
        for (Contacto contacto : contactos){
            nombresContacto.add(contacto.getNombre());
        }*/

        rvContactos = (RecyclerView) findViewById(R.id.rvContactos);

        /*GridLayoutManager glm = new GridLayoutManager(this, 2);*/
        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);

        rvContactos.setLayoutManager(llm);
        inicializarListaContactos();
        inicializarAdaptador();


/*
        ListView lstContactos = (ListView) findViewById(R.id.lstContactos);
        lstContactos.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, nombresContacto));

        lstContactos.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Intent intent = new Intent(MainActivity.this, DetalleContacto.class);
                intent.putExtra(getResources().getString(R.string.pnombre), contactos.get(position).getNombre());
                intent.putExtra(getResources().getString(R.string.ptelefono), contactos.get(position).getTelefono());
                intent.putExtra(getResources().getString(R.string.pemail), contactos.get(position).getEmail());
                startActivity(intent);
                finish();
            }
        });
*/

    }
    public ContactoAdaptador adaptador;
    public void inicializarAdaptador(){
        adaptador = new ContactoAdaptador(contactos, this);
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
