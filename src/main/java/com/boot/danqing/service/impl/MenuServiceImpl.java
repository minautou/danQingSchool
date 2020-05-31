package com.boot.danqing.service.impl;

import com.alibaba.fastjson.JSON;
import com.boot.danqing.dao.MenuMapper;
import com.boot.danqing.entity.Menu;
import com.boot.danqing.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MenuServiceImpl implements MenuService {


    @Autowired
    private MenuMapper menuMapper;

    @Override
    public List<Menu> getAllMenu() throws Exception {
        List<Menu> menus = menuMapper.getAllMenu();
        List<Menu> menusContainChild = convertContainChild(menus);
        return menusContainChild;
    }

    // 菜单层级调整
    private List<Menu> convertContainChild(List<Menu> menus) {
        List<Menu> rsMenu = new ArrayList<>();
        if (menus != null) {
            // 首先添加一级菜单
            for (Menu menuItem : menus) {
                if (menuItem.getParentmenuid().equals("0")) {
                    rsMenu.add(menuItem);
                }
            }
            // 添加二级菜单在第一级菜单下
            for (Menu menuItem : menus) {
                for (Menu menuItemChild : rsMenu) {
                    if (menuItem.getParentmenuid().equals(menuItemChild.getMenuid())) {
                        if (menuItemChild.getMenuList() == null) {
                            menuItemChild.setMenuList(new ArrayList<>());
                            menuItemChild.getMenuList().add(menuItem);
                        } else {
                            menuItemChild.getMenuList().add(menuItem);
                        }
                    }
                }
            }
        }
        return rsMenu;
    }


}
