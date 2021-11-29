package com.spirngboot.exe.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class EmpEntity {
		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		private Long empId;
		private String empName;
		private long salary;
		
		public EmpEntity() {
			super();
		}
		public EmpEntity(Long empId, String empName, long salary) {
			super();
			this.empId = empId;
			this.empName = empName;
			this.salary = salary;
		}
		public Long getEmpId() {
			return empId;
		}
		public void setEmpId(Long empId) {
			this.empId = empId;
		}
		public String getEmpName() {
			return empName;
		}
		public void setEmpName(String empName) {
			this.empName = empName;
		}
		public long getSalary() {
			return salary;
		}
		public void setSalary(int salary) {
			this.salary = salary;
		}
		
}
