package com.geek.cloud.humanresources.service;

import com.geek.cloud.humanresources.entity.Employee;
import com.geek.cloud.humanresources.entity.EntitySet;
import com.geek.cloud.humanresources.repository.HumanResourceRepository;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;


import java.util.List;


@RestController
@RequestMapping(value = "/rest")
public class HumanResourceController {


    @Autowired
    HumanResourceRepository humanResourceRepository;


    @RequestMapping(value="/employee")
    public List<Employee> getEmployees(){
            return humanResourceRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.POST,value = "/employees")
    public List<Employee> saveEmployee(@RequestBody final Employee e){
        humanResourceRepository.save(e);
        return humanResourceRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.POST,value = "/entitySet")
    public EntitySet getEntity(@RequestBody final EntitySet e){

        return  e;
    }

}
