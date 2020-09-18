package org.cts;

public class Employee extends Company{
	public void empId() {
		System.out.println("Employee Id is 1234");
	}
public void empName() {
	System.out.println("Kavitha");
}
		public static void main(String[] args) {
			Employee emp = new Employee ();
			emp.empId();
			emp.empName();
			emp.compId();
			emp.compName();			
			
		}
}
