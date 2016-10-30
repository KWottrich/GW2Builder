package com.kwottrich.gw2builder.data.enums.converters;

import com.kwottrich.gw2builder.data.enums.SkillCategory;

import org.greenrobot.greendao.converter.PropertyConverter;

/**
 * Created by kenny on 10/29/2016.
 */

public class SkillCategoryConverter implements PropertyConverter<SkillCategory, String> {
    @Override
    public SkillCategory convertToEntityProperty(String databaseValue) {
        return SkillCategory.valueOf(databaseValue);
    }

    @Override
    public String convertToDatabaseValue(SkillCategory entityProperty) {
        return entityProperty.toString();
    }
}
