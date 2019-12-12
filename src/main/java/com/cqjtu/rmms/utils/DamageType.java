package com.cqjtu.rmms.utils;

public class DamageType {

    private String damage_name;

    public DamageType(String damage_name){
        this.damage_name=damage_name;
    }

    public DamageType(){}

    public String getDamage_name() {
        return damage_name;
    }

    public void setDamage_name(String damage_name) {
        this.damage_name = damage_name;
    }
}
