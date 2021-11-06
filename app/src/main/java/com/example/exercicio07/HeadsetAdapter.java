package com.example.exercicio07;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.List;

public class HeadsetAdapter extends BaseAdapter {
    private final Context context;
    private final List<Headset> headsets;

    public HeadsetAdapter(Context context, List<Headset> headsets) {
        this.context = context;
        this.headsets = Headset.getHeadsets();
    }

    @Override
    public int getCount() {
        return this.headsets.size();
    }

    @Override
    public Headset getItem(int position) {
        return this.headsets.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = LayoutInflater.from(context).inflate(R.layout.adapter_headset, parent, false);

        ListView listaHeadsets = (ListView) view.findViewById(R.id.listaHeadsets);

        TextView nomeHeadset = (TextView) view.findViewById(R.id.txtHeadset);
        ImageView imgHeadset = (ImageView) view.findViewById(R.id.imgHeadset);
        TextView descricaoHeadset = (TextView) view.findViewById(R.id.txtTipoHeadset);
        TextView precoHeadset = (TextView) view.findViewById(R.id.txtPrecoHeadset);

        Headset headset = headsets.get(position);

        nomeHeadset.setText(headset.name);
        descricaoHeadset.setText(headset.desc);
        precoHeadset.setText("R$ "+String.valueOf(headset.price));
        imgHeadset.setImageResource(headset.img);

        return view;
    }
}