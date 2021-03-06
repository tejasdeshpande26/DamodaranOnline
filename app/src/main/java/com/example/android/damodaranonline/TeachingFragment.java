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


public class TeachingFragment extends Fragment {


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_teaching, container, false);

        /*List 1*/
        String[] lv1 = {"Undergraduate: Corporate Finance", "Undergraduate: Valuation", "MBA: Corporate Finance", "MBA: Valuation"};
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
        String[] lv2 = {"Corporate Finance: 2-3 days", "Valuation: 2-3 days"};
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
        String[] lv3 = {"Corporate Finance", "Valuation", "MBA: Corporate Finance", "Investment Philosophy"};
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
        String[] lv4 = {"Archived Seminars", "Upcoming Seminars"};
        ListView listView4 = v.findViewById(R.id.listview4);
        listView4.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getActivity(), "This is my Toast message!", Toast.LENGTH_LONG).show();
            }
        });
        ArrayAdapter<String> arrayAdapter4 = new ArrayAdapter<>(getActivity(), R.layout.list_row, lv4);
        listView4.setAdapter(arrayAdapter4);

        return v;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }

}