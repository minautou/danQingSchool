package com.boot.danqing.dao;


import com.boot.danqing.entity.Menu;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MenuMapper {

    List<Menu> getAllMenu() throws Exception;

}
