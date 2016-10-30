package com.kwottrich.gw2builder.data.equipment;

import com.kwottrich.gw2builder.data.enums.StatPrefix;
import com.kwottrich.gw2builder.data.enums.converters.StatPrefixConverter;

import org.greenrobot.greendao.annotation.Convert;
import org.greenrobot.greendao.annotation.Entity;

/**
 * Created by kenny on 9/1/2016.
 */
@Entity
public class Equipment {
    private Long characterId;
    @Convert(converter = StatPrefixConverter.class, columnType = String.class)
    private StatPrefix prefix;

    public StatPrefix getPrefix() {
        return prefix;
    }

    public void setPrefix(StatPrefix prefix) {
        this.prefix = prefix;
    }

    public Long getCharacterId() {
        return characterId;
    }

    public void setCharacterId(Long characterId) {
        this.characterId = characterId;
    }
}
