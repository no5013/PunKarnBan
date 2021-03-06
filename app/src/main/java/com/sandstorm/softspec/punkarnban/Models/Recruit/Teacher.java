package com.sandstorm.softspec.punkarnban.Models.Recruit;

import com.sandstorm.softspec.punkarnban.Utility.FormulaCalculator;

/**
 * Created by Warata on 5/27/16 AD.
 */
public class Teacher extends Recruit {

    public Teacher() {
        super("Teacher", 500,70000);
    }

    @Override
    public void levelUp() {
        plusLevel();
        setAttribute();
    }

    @Override
    public void setAttribute() {
        if(getLevel() == 0) {
            setPrice(70000);
            setDPS(500);
        }else {
            setPrice(FormulaCalculator.getInstance().calculate(70000, 1.05, getLevel() , 1000*getLevel()));
            setDPS(FormulaCalculator.getInstance().calculate(500, 1.02, getLevel() , 500*getLevel()));
        }

    }
}
