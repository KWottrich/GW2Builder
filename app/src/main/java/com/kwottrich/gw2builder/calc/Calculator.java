package com.kwottrich.gw2builder.calc;

import com.kwottrich.gw2builder.data.Attributes;
import com.kwottrich.gw2builder.data.Character;
import com.kwottrich.gw2builder.data.Stats;

/**
 * Created by kenny on 8/30/2016.
 */
public final class Calculator {
    private static final int LOW_HP = 1645;
    private static final int MED_HP = 5922;
    private static final int HIGH_HP = 9212;

    static void CalculateStats(Character character) {
        updateAttributes(character);
        Stats stats = new Stats();
        stats.setHitPoints(getHitPoints(character));
    }

    private static void updateAttributes(Character character) {
        Attributes attributes = new Attributes();
        character.setAttributes(attributes);
    }

    static int getHitPoints(Character character) {
        int baseHealth;
        switch (character.getProfession()) {
            case Elementalist:
            case Thief:
            case Guardian:
                baseHealth = LOW_HP;
                break;
            case Revenant:
            case Engineer:
            case Ranger:
            case Mesmer:
                baseHealth = MED_HP;
                break;
            case Warrior:
            case Necromancer:
                baseHealth = HIGH_HP;
                break;
            default:
                baseHealth = 0;
        }
        int bonusHealth = 10 * character.getAttributes().getVitality();
        return baseHealth + bonusHealth;
    }
}
