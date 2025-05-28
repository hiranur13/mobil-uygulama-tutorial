package com.example.uygulama1;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity2 extends AppCompatActivity {

    TextView tvSonuc;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main2);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        tvSonuc=findViewById(R.id.textView_sonuc);

        Intent intent=getIntent();
        String ad=intent.getStringExtra("ad");
        String soyad=intent.getStringExtra("soyad");
        int dogumyili=intent.getIntExtra("yil",2025);
        int yas=2025-dogumyili;

        tvSonuc.setText("Hoşgeldin "+ad+" "+soyad+"\nYaşınız "+yas);




    }
}