package edu.mum.dto;

import java.util.Date;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


import org.hibernate.annotations.Type;

@Entity 
@Table(name="USER_DETAIL")
public class UserDetails {
	@Id
	@Column (name="USER_ID")
	@GeneratedValue (strategy=GenerationType.AUTO)
	private int userId;
	
	@Column (name="USER_NAME")
	private String userName;
	
	@Embedded
	@AttributeOverrides({
		@AttributeOverride(name="street", column=@Column(name="HOME_STREET")),
		@AttributeOverride(name="city", column=@Column(name="HOME_CITY")),
		@AttributeOverride(name="state", column=@Column(name="HOME_STATE")),
		@AttributeOverride(name="zipcode", column=@Column(name="HOME_ZIPCODE"))
	})
	private Address homeAddress;	
	
	@Embedded
	@AttributeOverrides({
		@AttributeOverride(name="street", column=@Column(name="OFFICE_STREET")),
		@AttributeOverride(name="city", column=@Column(name="OFFICE_CITY")),
		@AttributeOverride(name="state", column=@Column(name="OFFICE_STATE")),
		@AttributeOverride(name="zipcode", column=@Column(name="OFFICE_ZIPCODE"))
	})
	private Address officeAddress;
	@Temporal (TemporalType.DATE)
	private Date joinedDate;
	private String description;
	
	@Type(type = "org.hibernate.type.NumericBooleanType")
	private boolean citizenship;
	
	/**
	 * @return the citizenship
	 */
	public boolean isCitizenship() {
		return citizenship;
	}
	/**
	 * @param citizenship the citizenship to set
	 */
	public void setCitizenship(boolean citizenship) {
		this.citizenship = citizenship;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * @return the joinedDate
	 */
	public Date getJoinedDate() {
		return joinedDate;
	}
	/**
	 * @return the homeAddress
	 */
	public Address getHomeAddress() {
		return homeAddress;
	}
	/**
	 * @param homeAddress the homeAddress to set
	 */
	public void setHomeAddress(Address homeAddress) {
		this.homeAddress = homeAddress;
	}
	/**
	 * @return the officeAddress
	 */
	public Address getOfficeAddress() {
		return officeAddress;
	}
	/**
	 * @param officeAddress the officeAddress to set
	 */
	public void setOfficeAddress(Address officeAddress) {
		this.officeAddress = officeAddress;
	}
	/**
	 * @param joinedDate the joinedDate to set
	 */
	public void setJoinedDate(Date joinedDate) {
		this.joinedDate = joinedDate;
	}
	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	
	
	
	
}
