package com.sinochem.syrici.entrust.dao.mapper;

import com.sinochem.syrici.entrust.model.po.EntBusinessUnit;

public interface EntBusinessUnitMapper {
    int deleteByPrimaryKey(Long id);

    int insert(EntBusinessUnit record);

    int insertSelective(EntBusinessUnit record);

    EntBusinessUnit selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(EntBusinessUnit record);

    int updateByPrimaryKey(EntBusinessUnit record);
}