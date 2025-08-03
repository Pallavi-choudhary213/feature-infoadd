package com.hr.entity;

import java.time.LocalDate;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String empFirstName = "";
	private String empLastName = "";
	private String email = "";
	private String gender = "";
	private String address = "";
	private String department = "";
	private String userRole = "";
	private int experience;
	private String technology = "";
	private String shiftTimming = "";
	private LocalDate dateOfBirth;
	private LocalDate dateOfJoing;
	private int age;
	private int PfNumber;
	@Lob // For large objects
	private byte[] empImage;
	private int phnNumber;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmpFirstName() {
		return empFirstName;
	}

	public void setEmpFirstName(String empFirstName) {
		this.empFirstName = empFirstName;
	}

	public String getEmpLastName() {
		return empLastName;
	}

	public void setEmpLastName(String empLastName) {
		this.empLastName = empLastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getUserRole() {
		return userRole;
	}

	public void setUserRole(String userRole) {
		this.userRole = userRole;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	public String getTechnology() {
		return technology;
	}

	public void setTechnology(String technology) {
		this.technology = technology;
	}

	public String getShiftTimming() {
		return shiftTimming;
	}

	public void setShiftTimming(String shiftTimming) {
		this.shiftTimming = shiftTimming;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public LocalDate getDateOfJoing() {
		return dateOfJoing;
	}

	public void setDateOfJoing(LocalDate dateOfJoing) {
		this.dateOfJoing = dateOfJoing;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getPfNumber() {
		return PfNumber;
	}

	public void setPfNumber(int pfNumber) {
		PfNumber = pfNumber;
	}

	public byte[] getEmpImage() {
		return empImage;
	}

	public void setEmpImage(byte[] empImage) {
		this.empImage = empImage;
	}

	public int getPhnNumber() {
		return phnNumber;
	}

	public void setPhnNumber(int phnNumber) {
		this.phnNumber = phnNumber;
	}
}

