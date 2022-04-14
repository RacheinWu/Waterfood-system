package com.rachein.demo.main.service;

import com.rachein.demo.entity.RO.LogisticsAddRo;
import com.rachein.demo.entity.RO.LogisticsUpdateRo;

/**
 * @author 计算机系 ITAEM 吴远健
 * @Description
 * @date 2022/4/14 11:39
 */
public interface LogisticsService {
    void add(LogisticsAddRo logisticsAddRo);

    void read(String tid);

    void update(LogisticsUpdateRo logisticsUpdateRo);

    void delete(String tid);


}
