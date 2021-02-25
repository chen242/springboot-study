package com.jd.admin.controller;


import org.springframework.stereotype.Controller;
        import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TableController {

    @GetMapping("/basic_table")
    public String GetTable(){
        return "basic_table";
    }
}
