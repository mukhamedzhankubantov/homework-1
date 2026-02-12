package com.narxoz.rpg;

import com.narxoz.rpg.character.Character;
import com.narxoz.rpg.equipment.Armor;
import com.narxoz.rpg.equipment.Weapon;
import com.narxoz.rpg.equipment.WizardStaff;
import com.narxoz.rpg.factory.*;


public class Main {
    public static void main(String[] args) {
        System.out.println("=== RPG Character & Equipment System ===\n");

        // Factory Method: character creation via factories (no if-else for new Warrior/Mage/Archer)
        CharacterFactoryRegistry characterRegistry = new CharacterFactoryRegistry();

        Character warrior = characterRegistry.getFactory("warrior").createCharacter("Thor");
        Character mage = characterRegistry.getFactory("mage").createCharacter("Gandalf");
        Character archer = characterRegistry.getFactory("archer").createCharacter("Legolas");

        // Abstract Factory: themed equipment families
        demoCharacterWithEquipment(warrior, new MedievalEquipmentFactory());
        System.out.println("\n---\n");
        demoCharacterWithEquipment(mage, new MagicEquipmentFactory());
        System.out.println("\n---\n");
        demoCharacterWithEquipment(archer, new RangerEquipmentFactory());



        System.out.println("\n=== Demo Complete ===");
    }
    private static void demoCharacterWithEquipment(Character character, EquipmentFactory equipmentFactory){
        character.displayStats();
        character.useSpecialAbility();

        Weapon weapon =equipmentFactory.createWeapon();
        Armor armor =equipmentFactory.createArmor();

        character.equipWeapon(weapon);
        character.equipArmor(armor);

        character.displayEquipment();
    }
}
