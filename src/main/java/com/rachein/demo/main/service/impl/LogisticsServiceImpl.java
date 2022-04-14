package com.rachein.demo.main.service.impl;

import com.rachein.demo.entity.DB.Product;
import com.rachein.demo.entity.DB.Trans;
import com.rachein.demo.entity.RO.LogisticsAddRo;
import com.rachein.demo.entity.RO.LogisticsUpdateRo;
import com.rachein.demo.entity.VO.LogisticsInfoVo;
import com.rachein.demo.entity.VO.ProductVo;
import com.rachein.demo.exception.CodeMsg;
import com.rachein.demo.exception.GlobalException;
import com.rachein.demo.main.mapper.ProductMapper;
import com.rachein.demo.main.mapper.TransMapper;
import com.rachein.demo.main.service.LogisticsService;
import com.rachein.demo.main.service.ProductService;
import com.rachein.demo.utils.UUIDUtil;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;
import java.util.Objects;

/**
 * @author 计算机系 ITAEM 吴远健
 * @Description
 * @date 2022/4/14 14:38
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class LogisticsServiceImpl implements LogisticsService {

    @Autowired
    TransMapper transMapper;

    @Autowired
    ProductMapper productMapper;

    @Override
    public void addLogisticsProduct(LogisticsAddRo logisticsAddRo) {
        if (Objects.isNull(logisticsAddRo))
            throw new GlobalException(CodeMsg.BIND_ERROR);
        Trans newTrans = new Trans();
        newTrans.setProductName(logisticsAddRo.getProduct().getName());
        BeanUtils.copyProperties(logisticsAddRo, newTrans);
        //uuid:
        String tid = UUIDUtil.uuid().substring(13);
        newTrans.setId(tid);
        transMapper.insert(newTrans);
        //save product:
        List<String> listProductQR = logisticsAddRo.getProductQRCodes();
        ProductVo productVo = logisticsAddRo.getProduct();
        Date leaveWaterDateTime = logisticsAddRo.getLoadTime();
        for (String qr : listProductQR) {
            Product newProduct = new Product();
            BeanUtils.copyProperties(productVo, newProduct);
            newProduct.setLeaveWaterDatetime(leaveWaterDateTime);
            newProduct.setQrNumber(qr);
            newProduct.setTransId(tid);
            productMapper.insert(newProduct);
        }
    }

    @Override
    public LogisticsInfoVo getLogistics(String tid) {
        Trans logisticsDB;
        logisticsDB = transMapper.selectById(tid);
        if (Objects.isNull(logisticsDB))
            throw new GlobalException(CodeMsg.QUERY_NOT_RESULT);
        LogisticsInfoVo logisticsInfoVo = new LogisticsInfoVo();
        BeanUtils.copyProperties(logisticsDB, logisticsInfoVo);
        return logisticsInfoVo;
    }

    @Override
    public void updateLogistics(LogisticsUpdateRo logisticsUpdateRo) {

    }

    @Override
    public void removeLogistics(String tid) {

    }
}
