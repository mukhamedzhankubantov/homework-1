package com.narxoz.rpg.factory;

import java.util.HashMap;
import java.util.Map;

public class CharacterFactoryRegistry {

    private final Map<String, CharacterFactory> registry = new HashMap<>();

    public CharacterFactoryRegistry() {
        registry.put("warrior", new WarriorFactory());
        registry.put("mage", new MageFactory());
        registry.put("archer", new ArcherFactory());
    }

    public CharacterFactory getFactory(String type) {
        CharacterFactory factory = registry.get(type.toLowerCase());
        if (factory == null) {
            throw new IllegalArgumentException("Unknown character type: " + type);
        }
        return factory;
    }


}
