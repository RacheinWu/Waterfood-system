package com.rachein.demo.entity.DB;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @author 计算机系 ITAEM 吴远健
 * @date 2022/3/14 8:38
 */
@Data
@TableName("t_sensor_information")
public class SensorsData {

    @TableId(type = IdType.AUTO)
    private Long id;
    //溶解氧
    @TableField("d01")
    private BigDecimal DO1;
    @TableField("d02")
    private BigDecimal DO2;
    @TableField("d03")
    private BigDecimal DO3;
    //氨氮
    @TableField("an1")
    private BigDecimal AN1;
    @TableField("an2")
    private BigDecimal AN2;
    @TableField("an3")
    private BigDecimal AN3;
    //温度
    @TableField("temp1")
    private BigDecimal TEMP1;
    @TableField("temp2")
    private BigDecimal TEMP2;
    @TableField("temp3")
    private BigDecimal TEMP3;
    //运输车次ID
    @TableField("vehicle_id")
    private String vehicleId;
    @TableField("trans_id")
    private String transId;

    @TableField("update_time")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date updateTime;

    @TableField("life_status")
    private String lifeStatus;

}
