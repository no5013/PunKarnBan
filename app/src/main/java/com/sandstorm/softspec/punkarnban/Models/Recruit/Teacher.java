package com.sandstorm.softspec.punkarnban.Models.Recruit;

/**
 * Created by Warata on 5/27/16 AD.
 */
public class Teacher extends Recruit {

    public Teacher() {
        super("Teacher", 5);
    }

    @Override
    public void levelUp() {
        super.setLevel(getLevel() + 1);
        super.setPrice((int) Math.ceil(10 * Math.pow(1.05, getLevel())));
        super.setDPS((int)Math.ceil(getDPS() * Math.pow(1.02 , getLevel())));
    }
}
