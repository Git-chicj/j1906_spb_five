package com.demo.j1906.controller;

import com.demo.j1906.pojo.Dept;
import com.demo.j1906.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by 马云虎 on 2019/11/14 0014.
 */
@RestController
public class DeptController {

    @Autowired
    private DeptService deptService;

    //查询所有
    @RequestMapping(value = "depts",method = RequestMethod.GET)
    public List<Dept> findAll(){
        List<Dept> all = deptService.findAll();
        return all;
    }
}
