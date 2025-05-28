package com.example.uygulama1;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class DetailActivity extends AppCompatActivity {

    ImageView ivTakim;
    TextView tvAd,tvAciklama;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_detail);
        ivTakim=findViewById(R.id.iv_logo);
        tvAd=findViewById(R.id.tv_ad);
        tvAciklama=findViewById(R.id.tv_aciklama);

        Takim takim=(Takim) getIntent().getSerializableExtra("secilenTakim");

        if (takim!=null){
            ivTakim.setImageResource(takim.getResim());
            tvAd.setText((takim.getAd()));
            tvAciklama.setText(takim.getAciklama());
        }
    }
}