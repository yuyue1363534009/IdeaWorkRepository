package com.yuyue.pagehelper.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * @Auther: 于不凡
 */
@Data //自动生成getset
@Accessors(chain = true) //链式编程
@NoArgsConstructor //有参构造
@AllArgsConstructor //无参构造
public class ProductDto {

    private int pid;

    private String productName;

    private String dbSource;

}
