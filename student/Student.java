package org.student;

import org.department.Department;

//studentName(),studentDept(),studentId()
public class Student extends Department{

	public void studentName() {
		System.out.println("Lavanya");
	}
	
	public void studentDept() {
		System.out.println("Metallurgy");
	}
	
	public void studentId() {
		System.out.println("45F465");

	}
	
	public static void main(String[] args) {
		
		Student details=new Student();
		details.collegeCode();
		details.collegeName();
		details.collegeRank();
		details.studentName();
		details.studentDept();
		details.studentId();
		details.deptName();
		
	}
}


