package com.cqjtu.rmms.utils;

import com.cqjtu.rmms.entity.RegularDamage;

import java.util.Random;

public class PointHelper {

    private String type;

    private String area;

    private String density;

    private String point;

    public PointHelper() {
    }

    public PointHelper(RegularDamage regularDamage) {
        this.type = regularDamage.getDamage_type();
        this.area = regularDamage.getDamage_area();
        this.density = "" + new Random().nextInt(10);
        this.point = "" + new Random().nextInt(10) + this.density;
    }

    public PointHelper(String type, String area, String density) {
        this.type = type;
        this.area = area;
        this.density = density;
        this.point = "" + new Random().nextInt(10) + density;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getDensity() {
        return density;
    }

    public void setDensity(String density) {
        this.density = density;
    }

    public String getPoint() {
        return point;
    }

    public void setPoint(String point) {
        this.point = point;
    }
}
