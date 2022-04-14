package com.rachein.demo.entity.VO;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @author 计算机系 ITAEM 吴远健
 * @Description
 * @date 2022/4/14 14:42
 */
@Data
public class LogisticsInfoVo {

    private String departure;
    private String destination;
    private String driver;
    private String contact;
    private BigDecimal weight;
    private String productName;
    private Date arriveTime;
    private Date departureTime;
    private String vehicle;
    private String vehicleId;
}
