package com.kwottrich.gw2builder.data.enums.converters;

import com.kwottrich.gw2builder.data.enums.ComboFinisherType;

import org.greenrobot.greendao.converter.PropertyConverter;

/**
 * Created by kenny on 10/29/2016.
 */

public class ComboFinisherTypeConverter implements PropertyConverter<ComboFinisherType, String> {
    @Override
    public ComboFinisherType convertToEntityProperty(String databaseValue) {
        return ComboFinisherType.valueOf(databaseValue);
    }

    @Override
    public String convertToDatabaseValue(ComboFinisherType entityProperty) {
        return entityProperty.toString();
    }
}
