package com.student.manage;

public class Student {
	private int studentId;
	private String studentName;
	private String studentCity;
	private String studentCountry;
	private String studentPincode;
	
	public Student(int studentId, String studentName, String studentCity, String studentCountry,
			String studentPincode) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentCity = studentCity;
		this.studentCountry = studentCountry;
		this.studentPincode = studentPincode;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentCity() {
		return studentCity;
	}
	public void setStudentCity(String studentCity) {
		this.studentCity = studentCity;
	}
	public String getStudentCountry() {
		return studentCountry;
	}
	public void setStudentCountry(String studentCountry) {
		this.studentCountry = studentCountry;
	}
	public String getStudentPincode() {
		return studentPincode;
	}
	public void setStudentPincode(String studentPincode) {
		this.studentPincode = studentPincode;
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentCity=" + studentCity
				+ ", studentCountry=" + studentCountry + ", studentPincode=" + studentPincode + "]";
	}	
}
