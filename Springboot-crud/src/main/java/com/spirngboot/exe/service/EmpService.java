package com.spirngboot.exe.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.spirngboot.exe.entity.EmpEntity;
import com.spirngboot.exe.repository.EmpEntityRepository;
@Service
public class EmpService {

	@Autowired
	EmpEntityRepository repo;

	public EmpEntity saveEmp(EmpEntity emp) {
		// TODO Auto-generated method stub
		return repo.save(emp);
	}
	public List<EmpEntity> getAllEmployees() {
        List<EmpEntity> empList = repo.findAll();
        return empList;
    }

    public EmpEntity getEmpById(Long empId) {
       java.util.Optional<EmpEntity> emp = repo.findById(empId);
        if(emp.isPresent())
            return emp.get();
        else
            return new EmpEntity(empId,"No Name", -100l);
    }

    public List<EmpEntity> getEmpByName(String empName) {
        List<EmpEntity> empList =  repo.findByEmpNameIgnoreCase(empName);
        return empList;
    }

    public EmpEntity updateEmpEntity(EmpEntity emp) {
        EmpEntity updatedEmp = repo.save(emp);
        return updatedEmp;
    }
    
    public List<EmpEntity> deleteEmpEntity(Long empId) {
        repo.deleteById(empId);
        List<EmpEntity> empList = repo.findAll();
        return empList;
    }
	
	public List<EmpEntity> getsal() {
		
		return repo.getsal();
	}
	public List<EmpEntity>getname()
	{
		return repo.getname();
	}
	public List<EmpEntity>getId()
	{
		return repo.getId();
	}

}
