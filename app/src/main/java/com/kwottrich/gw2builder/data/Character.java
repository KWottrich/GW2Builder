package com.kwottrich.gw2builder.data;

import com.kwottrich.gw2builder.data.enums.converters.ProfessionTypeConverter;
import com.kwottrich.gw2builder.data.equipment.Armor;
import com.kwottrich.gw2builder.data.equipment.BackItem;
import com.kwottrich.gw2builder.data.equipment.Trinket;
import com.kwottrich.gw2builder.data.equipment.Weapon;
import com.kwottrich.gw2builder.data.enums.ProfessionType;
import com.kwottrich.gw2builder.data.joiners.JoinSkillsWithCharacters;
import com.kwottrich.gw2builder.data.skills.Skill;

import org.greenrobot.greendao.annotation.Convert;
import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Index;
import org.greenrobot.greendao.annotation.JoinEntity;
import org.greenrobot.greendao.annotation.ToMany;
import org.greenrobot.greendao.annotation.ToOne;
import org.greenrobot.greendao.annotation.Transient;

import java.util.List;

/**
 * Created by kenny on 8/30/2016.
 */
@Entity
public class Character {
    @Id
    private Long id;

    @Index(unique = true)
    private String characterName;

    @Convert(converter = ProfessionTypeConverter.class, columnType = String.class)
    private ProfessionType profession;
    @Transient
    private Attributes attributes;

    @ToMany(referencedJoinProperty = "characterId")
    private List<Armor> armor;
    @ToMany(referencedJoinProperty = "characterId")
    private List<Trinket> trinkets;
    @ToOne
    private BackItem backItem;

    @ToMany(referencedJoinProperty = "characterId")
    private List<Weapon> weaponSetA;
    @ToMany(referencedJoinProperty = "characterId")
    private List<Weapon> weaponSetB;

    @ToMany
    @JoinEntity(
            entity = JoinSkillsWithCharacters.class,
            sourceProperty = "characterId",
            targetProperty = "skillId"
    )
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

    public String getCharacterName() {
        return characterName;
    }

    public void setCharacterName(String characterName) {
        this.characterName = characterName;
    }
}
