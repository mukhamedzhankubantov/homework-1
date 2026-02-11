package com.narxoz.rpg.equipment;

public class PlateArmor implements Armor{

    private int defense =30;

    @Override
    public int getDefense(){
        return defense;
    }

    @Override
    public String getArmorInfo(){
        return "Plate Armor (Medieval) - Heavy armor with strong protection";
    }
}
