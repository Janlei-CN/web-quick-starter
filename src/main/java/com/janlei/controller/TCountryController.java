package com.janlei.controller;

import com.janlei.entity.TCountry;
import com.janlei.service.TCountryService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (TCountry)表控制层
 *
 * @author Janlei
 * @since 2020-05-09 11:45:28
 */
@RestController
@RequestMapping("tCountry")
public class TCountryController {
    /**
     * 服务对象
     */
    @Resource
    private TCountryService tCountryService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public TCountry selectOne(Integer id) {
        return this.tCountryService.queryById(id);
    }

}