package com.kwottrich.gw2builder.data.enums;

import static com.kwottrich.gw2builder.data.enums.AttributeType.Concentration;
import static com.kwottrich.gw2builder.data.enums.AttributeType.ConditionDamage;
import static com.kwottrich.gw2builder.data.enums.AttributeType.CritDamage;
import static com.kwottrich.gw2builder.data.enums.AttributeType.Expertise;
import static com.kwottrich.gw2builder.data.enums.AttributeType.Healing;
import static com.kwottrich.gw2builder.data.enums.AttributeType.Power;
import static com.kwottrich.gw2builder.data.enums.AttributeType.Precision;
import static com.kwottrich.gw2builder.data.enums.AttributeType.Toughness;
import static com.kwottrich.gw2builder.data.enums.AttributeType.Vitality;

/**
 * Created by kenny on 8/31/2016.
 */
public enum StatPrefix {
    Berzerker(Power, null, Precision, CritDamage),
    Zealot(Power, null, Precision, Healing),
    Soldier(Power, null, Toughness, Vitality),
    Forsaken(Power, null, Toughness, Healing),
    Valkyrie(Power, null, Vitality, CritDamage),
    Captain(Precision, null, Power, Toughness),
    Rampager(Precision, null, Power, ConditionDamage),
    Assassin(Precision, null, Power, CritDamage),
    Knight(Toughness, null, Power, Precision),
    Cavalier(Toughness, null, Power, CritDamage),
    Nomad(Toughness, null, Vitality, Healing),
    Settler(Toughness, null, ConditionDamage, Healing),
    Sentinel(Vitality, null, Power, Toughness),
    Shaman(Vitality, null, ConditionDamage, Healing),
    Sinister(ConditionDamage, null, Power, Precision),
    Carrion(ConditionDamage, null, Power, Vitality),
    Rabid(ConditionDamage, null, Precision, Toughness),
    Dire(ConditionDamage, null, Toughness, Vitality),
    Apostate(ConditionDamage, null, Toughness, Healing),
    Cleric(Healing, null, Power, Toughness),
    Magi(Healing, null, Precision, Vitality),
    Apothecary(Healing, null, Toughness, ConditionDamage),
    Commander(Power, Precision, Toughness, Concentration),
    Marauder(Power, Precision, Vitality, CritDamage),
    Vigilant(Power, Toughness, Concentration, Expertise),
    Crusader(Power, Toughness, CritDamage, Healing),
    Wanderer(Power, Vitality, Toughness, Concentration),
    Viper(Power, ConditionDamage, Precision, Expertise),
    Trailblazer(Toughness, ConditionDamage, Vitality, Expertise),
    Minstrel(Toughness, Healing, Vitality, Concentration),
    Celestial(null, null, null, null);

    private final AttributeType major_1;
    private final AttributeType major_2;
    private final AttributeType minor_1;
    private final AttributeType minor_2;

    StatPrefix(AttributeType major_1, AttributeType major_2, AttributeType minor_1, AttributeType minor_2) {
        this.major_1 = major_1;
        this.major_2 = major_2;
        this.minor_1 = minor_1;
        this.minor_2 = minor_2;
    }

    boolean isFourStat() {
        return major_2 != null;
    }

    public AttributeType getMajor_1() {
        return major_1;
    }

    public AttributeType getMajor_2() {
        return major_2;
    }

    public AttributeType getMinor_1() {
        return minor_1;
    }

    public AttributeType getMinor_2() {
        return minor_2;
    }
}
