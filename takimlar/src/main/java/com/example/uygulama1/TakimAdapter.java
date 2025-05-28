package com.example.uygulama1;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class TakimAdapter extends BaseAdapter {

    Context context;
    ArrayList<Takim> takimlar;

    public TakimAdapter(Context context, ArrayList<Takim> takimlar) {
        this.context = context;
        this.takimlar = takimlar;
    }

    @Override
    public int getCount() {
        return takimlar.size();
    }

    @Override
    public Object getItem(int i) {
        return takimlar.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup parent) {
        ImageView ivSatirTakim;
        TextView tvSatirAd, tvSatirYil;

        Takim takim = takimlar.get(i);

        if (view == null) {
            view = view.inflate(context, R.layout.satir, null);
        }

        ivSatirTakim = view.findViewById(R.id.iv_satir_logo);
        tvSatirAd = view.findViewById(R.id.tv_satir_ad);
        tvSatirYil = view.findViewById(R.id.tv_satir_yil);

        ivSatirTakim.setImageResource(takim.getResim());
        tvSatirAd.setText(takim.getAd());
        tvSatirYil.setText("Yıl: "+takim.getYil());
        return view;
    }
}
