package edu.mum.dto;

import java.util.HashSet;
import java.util.Set;


import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//Comment

@Entity
@Table(name="DOCTOR_DETAILS")
public class DoctorDetails {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int doctorId;
	
	private String doctorName;
	private String speciality;
	
	@ElementCollection
	private Set<Address> chamberAddresses = new HashSet();
	
	/**
	 * @return the doctorName
	 */
	public String getDoctorName() {
		return doctorName;
	}
	/**
	 * @param doctorName the doctorName to set
	 */
	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}
	/**
	 * @return the speciality
	 */
	public String getSpeciality() {
		return speciality;
	}
	/**
	 * @param speciality the speciality to set
	 */
	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}
	/**
	 * @return the chamberAddresses
	 */
	public Set<Address> getChamberAddresses() {
		return chamberAddresses;
	}
	/**
	 * @param chamberAddresses the chamberAddresses to set
	 */
	public void setChamberAddresses(Set<Address> chamberAddresses) {
		this.chamberAddresses = chamberAddresses;
	}
	
	
	

}
