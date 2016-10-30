package com.kwottrich.gw2builder.data.enums;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;

/**
 * Created by kenny on 8/31/2016.
 */
@Entity
public enum SkillCategory {
    Arcane,
    Attunement,
    Banner,
    Burst,
    Cantrip,
    CelestialAvatar,
    Clone,
    Conjure,
    Consecration,
    Corruption,
    Deception,
    DeviceKit,
    DualWield,
    Elixir,
    Gadget,
    Glamour,
    Glyph,
    Gyro,
    Legend,
    LegendaryAssassin,
    LegendaryCentaur,
    LegendaryDemon,
    LegendaryDragon,
    LegendaryDwarf,
    Manipulation,
    Mantra,
    Mark,
    Meditation,
    Minion,
    Overload,
    Pet,
    Phantasm,
    Physical,
    PrimalBurst,
    Rage,
    Shatter,
    Shout,
    Signet,
    Spectral,
    Spirit,
    SpiritWeapon,
    Stance,
    StealthAttack,
    StolenSkill,
    Survival,
    Symbol,
    Trap,
    Trick,
    Turret,
    Venom,
    Virtue,
    Ward,
    WeaponKit,
    Well;

    @Id
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
