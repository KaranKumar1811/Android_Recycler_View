package com.example.android_recycler_view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class CountryDetailActivity extends AppCompatActivity {

    private Country country;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_country_detail);
        country=getIntent().getParcelableExtra("country");
        Log.d("TAG",country.getTitle());
    }
}
