package com.yuyue.pagehelper.service.impl;

import com.yuyue.pagehelper.dto.ProductDto;
import com.yuyue.pagehelper.mapper.ProductMapper;
import com.yuyue.pagehelper.result.ResultMessage;
import com.yuyue.pagehelper.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Auther: 于不凡
 */
@Service
public class ProductServiceImpl implements ProductService {

    private static final int DATA_NUM = 5;

    @Autowired
    private ProductMapper productMapper;

    @Override
    public ResultMessage porductListByPage(int page) {

        List<ProductDto> productDtoList= productMapper.porductListByPage((page-1)*DATA_NUM,DATA_NUM);
        return ResultMessage.ok(productDtoList);
    }

}
