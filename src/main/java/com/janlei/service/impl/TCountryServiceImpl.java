package com.janlei.service.impl;

import com.janlei.entity.TCountry;
import com.janlei.dao.TCountryDao;
import com.janlei.service.TCountryService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (TCountry)表服务实现类
 *
 * @author Janlei
 * @since 2020-05-09 11:45:27
 */
@Service("tCountryService")
public class TCountryServiceImpl implements TCountryService {
    @Resource
    private TCountryDao tCountryDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public TCountry queryById(Integer id) {
        return this.tCountryDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<TCountry> queryAllByLimit(int offset, int limit) {
        return this.tCountryDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param tCountry 实例对象
     * @return 实例对象
     */
    @Override
    public TCountry insert(TCountry tCountry) {
        this.tCountryDao.insert(tCountry);
        return tCountry;
    }

    /**
     * 修改数据
     *
     * @param tCountry 实例对象
     * @return 实例对象
     */
    @Override
    public TCountry update(TCountry tCountry) {
        this.tCountryDao.update(tCountry);
        return this.queryById(tCountry.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.tCountryDao.deleteById(id) > 0;
    }
}