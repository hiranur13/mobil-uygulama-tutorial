package com.example.uygulama1;

import android.os.Bundle;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Ulke> ulkeler;
    ListView lvUlkeler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        lvUlkeler=findViewById(R.id.lv_ulkeler);
        ulkeler=new ArrayList<>();
        ulkeler.add(new Ulke(R.drawable.turkiye,"Türkiye","Ankara",80000000,"Tl","Türkçe","+90",getString(R.string.tr_aciklama)));
        ulkeler.add(new Ulke(R.drawable.almanya,"Almanya","Berlin",80000000,"Mark","Almanca","+49",getString(R.string.almanya_aciklama)));
        ulkeler.add(new Ulke(R.drawable.abd,"Amerika","Washington",34000000,"euro","İngilizce","+1",getString(R.string.abd_aciklama)));
        ulkeler.add(new Ulke(R.drawable.belcika,"Belçika","Brüksel",60000000,"dolar","Felemenkçe","+32",getString(R.string.belcika_aciklama)));
        ulkeler.add(new Ulke(R.drawable.brezilya,"Brezilya","Brazilya",75000000,"Euro","Portekizce","+55",getString(R.string.brezilya_aciklama)));
        ulkeler.add(new Ulke(R.drawable.kanada,"Kanada","Attova",95000000,"Kanada Doları","Fransızca,İngilizce","+1",getString(R.string.kanada_aciklama)));

        UlkelerAdapter adapter=new UlkelerAdapter(ulkeler,this);
        lvUlkeler.setAdapter(adapter);






    }
}