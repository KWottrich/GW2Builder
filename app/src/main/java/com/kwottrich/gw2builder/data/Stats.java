package com.kwottrich.gw2builder.data;

import java.math.BigDecimal;

/**
 * Created by kenny on 8/30/2016.
 */
public class Stats {
    private int defense;
    private int hitPoints;
    private BigDecimal criticalChance;
    private BigDecimal criticalDamage;
    private BigDecimal conditionDuration;
    private BigDecimal boonDuration;

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public BigDecimal getCriticalChance() {
        return criticalChance;
    }

    public void setCriticalChance(BigDecimal criticalChance) {
        this.criticalChance = criticalChance;
    }

    public BigDecimal getCriticalDamage() {
        return criticalDamage;
    }

    public void setCriticalDamage(BigDecimal criticalDamage) {
        this.criticalDamage = criticalDamage;
    }

    public BigDecimal getConditionDuration() {
        return conditionDuration;
    }

    public void setConditionDuration(BigDecimal conditionDuration) {
        this.conditionDuration = conditionDuration;
    }

    public BigDecimal getBoonDuration() {
        return boonDuration;
    }

    public void setBoonDuration(BigDecimal boonDuration) {
        this.boonDuration = boonDuration;
    }
}
