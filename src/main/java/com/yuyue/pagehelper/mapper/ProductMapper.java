package com.yuyue.pagehelper.mapper;

import com.yuyue.pagehelper.dto.ProductDto;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Auther: 于不凡
 */
public interface ProductMapper {

    int productCount();

    List<ProductDto> porductListByPage(@Param(value = "page") int page, @Param(value = "dataNum") int dataNum);
}
