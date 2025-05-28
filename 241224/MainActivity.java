package com.example.uygulama1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    CheckBox checkBoxCorba,checkBoxPilav,checkBoxSalata,checkBoxAyran,checkBoxBaklava;
    Button buttonVer;
    TextView textViewOzet;
    EditText numberCorba,numberPilav,numberBaklava,numberSalata,numberAyran;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        checkBoxCorba=findViewById(R.id.checkBox_corba);
        checkBoxPilav=findViewById(R.id.checkBox_pilav);
        checkBoxSalata=findViewById(R.id.checkBox_salata);
        checkBoxBaklava=findViewById(R.id.checkBox_baklava);
        checkBoxAyran=findViewById(R.id.checkBox_ayran);
        numberCorba=findViewById(R.id.editTextNumber_corba);
        numberPilav=findViewById(R.id.editTextNumber_pilav);
        numberSalata=findViewById(R.id.editTextNumbersalata);
        numberBaklava=findViewById(R.id.editTextNumber_baklava);
        numberAyran=findViewById(R.id.editTextNumber_ayran);
        textViewOzet=findViewById(R.id.textView_ozet);
        buttonVer=findViewById(R.id.button_ver);


        buttonVer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float corbaFiyat=75,pilavFiyat=100,baklavaFiyat=55,salataFiyat=45,ayranFiyat=20;
                float toplamTutar=0;
                float adet=0;
                String s="Sipariş Özeti:\n----------\n";

                if (checkBoxCorba.isChecked()){
                    adet=Float.parseFloat(numberCorba.getText().toString());
                    toplamTutar+=(corbaFiyat*adet);
                    s+="Çorba \n";
                }
                if (checkBoxPilav.isChecked()){
                    adet=Float.parseFloat(numberPilav.getText().toString());
                    toplamTutar+=(pilavFiyat*adet);
                    s+="Pilav \n";
                }
                if (checkBoxBaklava.isChecked()){
                    adet=Float.parseFloat(numberBaklava.getText().toString());
                    toplamTutar+=(baklavaFiyat*adet);
                    s+="Baklava \n";
                }

                if (checkBoxSalata.isChecked()){
                    adet=Float.parseFloat(numberSalata.getText().toString());
                    toplamTutar+=(salataFiyat*adet);
                    s+="Salata \n";
                }
                if (checkBoxAyran.isChecked()){
                    adet=Float.parseFloat(numberAyran.getText().toString());
                    toplamTutar+=(ayranFiyat*adet);
                    s+="Ayran \n";
                }
                textViewOzet.setText(s+"--------\nToplam Tutar: "+toplamTutar);
            }

        });






    }
}