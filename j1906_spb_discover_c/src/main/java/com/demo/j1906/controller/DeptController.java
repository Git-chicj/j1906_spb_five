package com.demo.j1906.controller;

import com.demo.j1906.pojo.Dept;
import com.demo.j1906.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * Created by 马云虎 on 2019/11/14 0014.
 */
@Controller
public class DeptController {

    @Autowired
    private DeptService deptService;

    @RequestMapping(value = "dept",method = RequestMethod.GET)
    public String findAll(Model model){
        List<Dept> all = deptService.findAll();
        model.addAttribute("findAll",all);
        return "dept";
    }
}
