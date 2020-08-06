package com.example.listview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class KullaniciListAdapter extends BaseAdapter {

    List<KullaniciModel> list;
    Context context;

    public KullaniciListAdapter(List<KullaniciModel> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int i) {
        return list.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View layout = LayoutInflater.from(context).inflate(R.layout.layout,viewGroup,false);
        TextView ad = layout.findViewById(R.id.adi);
        TextView soyad= layout.findViewById(R.id.soyadi);
        TextView yas = layout.findViewById(R.id.yas);
        TextView takim = layout.findViewById(R.id.takim);
        ad.setText(list.get(i).isim);
        soyad.setText(list.get(i).soyisim);
        yas.setText(list.get(i).yas);
        takim.setText(list.get(i).tuttuguTakim);
        return layout;
    }
}
