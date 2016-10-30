package com.kwottrich.gw2builder.data.enums.converters;

import com.kwottrich.gw2builder.data.enums.AttunementType;

import org.greenrobot.greendao.converter.PropertyConverter;

/**
 * Created by kenny on 10/29/2016.
 */

public class AttunementTypeConverter implements PropertyConverter<AttunementType, String> {
    @Override
    public AttunementType convertToEntityProperty(String databaseValue) {
        return AttunementType.valueOf(databaseValue);
    }

    @Override
    public String convertToDatabaseValue(AttunementType entityProperty) {
        return entityProperty.toString();
    }
}
