package com.narxoz.rpg.character;

import com.narxoz.rpg.equipment.Armor;
import com.narxoz.rpg.equipment.Weapon;

public class Mage implements Character {
    private String name;
    private int health;
    private int mana;
    private int strength;
    private int intelligence;

    private Weapon equippedWeapon;
    private Armor equippedArmor;

    public Mage(String name){
        this.name = name;
        this.health = 70;
        this.mana = 150;
        this.strength = 20;
        this.intelligence = 90;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void displayStats(){
        System.out.println("=== " + name + " (Mage) ===");
        System.out.println("Health: " + health);
        System.out.println("Mana: " + mana);
        System.out.println("Strength: " + strength);
        System.out.println("Intelligence: " + intelligence);
    }

    @Override
    public void useSpecialAbility(){
        System.out.println(name + " uses ARCANE BLAST!  A powerful spell strikes the enemy!");
    }

    public void equipWeapon(Weapon weapon) {
        this.equippedWeapon = weapon;
    }

    @Override
    public void equipArmor(Armor armor) {
        this.equippedArmor = armor;
    }

    @Override
    public void displayEquipment() {
        System.out.println("Weapon: " + (equippedWeapon == null ? "None" : equippedWeapon.getWeaponInfo()));
        System.out.println("Armor: " + (equippedArmor == null ? "None" : equippedArmor.getArmorInfo()));
    }
}
