package com.rachein.demo.entity.VO;

import lombok.Data;

import java.util.Date;

/**
 * @author 计算机系 ITAEM 吴远健
 * @Description
 * @date 2022/4/14 14:28
 */
@Data
public class ProductInfoVo {

    private String name;
    private String weight;
    private String originPlace;
    private Date leaveWaterDateTime;
    private Date arriveTime;
    private String specification;
    private String tid;
}
