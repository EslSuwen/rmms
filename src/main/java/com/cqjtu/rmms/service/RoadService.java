package com.cqjtu.rmms.service;

import com.cqjtu.rmms.entity.Road;

import java.util.List;


public interface RoadService {

    /**
     * 获取一条道路数据
     *
     * @param  roadNo
     * @return Road
     *
     */
    Road get(String roadNo);


    /**
     * 新增一条道路数据
     *
     * @param  road
     * @return Road
     *
     */
    void addRoad(Road road);


    /**
     * 删除一条道路数据记录
     *
     * @param  roadId
     *
     */
    void removeRoad(Integer roadId);

    /**
     * 更新一条道路记录
     *
     * @param road
     *
     */
    void updateRoad(Road road);

    /**
     * 获取一条课程类型记录
     *
     * @param roadId
     * @return Road
     *
     */
    Road getRoadById(Integer roadId);

    /**
     *  获取所有课程类型记录
     *
     * @return List
     *
     */
    List<Road> loadAll();

}

