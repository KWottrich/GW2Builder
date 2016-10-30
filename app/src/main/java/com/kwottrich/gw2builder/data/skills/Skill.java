package com.kwottrich.gw2builder.data.skills;

import com.kwottrich.gw2builder.data.enums.AttunementType;
import com.kwottrich.gw2builder.data.enums.ProfessionType;
import com.kwottrich.gw2builder.data.enums.SkillCategory;
import com.kwottrich.gw2builder.data.enums.SkillSlot;
import com.kwottrich.gw2builder.data.enums.SkillType;
import com.kwottrich.gw2builder.data.enums.WeaponType;
import com.kwottrich.gw2builder.data.enums.converters.AttunementTypeConverter;
import com.kwottrich.gw2builder.data.enums.converters.SkillSlotConverter;
import com.kwottrich.gw2builder.data.enums.converters.SkillTypeConverter;
import com.kwottrich.gw2builder.data.enums.converters.WeaponTypeConverter;
import com.kwottrich.gw2builder.data.joiners.JoinSkillsWithProfessions;
import com.kwottrich.gw2builder.data.joiners.JoinSkillsWithSkillCategories;

import org.greenrobot.greendao.annotation.Convert;
import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.JoinEntity;
import org.greenrobot.greendao.annotation.JoinProperty;
import org.greenrobot.greendao.annotation.ToMany;
import org.greenrobot.greendao.annotation.ToOne;
import org.greenrobot.greendao.annotation.Transient;

import java.util.List;

/**
 * Created by kenny on 8/30/2016.
 */
@Entity
public class Skill {
    @Id
    private Long id;
    private String name;
    private String description;
    private String icon;
    //private picture(?) icon
    private String chat_link;
    @Convert(converter = SkillTypeConverter.class, columnType = String.class)
    private SkillType type;
    @Convert(converter = WeaponTypeConverter.class, columnType = String.class)
    private WeaponType weapon_type;
    @ToMany
    @JoinEntity(
            entity = JoinSkillsWithProfessions.class,
            sourceProperty = "skillId",
            targetProperty = "professionId"
    )
    private List<ProfessionType> professions;
    @Convert(converter = SkillSlotConverter.class, columnType = String.class)
    private SkillSlot slot;
    @ToMany(referencedJoinProperty = "skillId")
    private List<SkillFact> facts;
    @ToMany(referencedJoinProperty = "traitedSkillId")
    private List<SkillFact> traited_facts;
    @ToMany
    @JoinEntity(
            entity = JoinSkillsWithSkillCategories.class,
            sourceProperty = "skillId",
            targetProperty = "skillCategoryId"
    )
    private List<SkillCategory> categories;
    @Convert(converter = WeaponTypeConverter.class, columnType = String.class)
    private WeaponType offhand; //(name of offhand weapon this skill requires to be equipped. Usually only present for Thief)
    //(also dual_wield?)
    @Convert(converter = AttunementTypeConverter.class, columnType = String.class)
    private AttunementType attunement; //ele only
    private Long cost; //("number" instead of Integer?)
    //private WeaponType dual_wield;
    @Transient
    private Long flip_skill;
    @ToOne(joinProperty = "flip_parent_skill")
    private Skill flip_skill_skill;
    private Long flip_parent_skill;
    private Long initiative;
    @Transient
    private Long next_chain; // ID of next skill
    @ToOne(joinProperty = "next_chain_parent_skill")
    private Skill next_chain_skill;
    private Long next_chain_parent_skill;
    @Transient
    private Long prev_chain; // ID of previous skill
    @ToOne(joinProperty = "prev_chain_parent_skill")
    private Skill prev_chain_skill;
    private Long prev_chain_parent_skill;
    @Transient
    private List<Long> transform_skills; // IDs of skills
    private Long transform_parent_skill;
    @ToMany(referencedJoinProperty = "transform_parent_skill")
    private List<Skill> transform_skills_skills;
    @Transient
    private List<Long> bundle_skills; // IDs of skills
    private Long bundle_parent_skill;
    @ToMany(referencedJoinProperty = "bundle_parent_skill")
    private List<Skill> bundle_skills_skills;
    @Transient
    private Long toolbelt_skill; // Corresponding toolbelt skill ID
    private Long toolbelt_parent_skill;
    @ToOne(joinProperty = "toolbelt_parent_skill")
    private Skill toolbelt_skill_skill;
}
