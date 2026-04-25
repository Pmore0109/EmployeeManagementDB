package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Employee;
import com.example.demo.Repository.EmployeeRepository;

@Service
public class EMployeeServiceIMPL implements EMployeeService {

	@Autowired
	EmployeeRepository Repository;
	
	@Override
	public void saveemployee(Employee e) {
		// TODO Auto-generated method stub
		Repository.save(e);
	}

	@Override
	public void DeleteEmployee(int id) {
		// TODO Auto-generated method stub
		Repository.deleteById(id);
	}

	@Override
	public Employee getEMployee(int id) {
		// TODO Auto-generated method stub
		return Repository.findById(id).get();
	}

}
