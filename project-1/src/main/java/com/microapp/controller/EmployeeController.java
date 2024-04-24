package com.microapp.controller;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microapp.model.EmployeeDetails;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	
	private ArrayList<EmployeeDetails> a = new ArrayList<EmployeeDetails>();
	
	@GetMapping("/{employeeId}")
	public ArrayList<EmployeeDetails> employeedetails(@PathVariable int employeeId) {
		
		a.add(new EmployeeDetails(1,"Ruchith",29));		
		a.add(new EmployeeDetails(2,"Raj",46));		
		a.add(new EmployeeDetails(3,"Ruchith K",53));
		
		ArrayList <EmployeeDetails> r=new ArrayList<>();
		
		for(EmployeeDetails i: a) {
			if (i.getEmployeeId()==employeeId) {
				r.add(i);
				break;
			}
		}

		return r;				
	}
}