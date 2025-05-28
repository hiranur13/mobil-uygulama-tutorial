package com.example.uygulama1;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Switch;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class UrunDetayActivity extends AppCompatActivity {

    TextView tvId,tvAd,tvFiyat,tvStok;
    Switch swStok;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_urun_detay);

        tvId=findViewById(R.id.textView_id);
        tvAd=findViewById(R.id.textView_ad);
        tvFiyat=findViewById(R.id.textView_fiyat);
        tvStok=findViewById(R.id.textView_stok);
        swStok=findViewById(R.id.switch_stokDurum);

        Intent intent=getIntent();
        Urun gelenUrun=(Urun)intent.getSerializableExtra("gidenUrun");
        tvId.setText("Urun İd: "+gelenUrun.getId());
        tvAd.setText("Urun Ad: "+gelenUrun.getAd());
        tvFiyat.setText("Urun Fiyat: "+gelenUrun.getFiyat());
        tvStok.setText("Urun Stok: "+gelenUrun.getStokMiktari());
        swStok.setChecked(gelenUrun.isStokDurum());


    }
}