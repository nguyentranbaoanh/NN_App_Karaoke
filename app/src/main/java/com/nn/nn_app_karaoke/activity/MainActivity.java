package com.nn.nn_app_karaoke.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.nn.nn_app_karaoke.R;
import com.nn.nn_app_karaoke.model.BaiHat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView _listDS_All, _listDS_Favorite;
    ArrayList<BaiHat> _arrAll, _arrFavorite;
    ArrayAdapter<BaiHat> _adapterAll, _adapterFavorite;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
