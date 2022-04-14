package com.rachein.demo.entity.DB;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @author 计算机系 ITAEM 吴远健
 * @date 2022/3/14 8:43
 */
@Data
@TableName("t_trans_record")
public class Position {

    @TableId(type = IdType.AUTO)
    private Integer id;
    @TableField("trans_id")
    private String tid;
    private BigDecimal longitude;
    private BigDecimal latitude;
    @TableField("point_datetime")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date pointTime;

}
