package com.yuyue.pagehelper.controller;

import com.yuyue.pagehelper.result.ResultMessage;
import com.yuyue.pagehelper.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: 于不凡
 */
@RestController
@RequestMapping(value = "/product")
public class ProductController {

    @Autowired
    private ProductService productService;


    @RequestMapping(value = "/list/{page}")
    public ResultMessage porductListByPage(@PathVariable int page){
        System.out.println("进入分分页控制器");
        return productService.porductListByPage(page);
    }
}
