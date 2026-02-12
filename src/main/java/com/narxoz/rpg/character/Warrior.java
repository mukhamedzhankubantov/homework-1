    package com.narxoz.rpg.character;

    import com.narxoz.rpg.equipment.Weapon;
    import com.narxoz.rpg.equipment.Armor;

    public class Warrior implements Character {

        private String name;
        private int health;
        private int mana;
        private int strength;
        private int intelligence;
        private Weapon equippedWeapon;
        private Armor equippedArmor;



        public Warrior(String name) {
            this.name = name;
            this.health = 150;
            this.mana = 30;
            this.strength = 80;
            this.intelligence = 20;
        }

        public String getName() {
            return name;
        }

        public void displayStats() {
            System.out.println("=== " + name + " (Warrior) ===");
            System.out.println("Health: " + health);
            System.out.println("Mana: " + mana);
            System.out.println("Strength: " + strength);
            System.out.println("Intelligence: " + intelligence);
        }

        public void useSpecialAbility() {
            System.out.println(name + " uses BERSERKER RAGE! Strength temporarily increased!");
        }


        @Override
        public void equipWeapon(Weapon weapon){
            this.equippedWeapon = weapon;
        }

        @Override
        public void equipArmor(Armor armor){
            this.equippedArmor = armor;
        }

        public void displayEquipment() {
            System.out.println("Weapon: " + (equippedWeapon == null ? "None" : equippedWeapon.getWeaponInfo()));
            System.out.println("Armor: " + (equippedArmor == null ? "None" : equippedArmor.getArmorInfo()));
        }
    }
