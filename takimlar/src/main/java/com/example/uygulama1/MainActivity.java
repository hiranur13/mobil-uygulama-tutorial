package com.example.uygulama1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lvTakim;
    ArrayList<Takim>liste;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        lvTakim=findViewById(R.id.lv_takim);

        liste=new ArrayList<>();
        liste.add(new Takim(R.drawable.bjk,"BEŞİKTAŞ",1903,getString(R.string.bjk)));
        liste.add(new Takim(R.drawable.fb,"Fenerbahçe",1907,getString(R.string.fb)));
        liste.add(new Takim(R.drawable.gs,"Galatasaray",1905,getString(R.string.gs)));
        liste.add(new Takim(R.drawable.ts,"Tarabzonspor",1967,getString(R.string.ts)));
        liste.add(new Takim(R.drawable.antalyaspor,"Antayaspor",1966,getString(R.string.as)));
        liste.add(new Takim(R.drawable.kayserispor,"Kayserispor",1975,getString(R.string.ks)));
        liste.add(new Takim(R.drawable.samsunspor,"Samsunspor",1965,getString(R.string.ss)));

        TakimAdapter adapter=new TakimAdapter(this,liste);
        lvTakim.setAdapter(adapter);

        lvTakim.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long id) {
                Takim seciliTakim=liste.get(i);
                Intent intent=new Intent(MainActivity.this,DetailActivity.class);
                intent.putExtra("secilenTakim",seciliTakim);
                startActivity(intent);
            }
        });
    }
}