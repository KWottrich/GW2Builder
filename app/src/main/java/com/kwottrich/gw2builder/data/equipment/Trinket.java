package com.kwottrich.gw2builder.data.equipment;

import com.kwottrich.gw2builder.data.enums.TrinketType;

/**
 * Created by kenny on 8/30/2016.
 */
public class Trinket extends Equipment {
    private TrinketType type;

    public TrinketType getType() {
        return type;
    }

    public void setType(TrinketType type) {
        this.type = type;
    }
}
