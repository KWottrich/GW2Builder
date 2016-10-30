package com.kwottrich.gw2builder.data.enums.converters;

import com.kwottrich.gw2builder.data.enums.ComboFieldType;

import org.greenrobot.greendao.converter.PropertyConverter;

/**
 * Created by kenny on 10/29/2016.
 */

public class ComboFieldTypeConverter implements PropertyConverter<ComboFieldType, String> {
    @Override
    public ComboFieldType convertToEntityProperty(String databaseValue) {
        return ComboFieldType.valueOf(databaseValue);
    }

    @Override
    public String convertToDatabaseValue(ComboFieldType entityProperty) {
        return entityProperty.toString();
    }
}
