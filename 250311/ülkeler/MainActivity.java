package com.example.uygulama1;

import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.uygulama1.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    ArrayList<Ulke> ulkeArraylist;
    int seciliSiraNo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);
        ulkeArraylist=new ArrayList<>();

        Ulke azerbaijan=new Ulke("Azerbeycan","Bakü"," Azerbaycan Türkçesi",1015000,"Azerbaycan Manatı",1,R.drawable.azerbaijan);
        Ulke brazil=new Ulke("Brezilya","Brazilya","Portekizce",211000,"Reali Türk Lirası",2,R.drawable.brazil);
        Ulke canada=new Ulke("Kanada","Ottava","İngilizce",400100,"Kanada doları",3,R.drawable.canada);
        Ulke germany=new Ulke("Almanya","Berlin","Almanca",83286,"Euro",4,R.drawable.germany);
        Ulke italy=new Ulke("İtalya","Roma","İtalyanca",58900,"İtalyan lirası",5,R.drawable.italy);
        Ulke japan=new Ulke("Japonya","Tokyo","Japonca",124500,"Japon yeni",6,R.drawable.japan);
        Ulke romania=new Ulke("Romanya","Bükreş"," Rumence",1960000,"Rumen Leyi",7,R.drawable.romania);
        Ulke spain=new Ulke("İspanya","Madrid","İspanyolca",4800500,"Euro",8,R.drawable.spain);
        Ulke turkey=new Ulke("Türkiye","Ankara","Türkçe",80000000,"Türk Lirası",9,R.drawable.turkey);
        Ulke greece=new Ulke("Yunanistan","Atina","Yunanca",10000401,"Euro",10,R.drawable.greece);

        //Arraylist yüklemesi
        ulkeArraylist.add(azerbaijan);
        ulkeArraylist.add(brazil);
        ulkeArraylist.add(canada);
        ulkeArraylist.add(germany);
        ulkeArraylist.add(italy);
        ulkeArraylist.add(japan);
        ulkeArraylist.add(romania);
        ulkeArraylist.add(spain);
        ulkeArraylist.add(turkey);
        ulkeArraylist.add(greece);


        binding.imageView.setImageResource(ulkeArraylist.get(0).foto);
        binding.textViewAd.setText("Ad: "+ulkeArraylist.get(0).getAd());
        binding.tvBaskent.setText("Başkent: "+ulkeArraylist.get(0).baskent);
        binding.tvDil.setText("Dili: "+ulkeArraylist.get(0).dil);
        binding.tvNufus.setText("Nüfus: "+ulkeArraylist.get(0).nufus);
        binding.tvPara.setText("Para Birimi: "+ulkeArraylist.get(0).paraBirimi);
        seciliSiraNo=0;


    }

    public void GeriGelme(View view){
        if (seciliSiraNo>0){
            seciliSiraNo--;
            binding.imageView.setImageResource(ulkeArraylist.get(seciliSiraNo).foto);
            binding.textViewAd.setText("Ad: "+ulkeArraylist.get(seciliSiraNo).getAd());
            binding.tvBaskent.setText("Başkent: "+ulkeArraylist.get(seciliSiraNo).baskent);
            binding.tvDil.setText("Dili: "+ulkeArraylist.get(seciliSiraNo).dil);
            binding.tvNufus.setText("Nüfus: "+ulkeArraylist.get(seciliSiraNo).nufus);
            binding.tvPara.setText("Para Birimi: "+ulkeArraylist.get(seciliSiraNo).paraBirimi);

        }


    }

    public void İleriGitme(View view){
        if (seciliSiraNo<ulkeArraylist.size()-1){
            seciliSiraNo++;
            binding.imageView.setImageResource(ulkeArraylist.get(seciliSiraNo).foto);
            binding.textViewAd.setText("Ad: "+ulkeArraylist.get(seciliSiraNo).getAd());
            binding.tvBaskent.setText("Başkent: "+ulkeArraylist.get(seciliSiraNo).baskent);
            binding.tvDil.setText("Dili: "+ulkeArraylist.get(seciliSiraNo).dil);
            binding.tvNufus.setText("Nüfus: "+ulkeArraylist.get(seciliSiraNo).nufus);
            binding.tvPara.setText("Para Birimi: "+ulkeArraylist.get(seciliSiraNo).paraBirimi);

        }
    }
}