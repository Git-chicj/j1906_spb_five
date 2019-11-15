package com.demo.j1906.service;

import com.demo.j1906.pojo.Dept;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by 马云虎 on 2019/11/14 0014.
 */
@Component
@Slf4j
public class DeptServiceError implements DeptService{

    @Override
    public List<Dept> findAll() {
        log.info("=========================");
        return null;
    }
}
