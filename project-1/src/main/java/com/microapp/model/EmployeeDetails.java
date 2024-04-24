package com.microapp.model;

public class EmployeeDetails {
	
	private int EmployeeId;
	private String EmployeeName;
	private int EmployeeAge;
	
	public EmployeeDetails(int EmployeeId, String EmployeeName, int EmployeeAge) {
		this.EmployeeId=EmployeeId;
		this.EmployeeName=EmployeeName;
		this.EmployeeAge=EmployeeAge;
		
	}

	public void setEmployeeAge(int employeeAge) {
		EmployeeAge = employeeAge;
	}

	public int getEmployeeAge() {
		return EmployeeAge;
	}

	public void setEmployeeName(String employeeName) {
		EmployeeName = employeeName;
	}

	public String getEmployeeName() {
		return EmployeeName;
	}

	public void setEmployeeId(int employeeId) {
		EmployeeId = employeeId;
	}
	
	public int getEmployeeId() {
		return EmployeeId;
	}


}
