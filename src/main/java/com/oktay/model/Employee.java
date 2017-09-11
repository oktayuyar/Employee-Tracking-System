package com.oktay.model;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.TableGenerator;

import com.oktay.model.EmployeeLeave;

/**
 * oktay
 */
@Entity
public class Employee {
	@TableGenerator(name = "EMP_GEN", allocationSize = 1)
	@Id
	@GeneratedValue(generator = "EMP_GEN")
	private int id;

	private String name;
	private String surname;
	private String employeeNo;
    private Integer anualLeaveDay;
	private String phone;
	private String e_mail;
	private String adress;

	
	@OneToMany(mappedBy="employee" ,cascade=CascadeType.ALL,fetch=FetchType.EAGER)
	private Collection<EmployeeLeave>  empLeave =new ArrayList<EmployeeLeave>();

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getEmployeeNo() {
		return employeeNo;
	}

	public void setEmployeeNo(String employeeNo) {
		this.employeeNo = employeeNo;
	}

	public Integer getAnualLeaveDay() {
		return anualLeaveDay;
	}

	public void setAnualLeaveDay(Integer anualLeaveDay) {
		this.anualLeaveDay = anualLeaveDay;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}


	public String getE_mail() {
		return e_mail;
	}

	public void setE_mail(String e_mail) {
		this.e_mail = e_mail;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public Collection<EmployeeLeave> getEmpLeave() {
		return empLeave;
	}

	public void setEmpLeave(Collection<EmployeeLeave> empLeave) {
		this.empLeave = empLeave;
	}

}
