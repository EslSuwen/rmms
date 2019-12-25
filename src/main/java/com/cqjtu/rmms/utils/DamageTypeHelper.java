package com.cqjtu.rmms.utils;


import java.util.ArrayList;
import java.util.List;

public class DamageTypeHelper {
    private List<DamageType> damage_type_list;

    public DamageTypeHelper() {
        damage_type_list = new ArrayList<>();
        damage_type_list.add(new DamageType("线裂"));
        damage_type_list.add(new DamageType("网裂"));
        damage_type_list.add(new DamageType("泛油"));
        damage_type_list.add(new DamageType("车辙"));
        damage_type_list.add(new DamageType("沉陷"));
        damage_type_list.add(new DamageType("坑洞"));
    }

    public List<DamageType> get() {
        return this.damage_type_list;
    }
}
