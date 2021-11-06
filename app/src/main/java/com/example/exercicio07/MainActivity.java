package com.example.exercicio07;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.List;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener{

    private ListView listaHeadsets;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listaHeadsets = findViewById(R.id.listaHeadsets);
        List<Headset> headsets = Headset.getHeadsets();
        listaHeadsets.setAdapter( new HeadsetAdapter(this, headsets));
        listaHeadsets.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Headset headset = (Headset) parent.getAdapter().getItem(position);
        Toast.makeText(this, headset.name, Toast.LENGTH_SHORT).show();
    }
}