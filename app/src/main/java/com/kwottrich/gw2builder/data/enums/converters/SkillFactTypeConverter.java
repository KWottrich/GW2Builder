package com.kwottrich.gw2builder.data.enums.converters;

import com.kwottrich.gw2builder.data.enums.SkillFactType;

import org.greenrobot.greendao.converter.PropertyConverter;

/**
 * Created by kenny on 10/29/2016.
 */

public class SkillFactTypeConverter implements PropertyConverter<SkillFactType, String> {
    @Override
    public SkillFactType convertToEntityProperty(String databaseValue) {
        return SkillFactType.valueOf(databaseValue);
    }

    @Override
    public String convertToDatabaseValue(SkillFactType entityProperty) {
        return entityProperty.toString();
    }
}
