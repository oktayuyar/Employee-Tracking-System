/**
 * 
 */
package com.oktay.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.TableGenerator;

/**
 * @author oktay
 *
 */

@Entity
public class EmployeeLeave {
	@TableGenerator(name = "LEA_GEN", allocationSize = 1)
	@Id
	@GeneratedValue(generator = "LEA_GEN")
	private int id;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "emp_id")
	private Employee employee;
	
    private Date startDate;
    private Date endDate;
    private Integer leaveDay;
    
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public Employee getEmployee() {
		return employee;
	}
	
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	
	public Date getStartDate() {
		return startDate;
	}
	
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	
	public Date getEndDate() {
		return endDate;
	}
	
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	
	public Integer getLeaveDay() {
		return leaveDay;
	}
	
	public void setLeaveDay(Integer leaveDay) {
		this.leaveDay = leaveDay;
	}

	@Override
	public String toString() {
		return "EmployeeLeave [id=" + id + ", employee=" + employee + ", startDate=" + startDate + ", endDate="
				+ endDate + ", leaveDay=" + leaveDay + "]";
	}
    
}
