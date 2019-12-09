package com.cqjtu.rmms.service.impl;

import com.cqjtu.rmms.entity.Road;
import com.cqjtu.rmms.mapper.RoadMapper;
import com.cqjtu.rmms.service.RoadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
@Transactional(rollbackFor = Exception.class)
public class RoadServiceImpl implements RoadService {

    @Autowired
    private RoadMapper roadMapper ;

    @Override
    public Road get(String roadNo) {

        Road road = null;
        road=roadMapper.selectByPrimaryKey(roadNo);
        return road;

    }

    @Override
    public void addRoad(Road road) {

        roadMapper.insert(road);

    }

    @Override
    public List<Road> loadAll() {

        return roadMapper.selectAll();

    }

    @Override
    public void removeRoad(Integer roadId) {

        roadMapper.deleteByPrimaryKey(roadId);

    }

    @Override
    public void updateRoad(Road road) {

        roadMapper.updateByPrimaryKey(road);

    }

    @Override
    public Road getRoadById(Integer roadId) {

        return roadMapper.selectByPrimaryKey(roadId);

    }

}