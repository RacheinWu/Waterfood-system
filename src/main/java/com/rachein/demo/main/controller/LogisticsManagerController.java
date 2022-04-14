package com.rachein.demo.main.controller;

import com.rachein.demo.entity.RO.LogisticsAddRo;
import com.rachein.demo.entity.RO.LogisticsUpdateRo;
import com.rachein.demo.main.service.LogisticsService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author 计算机系 ITAEM 吴远健
 * @Description
 * @date 2022/4/14 11:34
 */
@Api("物流管理")
@RestController
@RequestMapping("logistics")
public class LogisticsManagerController {

    @Autowired
    LogisticsService logisticsService;

    @ApiOperation("添加")
    @PostMapping("/add")
    public void create(@RequestBody LogisticsAddRo logisticsAddRo) {
        logisticsService.add(logisticsAddRo);
    }

    @ApiOperation("查询")
    @GetMapping("/{tid}")
    public void read(@PathVariable String tid) {
        logisticsService.read(tid);
    }

    @ApiOperation("修改")
    @PostMapping("/update/")
    public void update(@RequestBody LogisticsUpdateRo logisticsUpdateRo) {
        logisticsService.update(logisticsUpdateRo);
    }

    @ApiOperation("删除")
    @GetMapping("/delete/{tid}")
    public void delete(@PathVariable String tid) {
        logisticsService.delete(tid);
    }

}
