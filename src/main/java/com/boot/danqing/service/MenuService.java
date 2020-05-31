package com.boot.danqing.service;

import com.boot.danqing.entity.Menu;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface MenuService {

    List<Menu> getAllMenu()throws Exception;

}
