package com.example.uygulama1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    EditText editTextCihazAdi,editTextCihazGucu,editTextGunlukKullanim;
    Button buttonHesapla;
    TextView textViewTuketim;


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

            editTextCihazAdi=findViewById(R.id.editText_cihaz_adi);
            editTextCihazGucu=findViewById(R.id.editText_cihaz_gucu);
            editTextGunlukKullanim=findViewById(R.id.editText_kullanim);
            buttonHesapla=findViewById(R.id.button_hesapla);
            textViewTuketim=findViewById(R.id.textView_tuketim);

            buttonHesapla.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String cihazAdi=editTextCihazAdi.getText().toString();
                    double guc=Double.parseDouble(editTextCihazGucu.getText().toString());
                    double saat=Double.parseDouble(editTextGunlukKullanim.getText().toString());

                    ElektrikliCihaz cihaz=new ElektrikliCihaz();
                    cihaz.cihazAdi=cihazAdi;
                    cihaz.cihazGucu=guc;
                    cihaz.gunlukKullanimSaati=saat;
                     double sonuc=cihaz.aylikTuketim();
                     textViewTuketim.setText("Aylık Tüketim: "+sonuc);
                }
            });

    }
}