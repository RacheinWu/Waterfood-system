package com.rachein.demo.main.controller;

import com.rachein.demo.entity.RO.HubDataRo;
import com.rachein.demo.entity.VO.LogisticsInfoVo;
import com.rachein.demo.entity.VO.ProductInfoVo;
import com.rachein.demo.entity.VO.ResultVo;
import com.rachein.demo.main.service.LogisticsService;
import com.rachein.demo.main.service.ProductService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 计算机系 ITAEM 吴远健
 * @Description
 * @date 2022/4/14 14:00
 */
@Api(tags = "数据传输模块")
@RestController
@RequestMapping("data")
public class DataTransferController {

    @Autowired
    ProductService productService;

    @Autowired
    LogisticsService logisticsService;

    @ApiOperation("接收来自手机服务子系统的数据查询请求并下发")
    @GetMapping("/{qr}")
    public ResultVo<Map<String, Object>> getByQR(@PathVariable String qr) {
        Map<String, Object> map = new HashMap<>();
        ProductInfoVo productInfo = productService.readProductInfo(qr);
        System.out.println(productInfo);
        LogisticsInfoVo logisticsInfo = logisticsService.getLogistics(productInfo.getTid());
        map.put("product", productInfo);
        map.put("logistics", logisticsInfo);
        return ResultVo.success(map);
    }

    @ApiOperation("接收来自水产品冷链物流监控系统的传感器数据（溶解氧、氨氮、温度，PH值）并存储，分析处理后转发至中控子系统")
    @PostMapping("/hub")
    public void hub(@RequestBody HubDataRo hubDataRo) {

    }

}
