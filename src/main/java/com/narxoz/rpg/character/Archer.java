package com.narxoz.rpg.character;

import com.narxoz.rpg.equipment.Armor;
import com.narxoz.rpg.equipment.Weapon;

public class Archer implements Character{
    private String name;
    private int health;
    private int mana;
    private int strength;
    private int intelligence;

    private Weapon equippedWeapon;
    private Armor equippedArmor;


    public Archer(String name) {
        this.name = name;
        // Archer stats: balanced
        this.health = 110;
        this.mana = 60;
        this.strength = 55;
        this.intelligence = 45;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void displayStats() {
        System.out.println("=== " + name + " (Archer) ===");
        System.out.println("Health: " + health);
        System.out.println("Mana: " + mana);
        System.out.println("Strength: " + strength);
        System.out.println("Intelligence: " + intelligence);
    }

    @Override
    public void useSpecialAbility() {
        System.out.println(name + " uses PRECISION SHOT! A critical arrow hits the target!");
    }

    @Override
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
