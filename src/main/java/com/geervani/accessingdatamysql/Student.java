package com.geervani.accessingdatamysql;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="stddetails")
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="stdid")
	Integer stdid;
	
	@Column(name="Name")
	private String Name;
	
	@Column(name="Grade")
	private String Grade;

	@Column(name="Gender")
	private String Gender;

	@Column(name="Phoneno")
	private Long Phoneno;

	@Column(name="Address")
	private String Address;

	public Integer getStdid() {
		return stdid;
	}

	public void setStdid(Integer stdid) {
		this.stdid = stdid;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getGrade() {
		return Grade;
	}

	public void setGrade(String grade) {
		Grade = grade;
	}

	public String getGender() {
		return Gender;
	}

	public void setGender(String gender) {
		Gender = gender;
	}

	public Long getPhoneno() {
		return Phoneno;
	}

	public void setPhoneno(Long phoneno) {
		Phoneno = phoneno;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}


	
	

}