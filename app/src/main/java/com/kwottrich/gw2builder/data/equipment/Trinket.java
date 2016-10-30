package com.kwottrich.gw2builder.data.equipment;

import com.kwottrich.gw2builder.data.enums.TrinketType;
import com.kwottrich.gw2builder.data.enums.converters.TrinketTypeConverter;

import org.greenrobot.greendao.annotation.Convert;
import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;

/**
 * Created by kenny on 8/30/2016.
 */
@Entity
public class Trinket extends Equipment {
    @Id
    private Long id;
    private Long characterId;
    @Convert(converter = TrinketTypeConverter.class, columnType = String.class)
    private TrinketType type;

    public TrinketType getType() {
        return type;
    }

    public void setType(TrinketType type) {
        this.type = type;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public Long getCharacterId() {
        return characterId;
    }

    @Override
    public void setCharacterId(Long characterId) {
        this.characterId = characterId;
    }
}
