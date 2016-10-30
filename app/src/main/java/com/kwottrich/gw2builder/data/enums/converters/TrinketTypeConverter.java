package com.kwottrich.gw2builder.data.enums.converters;

import com.kwottrich.gw2builder.data.enums.TrinketType;

import org.greenrobot.greendao.converter.PropertyConverter;

/**
 * Created by kenny on 10/29/2016.
 */

public class TrinketTypeConverter implements PropertyConverter<TrinketType, String> {


    @Override
    public TrinketType convertToEntityProperty(String databaseValue) {
        return TrinketType.valueOf(databaseValue);
    }

    @Override
    public String convertToDatabaseValue(TrinketType entityProperty) {
        return entityProperty.toString();
    }
}
