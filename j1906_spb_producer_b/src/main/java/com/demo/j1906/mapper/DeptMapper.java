package com.demo.j1906.mapper;

import com.demo.j1906.pojo.Dept;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created by 马云虎 on 2019/11/14 0014.
 */
@Mapper
public interface DeptMapper {

    public List<Dept> findAll();
}
