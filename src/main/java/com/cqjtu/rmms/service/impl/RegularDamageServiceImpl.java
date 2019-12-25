package com.cqjtu.rmms.service.impl;

import com.cqjtu.rmms.entity.RegularDamage;
import com.cqjtu.rmms.mapper.RegularDamageMapper;
import com.cqjtu.rmms.service.RegularDamageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;


@Service
@Transactional(rollbackFor = Exception.class)
public class RegularDamageServiceImpl implements RegularDamageService {

    @Autowired
    private RegularDamageMapper regularDamageMapper ;

    @Override
    public RegularDamage get(String regularDamageNo) {

        RegularDamage regularDamage = null;
        regularDamage=regularDamageMapper.selectByPrimaryKey(regularDamageNo);
        return regularDamage;

    }

    @Override
    public void addRegularDamage(RegularDamage regularDamage) {

        regularDamageMapper.insert(regularDamage);

    }

    @Override
    public List<RegularDamage> loadAll() {

        return regularDamageMapper.selectAll();

    }

    @Override
    public void removeRegularDamage(Integer regularDamageId) {

        regularDamageMapper.deleteByPrimaryKey(regularDamageId);

    }

    @Override
    public void updateRegularDamage(RegularDamage regularDamage) {

        regularDamageMapper.updateByPrimaryKey(regularDamage);

    }

    @Override
    public RegularDamage getRegularDamageById(Integer regularDamageId) {

        return regularDamageMapper.selectByPrimaryKey(regularDamageId);

    }

    @Override
    public List<RegularDamage> loadDistinct() {

        Set<RegularDamage> regularDamageSet=new TreeSet<>(Comparator.comparing(RegularDamage::getRoad_name));
        regularDamageSet.addAll(regularDamageMapper.selectAll());
        return new ArrayList<>(regularDamageSet);

    }

    @Override
    public List<RegularDamage> select(RegularDamage regularDamage){

        return regularDamageMapper.select(regularDamage);

    }

}