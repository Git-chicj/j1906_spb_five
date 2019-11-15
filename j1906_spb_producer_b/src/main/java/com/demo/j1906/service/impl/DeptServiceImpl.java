package com.demo.j1906.service.impl;

import com.demo.j1906.mapper.DeptMapper;
import com.demo.j1906.pojo.Dept;
import com.demo.j1906.service.DeptService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by 马云虎 on 2019/11/14 0014.
 */
@Service
public class DeptServiceImpl implements DeptService {

    @Resource
    private DeptMapper deptMapper;

    //查询所有
    @Override
    public List<Dept> findAll() {
        return deptMapper.findAll();
    }
}
