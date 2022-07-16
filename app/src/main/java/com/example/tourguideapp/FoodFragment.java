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

public class FoodFragment extends Fragment {

    public FoodFragment(){

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View RootView = inflater.inflate(R.layout.list_item_layout , container , false);

        final ArrayList<List> list = new ArrayList<>();
        list.add(new List("The House of Makeba" ,
                " 2, Sigma Corporates, Sindhubhavan Marg, opp. Courtyard Marriott, PRL Colony",
                R.drawable.houseofmakeba));
        list.add(new List("Sankalp" ,
                " 2, Sigma Corporates, Sindhubhavan Marg, opp. Courtyard Marriott, PRL Colony",
                R.drawable.sankalp_restaurant));
        list.add(new List("Puffiyana" ,
                "  29, Uttamnagar, Daxini Society, Maninagar",
                R.drawable.puffiyana));
        list.add(new List("Agashiye" ,
                "The House Of M G, Lal darwaja, opp. Sidi Saiyed Jali, Lal Darwaja",
                R.drawable.agashiye));
        list.add(new List("The Green House" ,
                "Bhadra Rd, Opposite Sidi Saiyed Jali, Near Relief Road, Gheekanta, Lal Darwaja",
                R.drawable.green_house));
        list.add(new List("Gopi Dinning Hall" ,
                " Avadhesh Huse, Ground Floor, Off, Ashram Rd, Pritam Nagar, Ellisbridge",
                R.drawable.gopi));
        list.add(new List("Tamato's" ,
                "Mardia Plaza,Chimanlal Girdharlal Rd,Opp. Reliance House,Ellisbridge",
                R.drawable.tomato));
        list.add(new List("Karnavati Dabeli Center" ,
                "Radhamandir Complex, Shop No. 1, Isanpur Rd, opp. TOWER-2, Uttamnagar",
                R.drawable.karnavati));
        list.add(new List("Jassi De Parathe" ,
                "107, Safal Pegasus, 100 Feet Anand Nagar Rd, above McDonald's, Prahlad Nagar",
                R.drawable.jassi_de_paranthe));
        list.add(new List("Barbeque Nation" ,
                "SATYA ONE, 1st Floor, Drive In Rd, opp. Manav Mandir, Memnagar",
                R.drawable.barbaque_nation));
        list.add(new List("Gordhan Thal" ,
                "Sapath Complex,SG-Hwy, Opposite Rajpath Club, Bodakdev",
                R.drawable.gordhan_thal));
        list.add(new List("Vishalla" ,
                "Opp. APMC Market Vishala, Circle, Vasna",
                R.drawable.vishala));
        list.add(new List("Atithi Dining Hall" ,
                "KAVYA TRADERS, Mohini, Zanzarwadi Rd, opposite Shraddha Petrol Pump, Bodakdev",
                R.drawable.atithi));

        ListAdapter listAdapter = new ListAdapter(getActivity() , list , R.color.teal2);
        ListView listView = (ListView) RootView.findViewById(R.id.list);
        listView.setAdapter(listAdapter);

        return RootView;
    }
}
