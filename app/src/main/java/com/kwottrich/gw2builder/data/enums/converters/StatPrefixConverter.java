package com.kwottrich.gw2builder.data.enums.converters;

import com.kwottrich.gw2builder.data.enums.StatPrefix;

import org.greenrobot.greendao.converter.PropertyConverter;

/**
 * Created by kenny on 10/29/2016.
 */

public class StatPrefixConverter implements PropertyConverter<StatPrefix, String> {
    @Override
    public StatPrefix convertToEntityProperty(String databaseValue) {
        return StatPrefix.valueOf(databaseValue);
    }

    @Override
    public String convertToDatabaseValue(StatPrefix entityProperty) {
        return entityProperty.toString();
    }
}
