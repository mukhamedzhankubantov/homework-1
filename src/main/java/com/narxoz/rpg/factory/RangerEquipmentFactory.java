package com.narxoz.rpg.factory;

import com.narxoz.rpg.equipment.Armor;
import com.narxoz.rpg.equipment.LeatherArmor;
import com.narxoz.rpg.equipment.Longbow;
import com.narxoz.rpg.equipment.Weapon;

public class RangerEquipmentFactory implements EquipmentFactory {
    @Override
    public Weapon createWeapon() {
        return new Longbow();
    }

    @Override
    public Armor createArmor() {
        return new LeatherArmor();
    }
}
