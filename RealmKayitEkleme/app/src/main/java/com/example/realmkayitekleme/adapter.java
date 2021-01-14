package com.example.realmkayitekleme;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class adapter extends BaseAdapter {
    List<KisiBilgileri> list;
    Context context;

    public adapter(List<KisiBilgileri> kisiBilgileris, Context context) {
        this.list = kisiBilgileris;
        this.context = context;
    }


    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
        view = LayoutInflater.from(context).inflate(R.layout.layout,viewGroup,false);
        TextView isim = view.findViewById(R.id.kullaniciIsim);
        TextView sifre = view.findViewById(R.id.kullaniciSifre);
        TextView kullaniciAdi = view.findViewById(R.id.kullaniciAdiText);
        TextView cinsiyet = view.findViewById(R.id.kullaniciCinsiyet);
        isim.setText(list.get(position).getIsim());
        sifre.setText(list.get(position).getSifre());
        kullaniciAdi.setText(list.get(position).getKullanici());
        cinsiyet.setText(list.get(position).getCinsiyet());

        return view;
    }
}
