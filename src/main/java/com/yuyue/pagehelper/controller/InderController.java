package com.yuyue.pagehelper.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Auther: 于不凡
 */
@Controller
public class InderController {

    @RequestMapping(value = "/")
    public String welcome(){
        return "index";
    }

    @RequestMapping(value = "/page/{moduleName}")
    public String index(@PathVariable String moduleName){
        return moduleName;
    }

}
