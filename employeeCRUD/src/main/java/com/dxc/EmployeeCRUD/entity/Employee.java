package com.dxc.EmployeeCRUD.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employee")
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "eid")
	private int eid;

	@Column(name = "ename")
	private String ename;

	@Column(name = "eemail")
	private String eemail;

	@Column(name = "econtact")
	private String econtact;

	public Employee() {

	}

	public Employee(int eid, String ename, String eemail, String econtact) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.eemail = eemail;
		this.econtact = econtact;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int id) {
		this.eid = id;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getEemail() {
		return eemail;
	}

	public void setEemail(String eemail) {
		this.eemail = eemail;
	}

	public String getEcontact() {
		return econtact;
	}

	public void setEcontact(String econtact) {
		this.econtact = econtact;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", eemail=" + eemail + ", econtact=" + econtact + "]";
	}

}
