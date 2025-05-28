package com.example.uygulama1;

import android.content.Intent;
import android.icu.number.IntegerWidth;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button btnGonder;
    EditText etUrun,etAd,etFiyat,etStok;
    Switch swDurum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);


        btnGonder=findViewById(R.id.button_gonder);
        etUrun=findViewById(R.id.editText_urun);
        etAd=findViewById(R.id.editText_ad);
        etFiyat=findViewById(R.id.editText_fiyat);
        etStok=findViewById(R.id.editText_stok);
        swDurum=findViewById(R.id.switch_durum);


        Intent intent = new Intent(this, UrunDetayActivity.class);
       // Urun u1=new Urun(1,"Trileçe",100,400,true);


        btnGonder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Urun urun = new Urun();
                urun.id = Integer.parseInt(etUrun.getText().toString());
                urun.ad=etAd.getText().toString();
                urun.fiyat= Double.parseDouble(etFiyat.getText().toString());
                urun.stokMiktari=Integer.parseInt(etStok.getText().toString());
                urun.stokDurum=swDurum.isChecked();
                intent.putExtra("gidenUrun",urun);
                startActivity(intent);

            }
        });


    }
}