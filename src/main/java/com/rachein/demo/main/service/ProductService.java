package com.rachein.demo.main.service;

import com.rachein.demo.entity.RO.ProductAddRO;
import com.rachein.demo.entity.RO.ProductUpdateRo;
import com.rachein.demo.entity.VO.ProductInfoVo;

/**
 * @author 计算机系 ITAEM 吴远健
 * @Description 产品事物类
 * @date 2022/4/14 13:42
 */
public interface ProductService {

    void addProduct(ProductAddRO productAddRO);

    void removeProduct(String id);

    ProductInfoVo readProductInfo(String id);

    void listProductInfo();

    void updateProductInfo(ProductUpdateRo productUpdateRo);
}
