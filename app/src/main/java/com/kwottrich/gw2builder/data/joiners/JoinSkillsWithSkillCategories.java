package com.kwottrich.gw2builder.data.joiners;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;

/**
 * Created by kenny on 10/29/2016.
 */
@Entity
public class JoinSkillsWithSkillCategories {
    @Id
    private Long id;
    private Long skillId;
    private Long skillCategoryId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getSkillId() {
        return skillId;
    }

    public void setSkillId(Long skillId) {
        this.skillId = skillId;
    }

    public Long getSkillCategoryId() {
        return skillCategoryId;
    }

    public void setSkillCategoryId(Long skillCategoryId) {
        this.skillCategoryId = skillCategoryId;
    }
}
