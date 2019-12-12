package com.cqjtu.rmms.service.impl;

import com.cqjtu.rmms.entity.Inspector;
import com.cqjtu.rmms.mapper.InspectorMapper;
import com.cqjtu.rmms.service.InspectorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
@Transactional(rollbackFor = Exception.class)
public class InspectorServiceImpl implements InspectorService {

    @Autowired
    private InspectorMapper inspectorMapper ;

    @Override
    public Inspector get(String inspectorNo) {

        Inspector inspector = null;
        inspector=inspectorMapper.selectByPrimaryKey(inspectorNo);
        return inspector;

    }

    @Override
    public void addInspector(Inspector inspector) {

        inspectorMapper.insert(inspector);

    }

    @Override
    public List<Inspector> loadAll() {

        return inspectorMapper.selectAll();

    }

    @Override
    public void removeInspector(Integer inspectorId) {

        inspectorMapper.deleteByPrimaryKey(inspectorId);

    }

    @Override
    public void updateInspector(Inspector inspector) {

        inspectorMapper.updateByPrimaryKey(inspector);

    }

    @Override
    public Inspector getInspectorById(Integer inspectorId) {

        return inspectorMapper.selectByPrimaryKey(inspectorId);

    }

}