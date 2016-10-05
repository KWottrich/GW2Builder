package com.kwottrich.gw2builder.data.equipment;

import com.kwottrich.gw2builder.data.enums.WeaponType;
import com.kwottrich.gw2builder.data.specializations.Specialization;

/**
 * Created by kenny on 8/30/2016.
 */
public class Weapon extends Equipment {
    private WeaponType weaponType;
    private Specialization specialization;

    public WeaponType getWeaponType() {
        return weaponType;
    }

    public void setWeaponType(WeaponType weaponType) {
        this.weaponType = weaponType;
    }
}
