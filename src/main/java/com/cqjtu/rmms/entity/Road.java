package com.cqjtu.rmms.entity;

import org.springframework.stereotype.Component;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Random;

@Component
@Table(name = "road_info")
public class Road implements Serializable {

    @Id
    @Column(name = "road_id")
    private String road_id;

    /**
     * 路面信息
     */
    @Column(name = "lmlx_lmlx")
    private String lmlx_lmlx;

    /**
     * 道路名称
     */
    @Column(name = "road_name")
    private String road_name;

    /**
     * 道路走向
     */
    @Column(name = "road_zx")
    private String road_zx;

    /**
     * 起点
     */
    @Column(name = "road_qd")
    private String road_qd;

    /**
     * 终点
     */
    @Column(name = "road_zd")
    private String road_zd;

    /**
     * 设计单位
     */
    @Column(name = "road_sjdw")
    private String road_sjdw;

    /**
     * 施工单位
     */
    @Column(name = "road_sgdw")
    private String road_sgdw;

    /**
     * 道路等级
     */
    @Column(name = "road_dldj")
    private String road_dldj;


    /**
     * 路面等级
     */
    @Column(name = "road_lmdj")
    private String road_lmdj;


    /**
     * 设计时速
     */
    @Column(name = "road_sjss")
    private String road_sjss;


    /**
     * 路幅宽度范围
     */
    @Column(name = "road_lfkdfw")
    private String road_lfkdfw;


    /**
     * 道路长度
     */
    @Column(name = "road_dlcd")
    private String road_dlcd;


    /**
     * 道路面积
     */
    @Column(name = "road_dlmj")
    private String road_dlmj;


    /**
     * AADT
     */
    @Column(name = "road_AADT")
    private String road_AADT;


    /**
     * 交通量等级
     */
    @Column(name = "road_jtldj")
    private String road_jtldj;


    /**
     * 所属乡镇
     */
    @Column(name = "road_ssxz")
    private String road_ssxz;


    /**
     * 管理分类
     */
    @Column(name = "road_glfl")
    private String road_glfl;

    /**
     * 管理单位
     */
    @Column(name = "road_gldw")
    private String road_gldw;

    /**
     * 养护单位
     */
    @Column(name = "road_yhdw")
    private String road_yhdw;

    /**
     * 建造年月
     */
    @Column(name = "road_jzny")
    private String road_jzny;

    /**
     * 路面厚度
     */
    @Column(name = "road_lmhd")
    private String road_lmhd;

    /**
     * 基层类型
     */
    @Column(name = "road_jclx")
    private String road_jclx;

    /**
     * 基层厚度
     */
    @Column(name = "road_jchd")
    private String road_jchd;

    /**
     * 车道数
     */
    @Column(name = "road_cds")
    private String road_cds;

    /**
     * 通行方向
     */
    @Column(name = "road_txfx")
    private String road_txfx;

    /**
     * 机动车道宽度范围
     */
    @Column(name = "road_jdcdkdfw")
    private String road_jdcdkdfw;

    /**
     * 左侧非机动车道宽度范围
     */
    @Column(name = "road_zcfjdcdkdfw")
    private String road_zcfjdcdkdfw;

    /**
     * 右侧非机动车道宽度范围
     */
    @Column(name = "road_ycfjdcdkdfw")
    private String road_ycfjdcdkdfw;

    /**
     * 车行道面积
     */
    @Column(name = "road_cxdmj")
    private String road_cxdmj;

    /**
     * 有无公交车专用道
     */
    @Column(name = "road_ywgjczyd")
    private String road_ywgjczyd;

    /**
     * 侧石类型
     */
    @Column(name = "road_cslx")
    private String road_cslx;

    /**
     * 侧石长度
     */
    @Column(name = "road_cscd")
    private String road_cscd;

    /**
     * 平石类型
     */
    @Column(name = "road_pslx")
    private String road_pslx;

    /**
     * 平石长度
     */
    @Column(name = "road_pscd")
    private String road_pscd;

    /**
     * 检查井数量
     */
    @Column(name = "road_jcjsl")
    private String road_jcjsl;

    /**
     * 雨水口数量
     */
    @Column(name = "road_ysksl")
    private String road_ysksl;

    /**
     * 路名牌数量
     */
    @Column(name = "road_lmpsl")
    private String road_lmpsl;

    /**
     * 标志牌数量
     */
    @Column(name = "road_bzpsl")
    private String road_bzpsl;

    /**
     * 树池面积
     */
    @Column(name = "road_scmj")
    private String road_scmj;

    /**
     * 其他
     */
    @Column(name = "road_qt")
    private String road_qt;

    /**
     * 道路经度
     */
    @Column(name = "road_dljd")
    private String road_dljd;

    /**
     * 道路纬度
     */
    @Column(name = "road_dlwd")
    private String road_dlwd;

    /**
     * 道路id
     */
    @Column(name = "road_dlid")
    private String road_dlid;

    /**
     * 是否删除
     */
    @Column(name = "road_del")
    private String road_del;


    public String getRoad_id() {
        return road_id;
    }

    public void setRoad_id(String road_id) {
        this.road_id = road_id;
    }

    public String getLmlx_lmlx() {
        return lmlx_lmlx;
    }

    public void setLmlx_lmlx(String lmlx_lmlx) {
        this.lmlx_lmlx = lmlx_lmlx;
    }

    public String getRoad_name() {
        return road_name;
    }

    public void setRoad_name(String road_name) {
        this.road_name = road_name;
    }

    public String getRoad_zx() {
        return road_zx;
    }

    public void setRoad_zx(String road_zx) {
        this.road_zx = road_zx;
    }

    public String getRoad_qd() {
        return road_qd;
    }

    public void setRoad_qd(String road_qd) {
        this.road_qd = road_qd;
    }

    public String getRoad_zd() {
        return road_zd;
    }

    public void setRoad_zd(String road_zd) {
        this.road_zd = road_zd;
    }

    public String getRoad_sjdw() {
        return road_sjdw;
    }

    public void setRoad_sjdw(String road_sjdw) {
        this.road_sjdw = road_sjdw;
    }

    public String getRoad_sgdw() {
        return road_sgdw;
    }

    public void setRoad_sgdw(String road_sgdw) {
        this.road_sgdw = road_sgdw;
    }

    public String getRoad_dldj() {
        return road_dldj;
    }

    public void setRoad_dldj(String road_dldj) {
        this.road_dldj = road_dldj;
    }

    public String getRoad_lmdj() {
        return road_lmdj;
    }

    public void setRoad_lmdj(String road_lmdj) {
        this.road_lmdj = road_lmdj;
    }

    public String getRoad_sjss() {
        return road_sjss;
    }

    public void setRoad_sjss(String road_sjss) {
        this.road_sjss = road_sjss;
    }

    public String getRoad_lfkdfw() {
        return road_lfkdfw;
    }

    public void setRoad_lfkdfw(String road_lfkdfw) {
        this.road_lfkdfw = road_lfkdfw;
    }

    public String getRoad_dlcd() {
        return road_dlcd;
    }

    public void setRoad_dlcd(String road_dlcd) {
        this.road_dlcd = road_dlcd;
    }

    public String getRoad_dlmj() {
        return road_dlmj;
    }

    public void setRoad_dlmj(String road_dlmj) {
        this.road_dlmj = road_dlmj;
    }

    public String getRoad_AADT() {
        return road_AADT;
    }

    public void setRoad_AADT(String road_AADT) {
        this.road_AADT = road_AADT;
    }

    public String getRoad_jtldj() {
        return road_jtldj;
    }

    public void setRoad_jtldj(String road_jtldj) {
        this.road_jtldj = road_jtldj;
    }

    public String getRoad_ssxz() {
        return road_ssxz;
    }

    public void setRoad_ssxz(String road_ssxz) {
        this.road_ssxz = road_ssxz;
    }

    public String getRoad_glfl() {
        return road_glfl;
    }

    public void setRoad_glfl(String road_glfl) {
        this.road_glfl = road_glfl;
    }

    public String getRoad_gldw() {
        return road_gldw;
    }

    public void setRoad_gldw(String road_gldw) {
        this.road_gldw = road_gldw;
    }

    public String getRoad_yhdw() {
        return road_yhdw;
    }

    public void setRoad_yhdw(String road_yhdw) {
        this.road_yhdw = road_yhdw;
    }

    public String getRoad_jzny() {
        return road_jzny;
    }

    public void setRoad_jzny(String road_jzny) {
        this.road_jzny = road_jzny;
    }

    public String getRoad_lmhd() {
        return road_lmhd;
    }

    public void setRoad_lmhd(String road_lmhd) {
        this.road_lmhd = road_lmhd;
    }

    public String getRoad_jclx() {
        return road_jclx;
    }

    public void setRoad_jclx(String road_jclx) {
        this.road_jclx = road_jclx;
    }

    public String getRoad_jchd() {
        return road_jchd;
    }

    public void setRoad_jchd(String road_jchd) {
        this.road_jchd = road_jchd;
    }

    public String getRoad_cds() {
        return road_cds;
    }

    public void setRoad_cds(String road_cds) {
        this.road_cds = road_cds;
    }

    public String getRoad_txfx() {
        return road_txfx;
    }

    public void setRoad_txfx(String road_txfx) {
        this.road_txfx = road_txfx;
    }

    public String getRoad_jdcdkdfw() {
        return road_jdcdkdfw;
    }

    public void setRoad_jdcdkdfw(String road_jdcdkdfw) {
        this.road_jdcdkdfw = road_jdcdkdfw;
    }

    public String getRoad_zcfjdcdkdfw() {
        return road_zcfjdcdkdfw;
    }

    public void setRoad_zcfjdcdkdfw(String road_zcfjdcdkdfw) {
        this.road_zcfjdcdkdfw = road_zcfjdcdkdfw;
    }

    public String getRoad_ycfjdcdkdfw() {
        return road_ycfjdcdkdfw;
    }

    public void setRoad_ycfjdcdkdfw(String road_ycfjdcdkdfw) {
        this.road_ycfjdcdkdfw = road_ycfjdcdkdfw;
    }

    public String getRoad_cxdmj() {
        return road_cxdmj;
    }

    public void setRoad_cxdmj(String road_cxdmj) {
        this.road_cxdmj = road_cxdmj;
    }

    public String getRoad_ywgjczyd() {
        return road_ywgjczyd;
    }

    public void setRoad_ywgjczyd(String road_ywgjczyd) {
        this.road_ywgjczyd = road_ywgjczyd;
    }

    public String getRoad_cslx() {
        return road_cslx;
    }

    public void setRoad_cslx(String road_cslx) {
        this.road_cslx = road_cslx;
    }

    public String getRoad_cscd() {
        return road_cscd;
    }

    public void setRoad_cscd(String road_cscd) {
        this.road_cscd = road_cscd;
    }

    public String getRoad_pslx() {
        return road_pslx;
    }

    public void setRoad_pslx(String road_pslx) {
        this.road_pslx = road_pslx;
    }

    public String getRoad_pscd() {
        return road_pscd;
    }

    public void setRoad_pscd(String road_pscd) {
        this.road_pscd = road_pscd;
    }

    public String getRoad_jcjsl() {
        return road_jcjsl;
    }

    public void setRoad_jcjsl(String road_jcjsl) {
        this.road_jcjsl = road_jcjsl;
    }

    public String getRoad_ysksl() {
        return road_ysksl;
    }

    public void setRoad_ysksl(String road_ysksl) {
        this.road_ysksl = road_ysksl;
    }

    public String getRoad_lmpsl() {
        return road_lmpsl;
    }

    public void setRoad_lmpsl(String road_lmpsl) {
        this.road_lmpsl = road_lmpsl;
    }

    public String getRoad_bzpsl() {
        return road_bzpsl;
    }

    public void setRoad_bzpsl(String road_bzpsl) {
        this.road_bzpsl = road_bzpsl;
    }

    public String getRoad_scmj() {
        return road_scmj;
    }

    public void setRoad_scmj(String road_scmj) {
        this.road_scmj = road_scmj;
    }

    public String getRoad_qt() {
        return road_qt;
    }

    public void setRoad_qt(String road_qt) {
        this.road_qt = road_qt;
    }

    public String getRoad_dljd() {
        return road_dljd;
    }

    public void setRoad_dljd(String road_dljd) {
        this.road_dljd = road_dljd;
    }

    public String getRoad_dlwd() {
        return road_dlwd;
    }

    public void setRoad_dlwd(String road_dlwd) {
        this.road_dlwd = road_dlwd;
    }

    public String getRoad_dlid() {
        return road_dlid;
    }

    public void setRoad_dlid(String road_dlid) {
        this.road_dlid = road_dlid;
    }

    public String getRoad_del() {
        return road_del;
    }

    public void setRoad_del(String road_del) {
        this.road_del = road_del;
    }

    public String getFakeData() {
        return "" + new Random().nextInt(10000);
    }

}
