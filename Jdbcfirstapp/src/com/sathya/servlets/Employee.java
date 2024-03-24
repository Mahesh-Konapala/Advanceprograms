package com.sathya.servlets;

public class Employee {
	 private int empId;
	 private String empname;
	private Double empSalary;
	public Employee(int empId, String empname, int i) {
		super();
		this.empId = empId;
		this.empname = empname;
		this.empSalary = i;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empname=" + empname + ", empSalary=" + empSalary + "]";
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public Double getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(Double empSalary) {
		this.empSalary = empSalary;
	}
public Employee()
{

}
}
