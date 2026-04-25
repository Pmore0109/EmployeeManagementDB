package com.example.demo.Service;

import com.example.demo.Entity.Employee;

public interface EMployeeService {
	void saveemployee(Employee e);
	void DeleteEmployee(int id );
	Employee getEMployee(int id);
	

}
