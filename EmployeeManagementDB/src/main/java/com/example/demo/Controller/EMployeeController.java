package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Employee;
import com.example.demo.Service.EMployeeService;

@RestController
public class EMployeeController {
	
	
	@Autowired
	EMployeeService es;
	
	@PostMapping("addemployee")
	String AddEMployee(@RequestBody Employee e)
	{
		es.saveemployee(e);;
		return "saved";
	}
	
	@DeleteMapping("delete/{id}")
	String deleteEmployee(@PathVariable int id)
	{
		es.DeleteEmployee(id);
		
		return "Deleted";
	}
	
	@GetMapping("getemployee/{id}")
	Employee getemployee(@PathVariable int id)
	{
		
		return es.getEMployee(id); 
	}
	
	
	
	

}
