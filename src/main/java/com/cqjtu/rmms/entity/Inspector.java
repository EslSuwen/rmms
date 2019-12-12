package com.cqjtu.rmms.entity;

import org.springframework.stereotype.Component;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Random;

@Component
@Table(name = "tbl_inspector")
public class Inspector implements Serializable {

    @Id
    @Column(name = "inspector_no")
    private String inspector_no;

    @Column(name = "inspector_name")
    private String inspector_name;

    @Column(name = "inspector_tel")
    private String inspector_tel;

    @Column(name = "inspector_tab")
    private String inspector_tab;

    @Column(name = "inspector_pwd")
    private String inspector_pwd;

    public String getInspector_no() {
        return inspector_no;
    }

    public void setInspector_no(String inspector_no) {
        this.inspector_no = inspector_no;
    }

    public String getInspector_name() {
        return inspector_name;
    }

    public void setInspector_name(String inspector_name) {
        this.inspector_name = inspector_name;
    }

    public String getInspector_tel() {
        return inspector_tel;
    }

    public void setInspector_tel(String inspector_tel) {
        this.inspector_tel = inspector_tel;
    }

    public String getInspector_tab() {
        return inspector_tab;
    }

    public void setInspector_tab(String inspector_tab) {
        this.inspector_tab = inspector_tab;
    }


    public String getInspector_pwd() {
        return inspector_pwd;
    }

    public void setInspector_pwd(String inspector_pwd) {
        this.inspector_pwd = inspector_pwd;
    }
}
