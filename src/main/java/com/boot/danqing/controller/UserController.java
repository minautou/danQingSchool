package com.boot.danqing.controller;

import com.boot.danqing.entity.Menu;
import com.boot.danqing.entity.User;
import com.boot.danqing.entity.pojo.dataObject;
import com.boot.danqing.service.MenuService;
import com.boot.danqing.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.LinkedList;
import java.util.List;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private MenuService menuService;

    private final static String SUCCESS = "success";

    private final static String FAILURE = "failure";

    @ResponseBody
    @GetMapping(value="user")
    public dataObject getAlluser(Model model){
        dataObject data = new dataObject();
        List<User> userList = new LinkedList<>();
        try {
            userList = userService.getAlluser();
        }catch (Exception e){
            System.out.println(e);
        }
        //model.addAttribute("userList", userList);
        //return "/thymeleaf/index";
        data.setCode("0");
        data.setCount(1000);
        data.setData(userList);
        data.setMsg("");
        return data;
    }

    @RequestMapping(value="home", method={RequestMethod.POST} )
    public String home(HttpServletRequest request, Model model){
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        List<User> userList = new LinkedList<>();
        try {
            userList = userService.getAlluser();
            boolean isUser = false;
            for (User user : userList) {
                if (user.getUsername().equals(username) &&
                        user.getPassword().equals(password) ) {
                    isUser = true;
                    model.addAttribute("status", SUCCESS);
                    model.addAttribute("nickname", user.getNickname());
                    break;
                }
            }
            if (!isUser) {
                model.addAttribute("status", FAILURE);
                model.addAttribute("msg", "账号或密码错误！");
                return "thymeleaf/login";
            }
        }catch (Exception e){
            System.out.println(e);
        }
        try {
            List<Menu> menus = menuService.getAllMenu();
            model.addAttribute("menu", menus);
        }catch (Exception e){
            System.out.println(e);
        }
        model.addAttribute("userList", userList);
        return "thymeleaf/home";
    }

    @GetMapping(value="login")
    public String login(Model model){
        model.addAttribute("PROJNAME", "丹青学院");
        model.addAttribute("versionNo", "v0.0.1.2019");
        model.addAttribute("msg", "");
        return "/thymeleaf/login";
    }


}
