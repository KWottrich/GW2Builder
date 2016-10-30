package com.kwottrich.gw2builder.data.equipment;

import com.kwottrich.gw2builder.data.enums.ArmorType;
import com.kwottrich.gw2builder.data.enums.converters.ArmorTypeConverter;

import org.greenrobot.greendao.annotation.Convert;
import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;

/**
 * Created by kenny on 8/30/2016.
 */
@Entity
public class Armor extends Equipment {
    @Id
    private Long id;
    private Long characterId;

    @Convert(converter = ArmorTypeConverter.class, columnType = String.class)
    private ArmorType type;

    public ArmorType getType() {
        return type;
    }

    public void setType(ArmorType type) {
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
