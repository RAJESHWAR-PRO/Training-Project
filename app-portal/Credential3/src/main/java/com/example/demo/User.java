package com.example.demo;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.validation.constraints.Positive;

import org.hibernate.annotations.UpdateTimestamp;

@Entity
@Table(name = "user")
public class User extends AuditModel {
 	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "user_name")
	private String userName;
	
	@Column(name = "password")
	private String password;
	
	@Column(name = "first_name")
	private String firstName;
	
	@Column(name = "last_name")
	private String lastName;
	
//	@Positive(message = "Contact Number should be positive value")
	@Column(name = "contact_number")
	private Long contactNumber;
	
	@Column(name = "reg_code")
	private String regCode = "";
	
	@Column(name = "role")
	private String role = null;
	
	@Column(name = "linkedin_url")
	private String linkedinUrl = null;
	
	@Column(name = "years_of_experience")
	private String yearsOfExperience;
	
	@Column(name = "active")
	private Boolean active = false;
	
	@Column(name = "confirmed_signup")
	private Boolean confirmedSignUp = false;
	
	@Column(name = "reset_password")
	private Boolean resetPassword = false;
	
	@UpdateTimestamp
	@Column(name = "reset_password_date")
	private Date resetPasswordDate;
	
//	@ManyToMany(fetch = FetchType.LAZY, mappedBy = "users")
//	List<Trainings> trainings;
	
	
//	
//	public List<Trainings> getTrainings() {
//		return trainings;
//	}
//
//	public void setTrainings(List<Trainings> trainings) {
//		this.trainings = trainings;
//	}

	public Boolean getResetPassword() {
		return resetPassword;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Long getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(Long contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getRegCode() {
		return regCode;
	}

	public void setRegCode(String regCode) {
		this.regCode = regCode;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getLinkedinUrl() {
		return linkedinUrl;
	}

	public void setLinkedinUrl(String linkedinUrl) {
		this.linkedinUrl = linkedinUrl;
	}

	public String getYearsOfExperience() {
		return yearsOfExperience;
	}

	public void setYearsOfExperience(String yearsOfExperience) {
		this.yearsOfExperience = yearsOfExperience;
	}

	public Boolean getActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

	public Boolean getConfirmedSignUp() {
		return confirmedSignUp;
	}

	public void setConfirmedSignUp(Boolean confirmedSignUp) {
		this.confirmedSignUp = confirmedSignUp;
	}

	public Boolean getRestPassword() {
		return resetPassword;
	}

	public void setResetPassword(Boolean resetPassword) {
		this.resetPassword = resetPassword;
	}

	public Date getResetPasswordDate() {
		return resetPasswordDate;
	}
	
	public void setResetPasswordDate(Date resetPasswordDate) {
		this.resetPasswordDate = resetPasswordDate;
	}
	
}
