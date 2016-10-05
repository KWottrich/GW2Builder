package com.kwottrich.gw2builder.data;

import com.kwottrich.gw2builder.data.equipment.Armor;
import com.kwottrich.gw2builder.data.equipment.BackItem;
import com.kwottrich.gw2builder.data.equipment.Trinket;
import com.kwottrich.gw2builder.data.equipment.Weapon;
import com.kwottrich.gw2builder.data.enums.ProfessionType;
import com.kwottrich.gw2builder.data.skills.Skill;

import java.util.List;

/**
 * Created by kenny on 8/30/2016.
 */
public class Character {
    private ProfessionType profession;
    private Attributes attributes;

    private List<Armor> armor;
    private List<Trinket> trinkets;
    private BackItem backItem;

    private List<Weapon> weaponSetA;
    private List<Weapon> weaponSetB;

    private List<Skill> skills;

    public ProfessionType getProfession() {
        return profession;
    }

    public void setProfession(ProfessionType profession) {
        this.profession = profession;
    }

    public Attributes getAttributes() {
        return attributes;
    }

    public void setAttributes(Attributes attributes) {
        this.attributes = attributes;
    }

    public List<Armor> getArmor() {
        return armor;
    }

    public void setArmor(List<Armor> armor) {
        this.armor = armor;
    }

    public List<Trinket> getTrinkets() {
        return trinkets;
    }

    public void setTrinkets(List<Trinket> trinkets) {
        this.trinkets = trinkets;
    }

    public BackItem getBackItem() {
        return backItem;
    }

    public void setBackItem(BackItem backItem) {
        this.backItem = backItem;
    }

    public List<Weapon> getWeaponSetA() {
        return weaponSetA;
    }

    public void setWeaponSetA(List<Weapon> weaponSetA) {
        this.weaponSetA = weaponSetA;
    }

    public List<Weapon> getWeaponSetB() {
        return weaponSetB;
    }

    public void setWeaponSetB(List<Weapon> weaponSetB) {
        this.weaponSetB = weaponSetB;
    }

    public List<Skill> getSkills() {
        return skills;
    }

    public void setSkills(List<Skill> skills) {
        this.skills = skills;
    }
}
