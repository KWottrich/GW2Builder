package com.kwottrich.gw2builder.data.enums.converters;

import com.kwottrich.gw2builder.data.enums.ProfessionType;

import org.greenrobot.greendao.converter.PropertyConverter;

/**
 * Created by kenny on 10/29/2016.
 */

public class ProfessionTypeConverter implements PropertyConverter<ProfessionType, String> {

    @Override
    public ProfessionType convertToEntityProperty(String databaseValue) {
        return ProfessionType.valueOf(databaseValue);
    }

    @Override
    public String convertToDatabaseValue(ProfessionType entityProperty) {
        return entityProperty.toString();
    }
}
