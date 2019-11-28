package com.example.android_recycler_view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rvCountryList;
    private List<Country> countryList;

    RecyclerViewAdapter recyclerViewAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();

    }

    private void initViews(){
        populateData();
        rvCountryList=findViewById(R.id.recyclerView);
        recyclerViewAdapter=new RecyclerViewAdapter(countryList);
        RecyclerView.LayoutManager layoutManager=new LinearLayoutManager(getApplicationContext());
        rvCountryList.setLayoutManager(layoutManager);
        rvCountryList.setAdapter(recyclerViewAdapter);


    }

    private void populateData()
    {
        countryList = new ArrayList<>();

        countryList.add(new Country("India",R.drawable.ic_india));
        countryList.add(new Country("Pakistan",R.drawable.ic_pk));
        countryList.add(new Country("USA",R.drawable.ic_us));
        countryList.add(new Country("India",R.drawable.ic_india));
        countryList.add(new Country("Pakistan",R.drawable.ic_pk));
        countryList.add(new Country("USA",R.drawable.ic_us));
        countryList.add(new Country("India",R.drawable.ic_india));
        countryList.add(new Country("Pakistan",R.drawable.ic_pk));
        countryList.add(new Country("USA",R.drawable.ic_us));
        countryList.add(new Country("India",R.drawable.ic_india));
        countryList.add(new Country("Pakistan",R.drawable.ic_pk));
        countryList.add(new Country("USA",R.drawable.ic_us));

    }
}
