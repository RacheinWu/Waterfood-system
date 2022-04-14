package com.rachein.demo.main.controller;

import com.rachein.demo.entity.RO.LogisticsAddRo;
import com.rachein.demo.entity.RO.LogisticsUpdateRo;
import com.rachein.demo.entity.VO.LogisticsInfoVo;
import com.rachein.demo.entity.VO.ResultVo;
import com.rachein.demo.main.service.LogisticsService;
import com.rachein.demo.main.service.ProductService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author 计算机系 ITAEM 吴远健
 * @Description
 * @date 2022/4/14 11:34
 */
@Api(tags = "物流管理")
@RestController
@RequestMapping("logistics")
public class LogisticsManagerController {

    @Autowired
    LogisticsService logisticsService;

    @Autowired
    ProductService productService;

    @ApiOperation("添加")
    @PostMapping("/add")
    public void create(@RequestBody LogisticsAddRo logisticsAddRo) {
        logisticsService.addLogisticsProduct(logisticsAddRo);
    }

    @ApiOperation("查询")
    @GetMapping("/{tid}")
    public ResultVo<LogisticsInfoVo> read(@PathVariable String tid) {
        return ResultVo.success(logisticsService.getLogistics(tid));
    }

    @ApiOperation("修改")
    @PostMapping("/update/{tid}")
    public void update(@RequestBody LogisticsUpdateRo logisticsUpdateRo, @PathVariable String tid) {
        logisticsService.updateLogistics(logisticsUpdateRo, tid);
    }

    @ApiOperation("删除")
    @GetMapping("/delete/{tid}")
    public void delete(@PathVariable String tid) {
        logisticsService.removeLogistics(tid);
    }

}
