package com.rachein.demo.main.service.impl;

import com.rachein.demo.entity.RO.ProductAddRO;
import com.rachein.demo.entity.RO.ProductUpdateRo;
import com.rachein.demo.entity.VO.ProductInfoVo;
import com.rachein.demo.exception.CodeMsg;
import com.rachein.demo.exception.GlobalException;
import com.rachein.demo.main.mapper.ProductMapper;
import com.rachein.demo.main.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;

/**
 * @author 计算机系 ITAEM 吴远健
 * @Description
 * @date 2022/4/14 14:23
 */
@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    ProductMapper productMapper;

    @Override
    public void addProduct(ProductAddRO productAddRO) {

    }

    @Override
    public void removeProduct(String id) {

    }

    @Override
    public ProductInfoVo readProductInfo(String id) {
        ProductInfoVo productInfoVo;
        productInfoVo = productMapper.getProductInfo(id);
        //如果没有结果
        if (Objects.isNull(productInfoVo))
            throw new GlobalException(CodeMsg.QUERY_NOT_RESULT);
        return productInfoVo;
    }

    @Override
    public void listProductInfo() {

    }


    @Override
    public void updateProductInfo(ProductUpdateRo productUpdateRo) {

    }
}
