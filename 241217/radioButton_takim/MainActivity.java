package com.example.uygulama1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    ImageView imageViewTakim;
    RadioButton radioButtonBjk,radioButtonFb,radioButtonGs,radioButtonTs;
    Button buttonSec;




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

        imageViewTakim=findViewById(R.id.imageView_takim);
        radioButtonBjk=findViewById(R.id.radioButton_bjk);
        radioButtonFb=findViewById(R.id.radioButton_fb);
        radioButtonGs=findViewById(R.id.radioButton_gs);
        radioButtonTs=findViewById(R.id.radioButton_ts);
        buttonSec=findViewById(R.id.button_sec);

        buttonSec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(radioButtonBjk.isChecked()){
                    imageViewTakim.setImageResource(R.drawable.bjk);
                }
                else if(radioButtonFb.isChecked()){
                    imageViewTakim.setImageResource(R.drawable.fb);
                }
                else if (radioButtonGs.isChecked()) {
                    imageViewTakim.setImageResource(R.drawable.gs);

                }
                else{
                    imageViewTakim.setImageResource(R.drawable.ts);
                }
            }
        });

    }
}