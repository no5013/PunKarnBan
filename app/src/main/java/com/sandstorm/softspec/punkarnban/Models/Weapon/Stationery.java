package com.sandstorm.softspec.punkarnban.Models.Weapon;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by FTTX on 5/7/2016 AD.
 */
public class Stationery {
    private static Stationery instance;
    private int level;
    private long wpt;
    private long price;
    private final String [] names  = {"Rusty pencil", "Standard pencil" , "Silver pencil" , "Platinum pencil" , "Chairman pencil",
            "Embedded Computer pencil" , "Quantum Computer pencil" , "Heavenly Being pencil" ,
            "The greatest ever made pencil" , "Pen"};

    private Stationery(){
        level = 1;
        wpt = 1;
        price = 5;
    }

    public static Stationery getInstance(){
        if(instance == null){
            instance = new Stationery();
        }
        return instance;
    }

    public int getLevel(){
        return level;
    }

    public long getPrice(){
        return price;
    }

    public long getWPT(){
        return wpt;
    }

    public void levelUp(){
        level = level++;
        price = (int)Math.floor(price * 1.02);
    }


    public String getFullName(){
        return getName(level) + " lv." + level;
    }

    private String getName(int level){
        return names[((int) Math.floor(level / 100.0))];

    }


}
