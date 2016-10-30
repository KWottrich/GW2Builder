package com.kwottrich.gw2builder.data.enums.converters;

import com.kwottrich.gw2builder.data.enums.EffectType;

import org.greenrobot.greendao.converter.PropertyConverter;

/**
 * Created by kenny on 10/29/2016.
 */

public class EffectTypeConverter implements PropertyConverter<EffectType, String> {
    @Override
    public EffectType convertToEntityProperty(String databaseValue) {
        return EffectType.valueOf(databaseValue);
    }

    @Override
    public String convertToDatabaseValue(EffectType entityProperty) {
        return entityProperty.toString();
    }
}
