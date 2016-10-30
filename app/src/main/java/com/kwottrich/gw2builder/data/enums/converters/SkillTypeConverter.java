package com.kwottrich.gw2builder.data.enums.converters;

import com.kwottrich.gw2builder.data.enums.SkillType;

import org.greenrobot.greendao.converter.PropertyConverter;

/**
 * Created by kenny on 10/29/2016.
 */

public class SkillTypeConverter implements PropertyConverter<SkillType, String> {
    @Override
    public SkillType convertToEntityProperty(String databaseValue) {
        return SkillType.valueOf(databaseValue);
    }

    @Override
    public String convertToDatabaseValue(SkillType entityProperty) {
        return entityProperty.toString();
    }
}
