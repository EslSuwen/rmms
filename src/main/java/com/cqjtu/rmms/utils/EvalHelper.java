package com.cqjtu.rmms.utils;

import com.cqjtu.rmms.entity.RegularDamage;

public class EvalHelper {
    private String PQI;
    private String rank_PQI;
    private String RQI;
    private String rank_RQI;
    private String PCI;
    private String rank_PCI;

    public EvalHelper() {
    }

    public EvalHelper(RegularDamage regularDamage) {
        this.PQI = regularDamage.getDamage_longth();
        int i = 0;
        i = Integer.parseInt(this.PQI);
        if (i > 90)
            rank_PQI = "A";
        else if (i < 90 && i > 80)
            rank_PQI = "B";
        else rank_PQI = "C";
        this.RQI = regularDamage.getDamage_width();
        i = Integer.parseInt(this.RQI);
        if (i > 90)
            rank_RQI = "A";
        else if (i < 90 && i > 80)
            rank_RQI = "B";
        else rank_RQI = "C";
        this.PCI = regularDamage.getDamage_height();
        i = Integer.parseInt(this.PCI);
        if (i > 90)
            rank_PCI = "A";
        else if (i < 90 && i > 80)
            rank_PCI = "B";
        else rank_PCI = "C";
    }

    public String getPQI() {
        return PQI;
    }

    public void setPQI(String PQI) {
        this.PQI = PQI;
    }

    public String getRank_PQI() {
        return rank_PQI;
    }

    public void setRank_PQI(String rank_PQI) {
        this.rank_PQI = rank_PQI;
    }

    public String getRQI() {
        return RQI;
    }

    public void setRQI(String RQI) {
        this.RQI = RQI;
    }

    public String getRank_RQI() {
        return rank_RQI;
    }

    public void setRank_RQI(String rank_RQI) {
        this.rank_RQI = rank_RQI;
    }

    public String getPCI() {
        return PCI;
    }

    public void setPCI(String PCI) {
        this.PCI = PCI;
    }

    public String getRank_PCI() {
        return rank_PCI;
    }

    public void setRank_PCI(String rank_PCI) {
        this.rank_PCI = rank_PCI;
    }
}
