package com.cqjtu.rmms.entity;


import org.springframework.stereotype.Component;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Component
@Table(name = "tbl_regular_damage")
public class RegularDamage implements Serializable {

    @Id
    @Column(name = "damage_no")
    private String damage_no;

    @Column(name = "inspector_name")
    private String inspector_name;

    @Column(name = "road_name")
    private String road_name;

    @Column(name = "damage_type")
    private String damage_type;

    @Column(name = "damage_date")
    private String damage_date;

    @Column(name = "damage_start")
    private String damage_start;

    @Column(name = "damage_all_longth")
    private String damage_all_longth;

    @Column(name = "damage_all_width")
    private String damage_all_width;

    @Column(name = "damage_longth")
    private String damage_longth;

    @Column(name = "damage_width")
    private String damage_width;

    @Column(name = "damage_height")
    private String damage_height;

    @Column(name = "damage_desc")
    private String damage_desc;

    @Column(name = "damage_area")
    private String damage_area;

    @Column(name = "damage_ps")
    private String damage_ps;

    public String getDamage_no() {
        return damage_no;
    }

    public void setDamage_no(String damage_no) {
        this.damage_no = damage_no;
    }

    public String getInspector_name() {
        return inspector_name;
    }

    public void setInspector_name(String inspector_name) {
        this.inspector_name = inspector_name;
    }

    public String getRoad_name() {
        return road_name;
    }

    public void setRoad_name(String road_name) {
        this.road_name = road_name;
    }

    public String getDamage_type() {
        return damage_type;
    }

    public void setDamage_type(String damage_type) {
        this.damage_type = damage_type;
    }

    public String getDamage_date() {
        return damage_date;
    }

    public void setDamage_date(String damage_date) {
        this.damage_date = damage_date;
    }

    public String getDamage_start() {
        return damage_start;
    }

    public void setDamage_start(String damage_start) {
        this.damage_start = damage_start;
    }

    public String getDamage_all_longth() {
        return damage_all_longth;
    }

    public void setDamage_all_longth(String damage_all_longth) {
        this.damage_all_longth = damage_all_longth;
    }

    public String getDamage_all_width() {
        return damage_all_width;
    }

    public void setDamage_all_width(String damage_all_width) {
        this.damage_all_width = damage_all_width;
    }

    public String getDamage_longth() {
        return damage_longth;
    }

    public void setDamage_longth(String damage_longth) {
        this.damage_longth = damage_longth;
    }

    public String getDamage_width() {
        return damage_width;
    }

    public void setDamage_width(String damage_width) {
        this.damage_width = damage_width;
    }

    public String getDamage_height() {
        return damage_height;
    }

    public void setDamage_height(String damage_height) {
        this.damage_height = damage_height;
    }

    public String getDamage_desc() {
        return damage_desc;
    }

    public void setDamage_desc(String damage_desc) {
        this.damage_desc = damage_desc;
    }

    public String getDamage_area() {
        return damage_area;
    }

    public void setDamage_area(String damage_area) {
        this.damage_area = damage_area;
    }

    public String getDamage_ps() {
        return damage_ps;
    }

    public void setDamage_ps(String damage_ps) {
        this.damage_ps = damage_ps;
    }
}
