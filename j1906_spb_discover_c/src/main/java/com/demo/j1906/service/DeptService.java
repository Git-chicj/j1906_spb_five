package com.demo.j1906.service;

import com.demo.j1906.pojo.Dept;
import com.netflix.ribbon.proxy.annotation.Hystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * Created by 马云虎 on 2019/11/14 0014.
 */

@FeignClient(value = "service-producer-b",fallback = DeptServiceError.class)
public interface DeptService {
    @RequestMapping(value = "depts",method = RequestMethod.GET)
    public List<Dept> findAll();
}
