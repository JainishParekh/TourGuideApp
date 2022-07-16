package com.example.tourguideapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import java.util.ArrayList;

public class HotelFragment extends Fragment {

    public HotelFragment(){

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View RootView = inflater.inflate(R.layout.list_item_layout , container , false);

        final ArrayList<List> list = new ArrayList<>();

//        list.add(new List("Hyatt Regency" , "Ashram Road" , R.drawable.hyatt));
        list.add(new List("Novotel" , "SG Highway" ,R.drawable.novotel ));
        list.add(new List("Courtyard by Marriott" , "Thaltej" , R.drawable.marriott));
        list.add(new List("Taj Skyline" , "Thaltej" , R.drawable.taj));
        list.add(new List("DoubleTree by Hilton" , "Near IIM" , R.drawable.hilton));
        list.add(new List("Crowne Plaza" , "SG Highway" , R.drawable.crown_plaza));
        list.add(new List("Renaissance" , "SG Highway" , R.drawable.renaissance));
        list.add(new List("Radisson Blu" , "Ellis Bridge" , R.drawable.radisson_blu));
        list.add(new List("Wyndham" , "Sarkhej" , R.drawable.wyndham));
        list.add(new List("THE HILLOCK" , "Ring Road" , R.drawable.hillock));

        ListAdapter listAdapter = new ListAdapter(getActivity() , list , R.color.black);
        ListView listview = (ListView) RootView.findViewById(R.id.list);
        listview.setAdapter(listAdapter);

        return RootView;
    }
}
