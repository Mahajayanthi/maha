package com.spirngboot.exe.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.spirngboot.exe.entity.EmpEntity;

public interface EmpEntityRepository extends JpaRepository<EmpEntity,Long> {

    List<EmpEntity> findByEmpNameIgnoreCase(String empName);
	@Query(value="select * from emp_entity where salary>=8000",nativeQuery=true)
	List<EmpEntity> getsal();
	@Query(value="select *from emp_entity where emp_name='maha'",nativeQuery=true)
	List<EmpEntity>getname();
	@Query(value="select*from Emp_Entity where emp_Id=8",nativeQuery=true)
	List<EmpEntity>getId();



	

	

}
