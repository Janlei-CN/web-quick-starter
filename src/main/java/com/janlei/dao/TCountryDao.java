package com.janlei.dao;

import com.janlei.entity.TCountry;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (TCountry)表数据库访问层
 *
 * @author Janlei
 * @since 2020-05-09 11:45:26
 */
public interface TCountryDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    TCountry queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<TCountry> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param tCountry 实例对象
     * @return 对象列表
     */
    List<TCountry> queryAll(TCountry tCountry);

    /**
     * 新增数据
     *
     * @param tCountry 实例对象
     * @return 影响行数
     */
    int insert(TCountry tCountry);

    /**
     * 修改数据
     *
     * @param tCountry 实例对象
     * @return 影响行数
     */
    int update(TCountry tCountry);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}