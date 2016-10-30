package com.kwottrich.gw2builder.data.equipment;

import com.kwottrich.gw2builder.data.enums.WeaponType;
import com.kwottrich.gw2builder.data.enums.converters.WeaponTypeConverter;
import com.kwottrich.gw2builder.data.specializations.Specialization;

import org.greenrobot.greendao.annotation.Convert;
import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;

/**
 * Created by kenny on 8/30/2016.
 */
@Entity
public class Weapon extends Equipment {
    @Id
    private Long id;
    private Long characterId;
    @Convert(converter = WeaponTypeConverter.class, columnType = String.class)
    private WeaponType weaponType;

    public WeaponType getWeaponType() {
        return weaponType;
    }

    public void setWeaponType(WeaponType weaponType) {
        this.weaponType = weaponType;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public Long getCharacterId() {
        return characterId;
    }

    @Override
    public void setCharacterId(Long characterId) {
        this.characterId = characterId;
    }
}
