package com.cqjtu.rmms.service;

import com.cqjtu.rmms.entity.RegularSmooth;

import java.util.List;


public interface RegularSmoothService {

    /**
     * 获取一条定期平整数据
     *
     * @param  regularSmoothNo
     * @return RegularSmooth
     *
     */
    RegularSmooth get(String regularSmoothNo);


    /**
     * 新增一条定期平整数据
     *
     * @param  regularSmooth
     * @return RegularSmooth
     *
     */
    void addRegularSmooth(RegularSmooth regularSmooth);


    /**
     * 删除一条定期平整数据记录
     *
     * @param  regularSmoothId
     *
     */
    void removeRegularSmooth(Integer regularSmoothId);

    /**
     * 更新一条定期平整记录
     *
     * @param regularSmooth
     *
     */
    void updateRegularSmooth(RegularSmooth regularSmooth);

    /**
     * 获取一条定期平整记录
     *
     * @param regularSmoothId
     * @return RegularSmooth
     *
     */
    RegularSmooth getRegularSmoothById(Integer regularSmoothId);

    /**
     *  获取所有定期平整记录
     *
     * @return List
     *
     */
    List<RegularSmooth> loadAll();

}

