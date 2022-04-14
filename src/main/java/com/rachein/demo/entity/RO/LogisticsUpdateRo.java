package com.rachein.demo.entity.RO;

import com.rachein.demo.entity.VO.ProductVo;
import lombok.Data;

import java.util.Date;
import java.util.List;

/**
 * @author 计算机系 ITAEM 吴远健
 * @Description
 * @date 2022/4/14 11:48
 */
@Data
public class LogisticsUpdateRo {

    private String departure;
    private String destination;
    private String vehicle;//粤BWY231
    private String vehicleId;
    private String driver;
    private String contact;
    private Date departureDatetime;
    private Date loadTime;
    private String description;
    private String productName;

}
