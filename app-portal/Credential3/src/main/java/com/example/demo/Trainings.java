package com.example.demo;

import java.lang.annotation.Repeatable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
public class Trainings extends AuditModel {
	private static final long serialVersionID = 1L;
	
	@Id
	@Column(name = "_id")
	private Long id;
	
	@Column(name="status")
	private String status;
	
	@Column(name = "progress")
	private Integer progress = 0;
	
	@Column(name = "fees")
	private Float fees = 0.0f;
	
	@Column(name = "commission_amount")
	private float commissionAmount = 0.0f;
	
	@Column(name = "rating")
	private Integer rating = 0;
	
	@JsonFormat(pattern = "yyyy-MM-dd")
	@Column(name = "start_date")
	private String startDate;
	
	@JsonFormat(pattern = "yyyy-MM-dd")
	@Column(name = "end_date")
	private String endDate;
	
	@JsonFormat(pattern = "HH:mm:ss")
	@Column(name = "start_time")
	private String startTime;
	
	@JsonFormat(pattern = "HH:mm:ss")
	@Column(name = "end_time")
	private String endTime;
	
	@Column(name = "amount_received")
	private Float amountReceived = 0.0f;
	
//	@Column(name = "user_id")
//	private Long userId;
//	
//	@Column(name = "mentor1_id")
//	private Long mentor_id;
//	
//	@Column(name = "skill_id")
//	private Long skillId;
	
//	@Column(name = "razorpay_payment_id")
//	private String razorpayPaymentId;
//	
	@ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "mentorId")
    private Mentor mentor;
	
	@ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "technology_id")
    private Technologies technologies;
	
//	 @OneToMany(mappedBy = "user", cascade = { CascadeType.ALL})
//	 @JoinColumn(name = "user_id")
//	    private List < User > users;
	
//	 @ManyToOne(cascade = CascadeType.ALL)
//	    @JoinColumn(name = "skill_id")
//	    private Skill skill;
	 
	 @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	 @JoinTable(name = "training_skill", joinColumns = {
			 @JoinColumn(name = "TRAINING_ID", nullable = false,updatable = false)
	 }, inverseJoinColumns = {@JoinColumn(name="SKILL_ID", nullable = false, updatable=false)})
	 private List<Skill> skills;
	 
public List<Skill> getSkills() {
		return skills;
	}

	public void setSkills(List<Skill> skills) {
		this.skills = skills;
	}

	public List<Payment> getPayment() {
		return payment;
	}

	public void setPayment(List<Payment> payment) {
		this.payment = payment;
	}

	//	 @ManyToMany(mappedBy = "payment",cascade = {CascadeType.ALL})
//	 @JoinColumn(name="razorpay_payment_id")
//	 private List<Payment> payments;
	 @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	 @JoinTable(name = "training_user", joinColumns = {
			 @JoinColumn(name = "TRAINING_ID", nullable = false, updatable = false)},
			 inverseJoinColumns = {@JoinColumn(name = "USER_ID", nullable = false, updatable = false)})
	 private List<User> users;
	 
	 @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	 @JoinTable(name = "training_payment", joinColumns = {
			 @JoinColumn(name = "TRAINING_ID", nullable = false, updatable = false)},
			 inverseJoinColumns = {@JoinColumn(name = "PAYMENT_ID", nullable = false, updatable = false)})
	 private List<Payment> payment;
	 
	public Mentor getMentor() {
		return mentor;
	}

	public void setMentor(Mentor mentor) {
		this.mentor = mentor;
	}

	public Technologies getTechnologies() {
		return technologies;
	}

	public void setTechnologies(Technologies technologies) {
		this.technologies = technologies;
	}

//	public Skill getSkill() {
//		return skill;
//	}
//
//	public void setSkill(Skill skill) {
//		this.skill = skill;
//	}

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

	public Trainings() {
		super();
		// TODO Auto-generated constructor stub
	}

//	public Trainings(Long id, String status, Integer progress, Float fees, float commissionAmount, Integer rating,
//			String startDate, String endDate, String startTime, String endTime, Float amountReceived, Long userId,
//			Long mentor_id, Long skillId, String razorpayPaymentId) {
//		super();
//		this.id = id;
//		this.status = status;
//		this.progress = progress;
//		this.fees = fees;
//		this.commissionAmount = commissionAmount;
//		this.rating = rating;
//		this.startDate = startDate;
//		this.endDate = endDate;
//		this.startTime = startTime;
//		this.endTime = endTime;
//		this.amountReceived = amountReceived;
//		this.userId = userId;
//		this.mentor_id = mentor_id;
//		this.skillId = skillId;
//		this.razorpayPaymentId = razorpayPaymentId;
//	}
//
//	@Override
//	public String toString() {
//		return "Trainings [id=" + id + ", status=" + status + ", progress=" + progress + ", fees=" + fees
//				+ ", commissionAmount=" + commissionAmount + ", rating=" + rating + ", startDate=" + startDate
//				+ ", endDate=" + endDate + ", startTime=" + startTime + ", endTime=" + endTime + ", amountReceived="
//				+ amountReceived + ", userId=" + userId + ", mentor_id=" + mentor_id + ", skillId=" + skillId
//				+ ", razorpayPaymentId=" + razorpayPaymentId + "]";
//	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Integer getProgress() {
		return progress;
	}

	public void setProgress(Integer progress) {
		this.progress = progress;
	}

	public Float getFees() {
		return fees;
	}

	public void setFees(Float fees) {
		this.fees = fees;
	}

	public float getCommissionAmount() {
		return commissionAmount;
	}

	public void setCommissionAmount(float commissionAmount) {
		this.commissionAmount = commissionAmount;
	}

	public Integer getRating() {
		return rating;
	}

	public void setRating(Integer rating) {
		this.rating = rating;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getEndTime() {
		return endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public Float getAmountReceived() {
		return amountReceived;
	}

	public void setAmountReceived(Float amountReceived) {
		this.amountReceived = amountReceived;
	}

//	public Long getUserId() {
//		return userId;
//	}
//
//	public void setUserId(Long userId) {
//		this.userId = userId;
//	}
//
//	public Long getMentor_id() {
//		return mentor_id;
//	}
//
//	public void setMentor_id(Long mentor_id) {
//		this.mentor_id = mentor_id;
//	}
//
//	public Long getSkillId() {
//		return skillId;
//	}
//
//	public void setSkillId(Long skillId) {
//		this.skillId = skillId;
//	}

//	public String getRazorpayPaymentId() {
//		return razorpayPaymentId;
//	}
//
//	public void setRazorpayPaymentId(String razorpayPaymentId) {
//		this.razorpayPaymentId = razorpayPaymentId;
//	}

	public static long getSerialversionid() {
		return serialVersionID;
	}

	
}
