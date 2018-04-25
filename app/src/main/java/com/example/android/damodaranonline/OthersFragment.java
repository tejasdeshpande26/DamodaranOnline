package com.example.android.damodaranonline;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;


public class OthersFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_others, container, false);

        /*List 1*/
        String[] lv1 = {"Read the Bio"};
        ListView listView1 = v.findViewById(R.id.listview1);
        listView1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getActivity(), "This is my Toast message!", Toast.LENGTH_LONG).show();
            }
        });
        ArrayAdapter<String> arrayAdapter1 = new ArrayAdapter<>(getActivity(), R.layout.list_row, lv1);
        listView1.setAdapter(arrayAdapter1);

        /*List 2*/
        String[] lv2 = {"Damodaran Teaching Philosophy"};
        ListView listView2 = v.findViewById(R.id.listview2);
        listView2.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getActivity(), "This is my Toast message!", Toast.LENGTH_LONG).show();
            }
        });
        ArrayAdapter<String> arrayAdapter2 = new ArrayAdapter<>(getActivity(), R.layout.list_row, lv2);
        listView2.setAdapter(arrayAdapter2);

        /*List 3*/
        String[] lv3 = {"Accounting", "Statistics", "Present Value", "Statistical Distribution", "Risk Aversion"};
        ListView listView3 = v.findViewById(R.id.listview3);
        listView3.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getActivity(), "This is my Toast message!", Toast.LENGTH_LONG).show();
            }
        });
        ArrayAdapter<String> arrayAdapter3 = new ArrayAdapter<>(getActivity(), R.layout.list_row, lv3);
        listView3.setAdapter(arrayAdapter3);

        /*List 4*/
        String[] lv4 = {"Financial Terms", "Financial Ratios & Measures"};
        ListView listView4 = v.findViewById(R.id.listview4);
        listView4.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getActivity(), "This is my Toast message!", Toast.LENGTH_LONG).show();
            }
        });
        ArrayAdapter<String> arrayAdapter4 = new ArrayAdapter<>(getActivity(), R.layout.list_row, lv4);
        listView4.setAdapter(arrayAdapter4);

        /*List 5*/
        String[] lv5 = {"Email Damodaran"};
        ListView listView5 = v.findViewById(R.id.listview5);
        listView5.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getActivity(), "This is my Toast message!", Toast.LENGTH_LONG).show();
            }
        });
        ArrayAdapter<String> arrayAdapter5 = new ArrayAdapter<>(getActivity(), R.layout.list_row, lv5);
        listView5.setAdapter(arrayAdapter5);

        /*List 6*/
        String[] lv6 = {"Report a Bug"};
        ListView listView6 = v.findViewById(R.id.listview6);
        listView6.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getActivity(), "This is my Toast message!", Toast.LENGTH_LONG).show();
            }
        });
        ArrayAdapter<String> arrayAdapter6 = new ArrayAdapter<>(getActivity(), R.layout.list_row, lv6);
        listView6.setAdapter(arrayAdapter6);

        /*List 7*/
        String[] lv7 = {"Credits & FAQs", "Downloads", "Buy Developer a Coffee"};
        ListView listView7 = v.findViewById(R.id.listview7);
        listView7.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getActivity(), "This is my Toast message!", Toast.LENGTH_LONG).show();
            }
        });
        ArrayAdapter<String> arrayAdapter7 = new ArrayAdapter<>(getActivity(), R.layout.list_row, lv7);
        listView7.setAdapter(arrayAdapter7);

        return v;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }

}