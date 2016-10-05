package com.kwottrich.gw2builder.data.skills;

import com.kwottrich.gw2builder.data.enums.AttunementType;
import com.kwottrich.gw2builder.data.enums.ProfessionType;
import com.kwottrich.gw2builder.data.enums.SkillCategory;
import com.kwottrich.gw2builder.data.enums.SkillSlot;
import com.kwottrich.gw2builder.data.enums.SkillType;
import com.kwottrich.gw2builder.data.enums.WeaponType;

import java.util.List;

/**
 * Created by kenny on 8/30/2016.
 */
public class Skill {
    private Integer id;
    private String name;
    private String description;
    private String icon;
    //private picture(?) icon
    private String chat_link;
    private SkillType type;
    private WeaponType weapon_type;
    private List<ProfessionType> professions;
    private SkillSlot slot;
    private List<SkillFact> facts;
    private List<SkillFact> traited_facts;
    private List<SkillCategory> categories;
    private WeaponType offhand; //(name of offhand weapon this skill requires to be equipped. Usually only present for Thief)
    //(also dual_wield?)
    private AttunementType attunement; //ele only
    private Integer cost; //("number" instead of Integer?)
    //private WeaponType dual_wield;
    private Integer flip_skill;
    private Integer initiative;
    private Integer next_chain; // ID of next skill
    private Integer prev_chain; // ID of previous skill
    private List<Integer> transform_skills; // IDs of skills
    private List<Integer> bundle_skills; // IDs of skills
    private Integer toolbelt_skill; // Corresponding toolbelt skill ID

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getChat_link() {
        return chat_link;
    }

    public void setChat_link(String chat_link) {
        this.chat_link = chat_link;
    }

    public SkillType getType() {
        return type;
    }

    public void setType(SkillType type) {
        this.type = type;
    }

    public WeaponType getWeapon_type() {
        return weapon_type;
    }

    public void setWeapon_type(WeaponType weapon_type) {
        this.weapon_type = weapon_type;
    }

    public List<ProfessionType> getProfessions() {
        return professions;
    }

    public void setProfessions(List<ProfessionType> professions) {
        this.professions = professions;
    }

    public SkillSlot getSlot() {
        return slot;
    }

    public void setSlot(SkillSlot slot) {
        this.slot = slot;
    }

    public List<SkillFact> getFacts() {
        return facts;
    }

    public void setFacts(List<SkillFact> facts) {
        this.facts = facts;
    }

    public List<SkillFact> getTraited_facts() {
        return traited_facts;
    }

    public void setTraited_facts(List<SkillFact> traited_facts) {
        this.traited_facts = traited_facts;
    }

    public List<SkillCategory> getCategories() {
        return categories;
    }

    public void setCategories(List<SkillCategory> categories) {
        this.categories = categories;
    }

    public WeaponType getOffhand() {
        return offhand;
    }

    public void setOffhand(WeaponType offhand) {
        this.offhand = offhand;
    }

    public AttunementType getAttunement() {
        return attunement;
    }

    public void setAttunement(AttunementType attunement) {
        this.attunement = attunement;
    }

    public Integer getCost() {
        return cost;
    }

    public void setCost(Integer cost) {
        this.cost = cost;
    }

    public Integer getFlip_skill() {
        return flip_skill;
    }

    public void setFlip_skill(Integer flip_skill) {
        this.flip_skill = flip_skill;
    }

    public Integer getInitiative() {
        return initiative;
    }

    public void setInitiative(Integer initiative) {
        this.initiative = initiative;
    }

    public Integer getNext_chain() {
        return next_chain;
    }

    public void setNext_chain(Integer next_chain) {
        this.next_chain = next_chain;
    }

    public Integer getPrev_chain() {
        return prev_chain;
    }

    public void setPrev_chain(Integer prev_chain) {
        this.prev_chain = prev_chain;
    }

    public List<Integer> getTransform_skills() {
        return transform_skills;
    }

    public void setTransform_skills(List<Integer> transform_skills) {
        this.transform_skills = transform_skills;
    }

    public List<Integer> getBundle_skills() {
        return bundle_skills;
    }

    public void setBundle_skills(List<Integer> bundle_skills) {
        this.bundle_skills = bundle_skills;
    }

    public Integer getToolbelt_skill() {
        return toolbelt_skill;
    }

    public void setToolbelt_skill(Integer toolbelt_skill) {
        this.toolbelt_skill = toolbelt_skill;
    }
}
