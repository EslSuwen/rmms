package com.cqjtu.rmms.service;

import com.cqjtu.rmms.entity.RegularDamage;

import java.util.List;


public interface RegularDamageService {

    /**
     * 获取一条定期损坏数据
     *
     * @param  regularDamageNo
     * @return RegularDamage
     *
     */
    RegularDamage get(String regularDamageNo);


    /**
     * 新增一条定期损坏数据
     *
     * @param  regularDamage
     * @return RegularDamage
     *
     */
    void addRegularDamage(RegularDamage regularDamage);


    /**
     * 删除一条定期损坏数据记录
     *
     * @param  regularDamageId
     *
     */
    void removeRegularDamage(Integer regularDamageId);

    /**
     * 更新一条定期损坏记录
     *
     * @param regularDamage
     *
     */
    void updateRegularDamage(RegularDamage regularDamage);

    /**
     * 获取一条定期损坏记录
     *
     * @param regularDamageId
     * @return RegularDamage
     *
     */
    RegularDamage getRegularDamageById(Integer regularDamageId);

    /**
     *  获取所有定期损坏记录
     *
     * @return List
     *
     */
    List<RegularDamage> loadAll();

    /**
     * 获取特征日常巡查数据记录
     *
     * @return List
     */
    List<RegularDamage> select(RegularDamage dailyInspect);

    /**
     * 获取所有各道路巡查数据记录
     *
     * @return List
     */
    List<RegularDamage> loadDistinct();

}

