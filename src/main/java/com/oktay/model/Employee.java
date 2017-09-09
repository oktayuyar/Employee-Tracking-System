package com.oktay.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.TableGenerator;

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
	private String e_mail;
	private String phone;
	private String adress;
	
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
	public String getE_mail() {
		return e_mail;
	}
	public void setE_mail(String e_mail) {
		this.e_mail = e_mail;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	
	@Override
	public String toString() {
		return "employee [id=" + id + ", name=" + name + ", surname=" + surname + ", e_mail=" + e_mail + ", phone="
				+ phone + ", adress=" + adress + "]";
	}

}
