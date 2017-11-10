package com.example.rodrigo.navview;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridLayout;


public class AdocaoFragment extends Fragment {

    GridLayout mainGrid;
    public AdocaoFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_adocao, container, false);
        mainGrid= (GridLayout) view.findViewById(R.id.mainGrid);
        setSingleEvent(mainGrid);
        return view;
    }

    private void setSingleEvent(GridLayout mainGrid) {
        //loop all child item of main grid
        for(int i=0;i<mainGrid.getChildCount();i++){
            //You can see, all child item is CardView, so we just cast object to cardView
            CardView cardView = (CardView)mainGrid.getChildAt(i);
            cardView.setOnClickListener(new View.OnClickListener(){

                @Override
                public void onClick(View v) {
                    //here you can replace toast with start new activity code
                }
            });
        }
    }

}
