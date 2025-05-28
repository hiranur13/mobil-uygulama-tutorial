package com.example.uygulama1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    EditText etAd,etSoyad,etDogumYili;
    Button btnGonder;


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

        etAd=findViewById(R.id.editText_ad);
        etSoyad=findViewById(R.id.editText_soyad);
        etDogumYili=findViewById(R.id.editText_yil);
        btnGonder=findViewById(R.id.button_gonder);


        Intent intent=new Intent(this, MainActivity2.class);

        btnGonder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtra("ad",etAd.getText().toString());
                intent.putExtra("soyad",etSoyad.getText().toString());
                intent.putExtra("yil",Integer.parseInt( etDogumYili.getText().toString()));
                startActivity(intent);

            }
        });


    }
}