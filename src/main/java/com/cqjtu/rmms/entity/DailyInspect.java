package com.cqjtu.rmms.entity;


import org.springframework.stereotype.Component;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Random;

@Component
@Table(name = "tbl_daily_inspect")
public class DailyInspect implements Serializable {

    @Id
    @Column(name = "daily_inspect_no")
    private String daily_inspect_no;

    @Column(name = "road_name")
    private String road_name;

    @Column(name = "inspector_name")
    private String inspector_name;

    @Column(name = "damage_type")
    private String damage_type;

    @Column(name = "daily_inspect_date")
    private String daily_inspect_date;

    @Column(name = "daily_inspect_desc")
    private String daily_inspect_desc;

    @Column(name = "daily_inspector_ps")
    private String daily_inspector_ps;

    public String getDaily_inspect_no() {
        return daily_inspect_no;
    }

    public void setDaily_inspect_no(String daily_inspect_no) {
        this.daily_inspect_no = daily_inspect_no;
    }

    public String getRoad_name() {
        return road_name;
    }

    public void setRoad_name(String road_name) {
        this.road_name = road_name;
    }

    public String getInspector_name() {
        return inspector_name;
    }

    public void setInspector_name(String inspector_name) {
        this.inspector_name = inspector_name;
    }

    public String getDamage_type() {
        return damage_type;
    }

    public void setDamage_type(String damage_type) {
        this.damage_type = damage_type;
    }

    public String getDaily_inspect_date() {
        return daily_inspect_date;
    }

    public void setDaily_inspect_date(String daily_inspect_date) {
        this.daily_inspect_date = daily_inspect_date;
    }

    public String getDaily_inspect_desc() {
        return daily_inspect_desc;
    }

    public void setDaily_inspect_desc(String daily_inspect_desc) {
        this.daily_inspect_desc = daily_inspect_desc;
    }

    public String getDaily_inspector_ps() {
        return daily_inspector_ps;
    }

    public void setDaily_inspector_ps(String daily_inspector_ps) {
        this.daily_inspector_ps = daily_inspector_ps;
    }
}
