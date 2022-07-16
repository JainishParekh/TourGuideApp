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

public class PlaceFragment extends Fragment {

    public PlaceFragment(){

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View RootView = inflater.inflate(R.layout.list_item_layout , container , false);

        final ArrayList<List> list = new ArrayList<>();

        list.add(new List("Adivasi museum" , "Inside Gujarat Vidyapeeth Campus, Sattar Taluka Society, Usmanpura" , R.drawable.aadivasi_museum));
        list.add(new List("The Adalaj Stepwell" , "Adalaj Rd, Adalaj" , R.drawable.adalaj_vav));
        list.add(new List("Akshardham Temple" , "J Road, Sector 20, Gandhinagar" , R.drawable.akshardham_temple));
        list.add(new List("Auto World Vintage Car Museum" , " Dastan Estate, Service Rd, Nikol, Kathwada" , R.drawable.auto_world_museum));
        list.add(new List("The Calico Museum of Textiles" , " opp. Underbridge, Jain Colony, Shahibag" , R.drawable.calico_museum_of_textlies));
        list.add(new List("Bai Harir Vav " , "Hanumansingh Rd, Haripura, Asarwa" , R.drawable.dada_harir_vav));
        list.add(new List("Sabarmati Ashram" , " Gandhi Smarak Sangrahalaya, Ashram Rd," , R.drawable.gandhi_ashram));
        list.add(new List("Hutheesing Haveli" , " Gheekanta Rd, Old City, Lati Bazaar, Dariyapur" , R.drawable.hatheesing_haveli));
        list.add(new List("Hutheesing Jain Temple" , "Hutheesing Jain Temple, Camp Rd., Bardolpura, Madhupura" , R.drawable.hutheesinh_temple));
        list.add(new List("Ahmedabad Ni Gufa" , "Kasturbhai Lalbhai Campus Opp Gujarat University campus, CEPT campus, Navrangpura" , R.drawable.hussain_doshi_gufa));
        list.add(new List("Jhulta Minara Sidi Bashir Mosque" , "Opp. Sarangpur Water Tank, Sakar Bazzar, Kalupu" , R.drawable.jhulta_minar));
        list.add(new List("Kankaria Lake" , "Kankaria , Maninagar" , R.drawable.kankaria_lake));

        ListAdapter listAdapter = new ListAdapter(getActivity() , list , R.color.darkred);
        ListView listview = (ListView) RootView.findViewById(R.id.list);
        listview.setAdapter(listAdapter);

        return RootView;
    }
}
