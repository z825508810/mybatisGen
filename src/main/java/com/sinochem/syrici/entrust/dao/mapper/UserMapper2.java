package com.sinochem.syrici.entrust.dao.mapper;

import cn.demo.pojo.User;

public interface UserMapper2 {
    int deleteByPrimaryKey(Long id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}