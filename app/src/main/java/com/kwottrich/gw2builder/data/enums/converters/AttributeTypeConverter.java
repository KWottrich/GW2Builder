package com.kwottrich.gw2builder.data.enums.converters;

import com.kwottrich.gw2builder.data.enums.AttributeType;

import org.greenrobot.greendao.converter.PropertyConverter;

/**
 * Created by kenny on 8/31/2016.
 */
public class AttributeTypeConverter implements PropertyConverter<AttributeType, String> {
    @Override
    public AttributeType convertToEntityProperty(String databaseValue) {
        return AttributeType.valueOf(databaseValue);
    }

    @Override
    public String convertToDatabaseValue(AttributeType entityProperty) {
        return entityProperty.toString();
    }
}
