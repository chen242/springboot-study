package com.jd.admin.controller;

import com.jd.admin.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpSession;

@Controller
public class LoginController {

    @GetMapping({"/","/login"})
    public String login(){

        return "login";
    }


    @PostMapping("login")
    public String index(User user, HttpSession session, Model model) {
        if (StringUtils.hasText(user.getUsername()) && "123456".equals(user.getPassword())){
            session.setAttribute("loginUser",user);
            return "redirect:/index.html";
        }
        else {
            model.addAttribute("msg","登录失败");
            return "login";
        }

    }

    @GetMapping("index.html")
    public String ToIndex(HttpSession session,Model model){
        if (session.getAttribute("loginUser")!=null){
            model.addAttribute("msg","wuhuwerwrwe");
            return "index_alt";
        }
        else {
            model.addAttribute("msg","还未登录");
            return "login";
        }
    }

}
