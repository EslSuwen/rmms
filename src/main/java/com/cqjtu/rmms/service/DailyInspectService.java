package com.cqjtu.rmms.service;

import com.cqjtu.rmms.entity.DailyInspect;

import java.util.List;


public interface DailyInspectService {

    /**
     * 获取一条日常巡查数据
     *
     * @param dailyInspectNo
     * @return DailyInspect
     */
    DailyInspect get(String dailyInspectNo);


    /**
     * 新增一条日常巡查数据
     *
     * @param dailyInspect
     * @return DailyInspect
     */
    void addDailyInspect(DailyInspect dailyInspect);


    /**
     * 删除一条日常巡查数据记录
     *
     * @param dailyInspectId
     */
    void removeDailyInspect(Integer dailyInspectId);

    /**
     * 更新一条日常巡查记录
     *
     * @param dailyInspect
     */
    void updateDailyInspect(DailyInspect dailyInspect);

    /**
     * 获取一条日常巡查数据记录
     *
     * @param dailyInspectId
     * @return DailyInspect
     */
    DailyInspect getDailyInspectById(Integer dailyInspectId);

    /**
     * 获取所有日常巡查数据记录
     *
     * @return List
     */
    List<DailyInspect> loadAll();

    /**
     * 获取特征日常巡查数据记录
     *
     * @return List
     */
    List<DailyInspect> select(DailyInspect dailyInspect);

    /**
     * 获取所有各道路巡查数据记录
     *
     * @return List
     */
    List<DailyInspect> loadDistinct();
}

