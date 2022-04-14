package com.rachein.demo.main.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.rachein.demo.entity.DB.Product;
import com.rachein.demo.entity.VO.ProductInfoVo;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * @author 计算机系 ITAEM 吴远健
 * @date 2022/3/10 16:14
 */
public interface ProductMapper extends BaseMapper<Product> {

    @Select("select trans_id as tid ,name, weight, origin_place as originPlace, " +
            "leave_water_time as leaveWaterDateTime, " +
            "arrive_time as arriveTime, specification " +
            "from t_product " +
            "where qr_number = ${qr}")
    ProductInfoVo getProductInfo(@Param("qr") String qr);

}
