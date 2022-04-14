package com.rachein.demo.entity.DB;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @author 计算机系 ITAEM 吴远健
 * @date 2022/3/13 12:01
 */
@Data
public class Sensor {

    private Integer id;
    private String type;
    private BigDecimal value;

}
