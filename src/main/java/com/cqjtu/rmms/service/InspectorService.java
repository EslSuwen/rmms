package com.cqjtu.rmms.service;

import com.cqjtu.rmms.entity.Inspector;

import java.util.List;


public interface InspectorService {

    /**
     * 获取一条巡查人员数据
     *
     * @param  InspectorNo
     * @return Inspector
     *
     */
    Inspector get(String InspectorNo);


    /**
     * 新增一条巡查人员数据
     *
     * @param  Inspector
     * @return Inspector
     *
     */
    void addInspector(Inspector Inspector);


    /**
     * 删除一条巡查人员数据记录
     *
     * @param  InspectorId
     *
     */
    void removeInspector(Integer InspectorId);

    /**
     * 更新一条巡查人员记录
     *
     * @param Inspector
     *
     */
    void updateInspector(Inspector Inspector);

    /**
     * 获取一条巡查人员数据
     *
     * @param InspectorId
     * @return Inspector
     *
     */
    Inspector getInspectorById(Integer InspectorId);

    /**
     *  获取所有巡查人员数据
     *
     * @return List
     *
     */
    List<Inspector> loadAll();

}

