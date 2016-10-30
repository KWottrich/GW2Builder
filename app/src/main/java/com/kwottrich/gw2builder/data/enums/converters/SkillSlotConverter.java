package com.kwottrich.gw2builder.data.enums.converters;

import com.kwottrich.gw2builder.data.enums.SkillSlot;

import org.greenrobot.greendao.converter.PropertyConverter;

/**
 * Created by kenny on 10/29/2016.
 */

public class SkillSlotConverter implements PropertyConverter<SkillSlot, String> {
    @Override
    public SkillSlot convertToEntityProperty(String databaseValue) {
        return SkillSlot.valueOf(databaseValue);
    }

    @Override
    public String convertToDatabaseValue(SkillSlot entityProperty) {
        return entityProperty.toString();
    }
}
