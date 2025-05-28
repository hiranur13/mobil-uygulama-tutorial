package com.example.uygulama1;

import android.view.View;
import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.uygulama1.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    ArrayList<Film> filmArrayList;
    int seciliSiraNo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityMainBinding.inflate(getLayoutInflater());
        View view=binding.getRoot();
        setContentView(view);

        filmArrayList=new ArrayList<>();

        Film iceage=new Film("İce Age-2002",getString(R.string.iceage_oyuncu),getString(R.string.iceage_konu),4,1,R.drawable.iceage);
        Film ipman=new Film("İp Man-2019",getString(R.string.ipman_oyuncu),getString(R.string.ipman_konu),4,2,R.drawable.ipman);
        Film jumanji=new Film("Jumanji-2002",getString(R.string.jumanji_oyuncu),getString(R.string.jumanji_konu),3.5f,3,R.drawable.jumanji);
        Film kingarthur=new Film("King Arthur-2004",getString(R.string.kingarthur_oyuncu),getString(R.string.kingarthur_konu),4.5f,4,R.drawable.kingarthur);
        Film ronman=new Film("Iron Man-2013",getString(R.string.ironman_oyuncu),getString(R.string.ironman_konu),4.5f,5,R.drawable.ronman);


        filmArrayList.add(iceage);
        filmArrayList.add(ipman);
        filmArrayList.add(jumanji);
        filmArrayList.add(kingarthur);
        filmArrayList.add(ronman);
        seciliSiraNo=0;
    }

    public void geriGelme(View view){
        if (seciliSiraNo>0){
            seciliSiraNo--;
            binding.ivAfis.setImageResource(filmArrayList.get(seciliSiraNo).foto);
            binding.tvFilmAdi.setText(filmArrayList.get(seciliSiraNo).ad);
            binding.tvOyuncu.setText(filmArrayList.get(seciliSiraNo).oyuncu);
            binding.tvKonu.setText(filmArrayList.get(seciliSiraNo).konu);
            binding.rbOy2.setRating(filmArrayList.get(seciliSiraNo).puan);
        }
        else {
            Toast.makeText(this, "Başa geldin", Toast.LENGTH_SHORT).show();
        }

    }

    public void ileriGitme(View view){
        if (seciliSiraNo<filmArrayList.size()-1){
            seciliSiraNo++;
            binding.ivAfis.setImageResource(filmArrayList.get(seciliSiraNo).foto);
            binding.tvFilmAdi.setText(filmArrayList.get(seciliSiraNo).ad);
            binding.tvOyuncu.setText(filmArrayList.get(seciliSiraNo).oyuncu);
            binding.tvKonu.setText(filmArrayList.get(seciliSiraNo).konu);
            binding.rbOy2.setRating(filmArrayList.get(seciliSiraNo).puan);
        }
        else{
            Toast.makeText(this, "Sona geldin", Toast.LENGTH_SHORT).show();
        }

    }
}