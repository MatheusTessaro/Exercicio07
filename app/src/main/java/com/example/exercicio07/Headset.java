package com.example.exercicio07;

import java.util.ArrayList;
import java.util.List;

public class Headset {
    public String name;
    public String desc;
    public int img;
    public Double price;

    public Headset(String name, String desc, int img, Double price) {
        this.name = name;
        this.desc = desc;
        this.img = img;
        this.price = price;
    }


    public static List<Headset> getHeadsets(){
        List<Headset> headsets = new ArrayList<>();

        headsets.add( new Headset("steelseries arctis 1", "Headset com fio", R.drawable.headset01, 839.87) );
        headsets.add( new Headset("razer thresher", "Headset com fio", R.drawable.headset02, 1099.90) );
        headsets.add( new Headset("razer kraken", "Headset com fio", R.drawable.headset03, 566.39) );
        headsets.add( new Headset("hyperx cloud 2", "Headset sem fio", R.drawable.headset04, 983.00) );
        headsets.add( new Headset("logitech g pro", "Headset sem fio", R.drawable.headset05, 749.90) );
        headsets.add( new Headset("asus rog delta core", "Headset com fio", R.drawable.headset06, 569.90) );
        headsets.add( new Headset("hyperx cloud stinger", "Headset com fio", R.drawable.headset07, 296.67) );

        return headsets;
    }
}
