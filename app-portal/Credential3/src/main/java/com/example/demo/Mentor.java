package com.example.demo;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "mentor")
public class Mentor extends AuditModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long mentorId;
	@Column(name = "user_name")
	private String userName = "";
	@Column(name = "password")
	private String password;
	@Column(name = "first_name")
	private String firstName="";
	@Column(name = "last_name")
	private String lastName = "";
	@Column(name = "contact_number")
	private Long contactNumber;
	@Column(name = "reg_code")
	private String regCode;
	@Column(name = "role")
	private String role;
	@Column(name = "linkedin_url")
	private String linkedinUrl;
	@Column(name = "years_of_experience")
	private Float yearsOfExperience;
	@Column(name = "active")
	private Boolean active = false;
	@Column(name = "confirmed_signup")
	private Boolean confirmedSignUp = false;
	@Column(name = "reset_password_date")
	private Date resetPasswordDate;
	@Column(name = "time_zone")
	private String timeZone;
	@Column(name="work_time")
	private String workTime;
	@Column(name = "rating")
	private Float rating;
	public Mentor(String userName, String password, String firstName, String lastName, Long contactNumber,
			String regCode, String role, String linkedinUrl, Float yearsOfExperience, Boolean active,
			Boolean confirmedSignUp, Date resetPasswordDate, String timeZone, String workTime, Float rating,
			Boolean resetPassword) {
		super();
		this.userName = userName;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		this.contactNumber = contactNumber;
		this.regCode = regCode;
		this.role = role;
		this.linkedinUrl = linkedinUrl;
		this.yearsOfExperience = yearsOfExperience;
		this.active = active;
		this.confirmedSignUp = confirmedSignUp;
		this.resetPasswordDate = resetPasswordDate;
		this.timeZone = timeZone;
		this.workTime = workTime;
		this.rating = rating;
		this.resetPassword = resetPassword;
	}
	public String getTimeZone() {
		return timeZone;
	}
	public void setTimeZone(String timeZone) {
		this.timeZone = timeZone;
	}
	public String getWorkTime() {
		return workTime;
	}
	public void setWorkTime(String workTime) {
		this.workTime = workTime;
	}
	public Float getRating() {
		return rating;
	}
	public void setRating(Float rating) {
		this.rating = rating;
	}
	public Mentor(String userName, String password, String firstName, String lastName, Long contactNumber,
			String regCode, String role, String linkedinUrl, Float yearsOfExperience, Boolean active,
			Boolean confirmedSignUp, Date resetPasswordDate, Boolean resetPassword) {
		super();
		this.userName = userName;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		this.contactNumber = contactNumber;
		this.regCode = regCode;
		this.role = role;
		this.linkedinUrl = linkedinUrl;
		this.yearsOfExperience = yearsOfExperience;
		this.active = active;
		this.confirmedSignUp = confirmedSignUp;
		this.resetPasswordDate = resetPasswordDate;
		this.resetPassword = resetPassword;
	}
	public Mentor() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Mentor(Long mentorId, String userName, String password, String firstName, String lastName,
			Long contactNumber, String regCode, String role, String linkedinUrl, Float yearsOfExperience,
			Boolean active, Boolean confirmedSignUp, Date resetPasswordDate, Boolean resetPassword) {
		super();
		this.mentorId = mentorId;
		this.userName = userName;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		this.contactNumber = contactNumber;
		this.regCode = regCode;
		this.role = role;
		this.linkedinUrl = linkedinUrl;
		this.yearsOfExperience = yearsOfExperience;
		this.active = active;
		this.confirmedSignUp = confirmedSignUp;
		this.resetPasswordDate = resetPasswordDate;
		this.resetPassword = resetPassword;
	}
//	@Override
//	public String toString() {
//		return "Mentor [mentorId=" + mentorId + ", userName=" + userName + ", password=" + password + ", firstName="
//				+ firstName + ", lastName=" + lastName + ", contactNumber=" + contactNumber + ", regCode=" + regCode
//				+ ", role=" + role + ", linkedinUrl=" + linkedinUrl + ", yearsOfExperience=" + yearsOfExperience
//				+ ", active=" + active + ", confirmedSignUp=" + confirmedSignUp + ", resetPasswordDate="
//				+ resetPasswordDate + ", timeZone=" + timeZone + ", workTime=" + workTime + ", rating=" + rating
//				+ ", resetPassword=" + resetPassword + "]";
//	}
	public Long getMentorId() {
		return mentorId;
	}
	public void setMentorId(Long mentorId) {
		this.mentorId = mentorId;
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
	public Float getYearsOfExperience() {
		return yearsOfExperience;
	}
	public void setYearsOfExperience(Float yearsOfExperience) {
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
	public Date getResetPasswordDate() {
		return resetPasswordDate;
	}
	public void setResetPasswordDate(Date resetPasswordDate) {
		this.resetPasswordDate = resetPasswordDate;
	}
	public Boolean getResetPassword() {
		return resetPassword;
	}
	public void setResetPassword(Boolean resetPassword) {
		this.resetPassword = resetPassword;
	}
	@Column(name = "reset_password")
	private Boolean resetPassword;
}
