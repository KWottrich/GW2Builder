package com.kwottrich.gw2builder.data.equipment;

import com.kwottrich.gw2builder.data.enums.ArmorType;

/**
 * Created by kenny on 8/30/2016.
 */
public class Armor extends Equipment {
    private ArmorType type;

    public ArmorType getType() {
        return type;
    }

    public void setType(ArmorType type) {
        this.type = type;
    }
}
