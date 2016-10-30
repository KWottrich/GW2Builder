package com.kwottrich.gw2builder.data.equipment;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;

/**
 * Created by kenny on 9/1/2016.
 */
@Entity
public class BackItem extends Equipment {
    @Id
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
