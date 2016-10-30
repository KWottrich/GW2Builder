package com.kwottrich.gw2builder.data.enums;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;

/**
 * Created by kenny on 8/30/2016.
 */
@Entity
public enum ProfessionType {
    Elementalist,
    Warrior,
    Engineer,
    Thief,
    Mesmer,
    Guardian,
    Necromancer,
    Ranger,
    Revenant;

    @Id
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
