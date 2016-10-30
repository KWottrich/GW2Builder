package com.kwottrich.gw2builder.data.enums.converters;

import com.kwottrich.gw2builder.data.enums.WeaponType;

import org.greenrobot.greendao.converter.PropertyConverter;

/**
 * Created by kenny on 10/29/2016.
 */

public class WeaponTypeConverter implements PropertyConverter<WeaponType, String> {
    @Override
    public WeaponType convertToEntityProperty(String databaseValue) {
        return WeaponType.valueOf(databaseValue);
    }

    @Override
    public String convertToDatabaseValue(WeaponType entityProperty) {
        return entityProperty.toString();
    }
}
