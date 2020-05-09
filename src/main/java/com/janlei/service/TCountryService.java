package com.janlei.service;

import com.janlei.entity.TCountry;
import java.util.List;

/**
 * (TCountry)表服务接口
 *
 * @author Janlei
 * @since 2020-05-09 11:45:27
 */
public interface TCountryService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    TCountry queryById(Integer id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<TCountry> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param tCountry 实例对象
     * @return 实例对象
     */
    TCountry insert(TCountry tCountry);

    /**
     * 修改数据
     *
     * @param tCountry 实例对象
     * @return 实例对象
     */
    TCountry update(TCountry tCountry);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}