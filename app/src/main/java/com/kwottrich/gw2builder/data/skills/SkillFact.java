package com.kwottrich.gw2builder.data.skills;

import com.kwottrich.gw2builder.data.enums.AttributeType;
import com.kwottrich.gw2builder.data.enums.ComboFinisherType;
import com.kwottrich.gw2builder.data.enums.EffectType;
import com.kwottrich.gw2builder.data.enums.ComboFieldType;
import com.kwottrich.gw2builder.data.enums.SkillFactType;

/**
 * Created by kenny on 8/31/2016.
 */
public class SkillFact {
    private String text;
    private String icon;
    private SkillFactType type;
    private String value;
    private AttributeType target;
    private EffectType status;
    private String description;
    private Integer apply_count;
    private Integer duration; //TODO: determine if this needs to be decimal
    private ComboFieldType field_type;
    private ComboFinisherType finisher_type;
    private Integer hit_count;
    private Integer distance;
    private Integer percent;
    private SkillFact prefix;

    //Specifies which trait has to be selected in order for this fact to take effect
    private Integer requires_trait;

    //Specifies the array index of the SkillFact object it will override, if the trait specified in requires_trait is selected.
    // If this field is omitted, then the SkillFact contained within this object is to be appended to the existing SkillFacts array.
    private Integer overrides;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public SkillFactType getType() {
        return type;
    }

    public void setType(SkillFactType type) {
        this.type = type;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public AttributeType getTarget() {
        return target;
    }

    public void setTarget(AttributeType target) {
        this.target = target;
    }

    public EffectType getStatus() {
        return status;
    }

    public void setStatus(EffectType status) {
        this.status = status;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getApply_count() {
        return apply_count;
    }

    public void setApply_count(Integer apply_count) {
        this.apply_count = apply_count;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public ComboFieldType getField_type() {
        return field_type;
    }

    public void setField_type(ComboFieldType field_type) {
        this.field_type = field_type;
    }

    public ComboFinisherType getFinisher_type() {
        return finisher_type;
    }

    public void setFinisher_type(ComboFinisherType finisher_type) {
        this.finisher_type = finisher_type;
    }

    public Integer getHit_count() {
        return hit_count;
    }

    public void setHit_count(Integer hit_count) {
        this.hit_count = hit_count;
    }

    public Integer getDistance() {
        return distance;
    }

    public void setDistance(Integer distance) {
        this.distance = distance;
    }

    public Integer getPercent() {
        return percent;
    }

    public void setPercent(Integer percent) {
        this.percent = percent;
    }

    public SkillFact getPrefix() {
        return prefix;
    }

    public void setPrefix(SkillFact prefix) {
        this.prefix = prefix;
    }

    public Integer getRequires_trait() {
        return requires_trait;
    }

    public void setRequires_trait(Integer requires_trait) {
        this.requires_trait = requires_trait;
    }

    public Integer getOverrides() {
        return overrides;
    }

    public void setOverrides(Integer overrides) {
        this.overrides = overrides;
    }
}
