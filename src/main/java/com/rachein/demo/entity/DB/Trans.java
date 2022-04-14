package com.rachein.demo.entity.DB;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @author 计算机系 ITAEM 吴远健
 * @date 2022/3/14 9:09
 */
@Data
@TableName("t_trans")
public class Trans {

    @TableId
    private String id;
    private String departure;
    private String destination;
    @TableField("vehicle_id")
    private String vehicleId;
    private String driver;
    private String contact;
    @TableField("sea_product_description")
    private String description;
    private BigDecimal weight;
    @TableField("departure_datetime")
    private Date departureDatetime;
    @TableField("arrive_datetime")
    private Date arriveTime;
    @TableField("product_name")
    private String productName;
    @TableField("load_time")
    private Date loadTime;
    private String vehicle;
}
