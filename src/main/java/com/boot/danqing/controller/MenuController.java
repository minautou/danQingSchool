package com.boot.danqing.controller;

import com.boot.danqing.entity.Menu;
import com.boot.danqing.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller(value = "menu")
public class MenuController {

    @Autowired
    private MenuService menuService;

    @GetMapping(value="/menu")
    public String getAllMenu(Model model) throws Exception {
        List<Menu> menus = menuService.getAllMenu();
        model.addAttribute("menu", menus);
        return "thymeleaf/home";
    }

    @GetMapping(value="/pageshow")
    public String pageshow(Model model) {
        return "thymeleaf/pageshow";
    }

    @GetMapping(value="/teacherkindergarten")
    public String getAllTeacherKindergarten(Model model) throws Exception {
        List<Menu> menus = menuService.getAllMenu();
        model.addAttribute("menu", menus);
        return "thymeleaf/teacherkindergarten";
    }

}
