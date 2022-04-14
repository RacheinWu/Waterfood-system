package com.rachein.demo.main.service;

import com.rachein.demo.entity.RO.LogisticsAddRo;
import com.rachein.demo.entity.RO.LogisticsUpdateRo;
import com.rachein.demo.entity.VO.LogisticsInfoVo;

/**
 * @author 计算机系 ITAEM 吴远健
 * @Description 物流事物类
 * @date 2022/4/14 11:39
 */
public interface LogisticsService {
    void addLogisticsProduct(LogisticsAddRo logisticsAddRo);

    LogisticsInfoVo getLogistics(String tid);

    void updateLogistics(LogisticsUpdateRo logisticsUpdateRo);

    void removeLogistics(String tid);


}
