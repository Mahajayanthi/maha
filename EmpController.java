package com.spirngboot.exe.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.spirngboot.exe.entity.EmpEntity;
import com.spirngboot.exe.service.EmpService;

@RestController
@RequestMapping("/employee")
public class EmpController {

	@Autowired
	EmpService service;

	@PostMapping("/save")
	public EmpEntity saveEmp(@RequestBody EmpEntity emp) {

		return service.saveEmp(emp);
	}

    @GetMapping("/getall")
    public List<EmpEntity> getAllEmployees(){

        List<EmpEntity> empList = service.getAllEmployees();
        return empList;

    }

    @RequestMapping(value = "/get/{empId}", method = RequestMethod.GET)
    public EmpEntity geEmpById(@PathVariable Long empId){
        EmpEntity e = service.getEmpById(empId);
        return e;
    }

    @RequestMapping(value = "/getbyname/{empName}", method = RequestMethod.GET)
    public List<EmpEntity> geEmpByName(@PathVariable String  empName){
        List<EmpEntity> empList = service.getEmpByName(empName);
        return empList;
    }

    @PutMapping("/update")
    public EmpEntity updateEmp(@RequestBody EmpEntity emp){
        EmpEntity updatedEmp = service.updateEmpEntity(emp);
        return updatedEmp;

    }
  
    @DeleteMapping("/delete/{empId}")
    public List<EmpEntity> deleteEmp(@PathVariable Long empId){
        List<EmpEntity> empList = service.deleteEmpEntity(empId);
        return empList;
    }
    @GetMapping("/getsal")
    public List<EmpEntity>getsal()
    {
    	
    	return service.getsal();
    }
    @GetMapping("/getname")
    public List<EmpEntity>getname()
    {
    	return service.getname();
    }
    @GetMapping("/getId")
    public List<EmpEntity>getId()
    {
    	return service.getId();
    }

}



