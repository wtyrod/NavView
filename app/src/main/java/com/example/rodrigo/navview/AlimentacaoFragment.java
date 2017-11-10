package com.example.rodrigo.navview;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;


public class AlimentacaoFragment extends ListFragment {

    public AlimentacaoFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_alimentacao, container, false);

        ArrayList<Alimentacao> racao = new ArrayList<>();


        Alimentacao a = new Alimentacao("Kanina", "Filhote 2Kg", "R$25,00", R.drawable.comidinha1);
        racao.add(a);
        a =  new Alimentacao("Kanina", "Media 4Kg", "R$50,00", R.drawable.comidinha1);
        racao.add(a);
        a =  new Alimentacao("Kanina", "Adulto 6Kg", "R$75,00", R.drawable.comidinha1);
        racao.add(a);
        a =  new Alimentacao("Kanina", "Familia 8Kg", "R$100,00", R.drawable.comidinha1);
        racao.add(a);

        ArrayAdapter<Alimentacao> adapter = new ArrayAdapter<Alimentacao>(getContext(),
                R.layout.alimentacao ,
                racao);

        ListView lista =  (ListView) view.findViewById(R.id.IvRacao);
        lista.setAdapter(adapter);

        return view;
    }


}
