package com.kwottrich.gw2builder.data.enums.converters;

import com.kwottrich.gw2builder.data.enums.ArmorType;

import org.greenrobot.greendao.converter.PropertyConverter;

/**
 * Created by kenny on 10/29/2016.
 */

public class ArmorTypeConverter implements PropertyConverter<ArmorType, String> {
    @Override
    public ArmorType convertToEntityProperty(String databaseValue) {
        return ArmorType.valueOf(databaseValue);
    }

    @Override
    public String convertToDatabaseValue(ArmorType entityProperty) {
        return entityProperty.toString();
    }
}
