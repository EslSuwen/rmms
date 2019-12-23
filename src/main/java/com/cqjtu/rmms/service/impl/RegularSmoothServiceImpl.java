package com.cqjtu.rmms.service.impl;

import com.cqjtu.rmms.entity.RegularSmooth;
import com.cqjtu.rmms.mapper.RegularSmoothMapper;
import com.cqjtu.rmms.service.RegularSmoothService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
@Transactional(rollbackFor = Exception.class)
public class RegularSmoothServiceImpl implements RegularSmoothService {

    @Autowired
    private RegularSmoothMapper regularSmoothMapper ;

    @Override
    public RegularSmooth get(String regularSmoothNo) {

        RegularSmooth regularSmooth = null;
        regularSmooth=regularSmoothMapper.selectByPrimaryKey(regularSmoothNo);
        return regularSmooth;

    }

    @Override
    public void addRegularSmooth(RegularSmooth regularSmooth) {

        regularSmoothMapper.insert(regularSmooth);

    }

    @Override
    public List<RegularSmooth> loadAll() {

        return regularSmoothMapper.selectAll();

    }

    @Override
    public void removeRegularSmooth(Integer regularSmoothId) {

        regularSmoothMapper.deleteByPrimaryKey(regularSmoothId);

    }

    @Override
    public void updateRegularSmooth(RegularSmooth regularSmooth) {

        regularSmoothMapper.updateByPrimaryKey(regularSmooth);

    }

    @Override
    public RegularSmooth getRegularSmoothById(Integer regularSmoothId) {

        return regularSmoothMapper.selectByPrimaryKey(regularSmoothId);

    }

}