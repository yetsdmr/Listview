package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<KullaniciModel> kulllaniciList;
    KullaniciListAdapter adp;
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listeDoldur();
        tanimla();
    }
    public void listeDoldur(){
        kulllaniciList = new ArrayList<>();
        KullaniciModel k1 = new KullaniciModel("Emre","Taşdemir", "25","x");
        KullaniciModel k2 = new KullaniciModel("Ali","Ser","30","y");
        KullaniciModel k3 = new KullaniciModel("Ayse","der","25","t");
        KullaniciModel k4 = new KullaniciModel("Ley","Ka","19","f");
        kulllaniciList.add(k1);
        kulllaniciList.add(k2);
        kulllaniciList.add(k3);
        kulllaniciList.add(k4);
        adp = new KullaniciListAdapter(kulllaniciList,this);
        listView.setAdapter(adp);
    }
    private void tanimla(){
        listView = findViewById(R.id.listView);
    }
}