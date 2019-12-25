package com.cqjtu.rmms.entity;


import org.springframework.stereotype.Component;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Component
@Table(name = "tbl_regular_smooth")
public class RegularSmooth implements Serializable {

    @Id
    @Column(name = "smooth_no")
    private String smooth_no;

    @Column(name = "inspector_name")
    private String inspector_name;

    @Column(name = "road_name")
    private String road_name;

    @Column(name = "smooth_IRI")
    private String smooth_IRI;

    @Column(name = "smooth_date")
    private String smooth_date;

    @Column(name = "smooth_ps")
    private String smooth_ps;

    public String getSmooth_no() {
        return smooth_no;
    }

    public void setSmooth_no(String smooth_no) {
        this.smooth_no = smooth_no;
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

    public String getSmooth_IRI() {
        return smooth_IRI;
    }

    public void setSmooth_IRI(String smooth_IRI) {
        this.smooth_IRI = smooth_IRI;
    }

    public String getSmooth_date() {
        return smooth_date;
    }

    public void setSmooth_date(String smooth_date) {
        this.smooth_date = smooth_date;
    }

    public String getSmooth_ps() {
        return smooth_ps;
    }

    public void setSmooth_ps(String smooth_ps) {
        this.smooth_ps = smooth_ps;
    }
}
