package com.rachein.demo.entity.DB;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @author 计算机系 ITAEM 吴远健
 * @date 2022/3/1 8:46
 */
@Data
@TableName("t_product")
public class Product {

    @TableId(type = IdType.AUTO)
    private Integer id;

    private String name;
    private BigDecimal weight;

    @TableField("origin_place")
    private String originPlace;//产地

    private String specification;//规格

    @TableField("leave_water_time")
    private Date leaveWaterDatetime;

    @TableField("qr_number")
    private String qrNumber;

    @TableField("departure_datetime")
    private Date departureDatetime;


    @TableField("status_id")
    private int statusId;

    @TableField("arrive_time")
    private Date arriveTime;

    @TableField("trans_id")
    private String transId;

}
