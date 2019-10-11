package com.example.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "payment")
public class Payment extends AuditModel {
	@Id
	  @GeneratedValue(strategy = GenerationType.IDENTITY)
	  private Long id;
	
	@Column(name="txn_type")
	private String txnType;
	
	@Column(name = "amount")
	private Float amount;
	
	@Column(name = "remarks")
	private String remarks;
	
	@Column(name = "mentor_id")
	private Long mentorId;
	
	@Column(name = "mentor_name")
	private String mentorName;
	
	@Column(name = "_id")
	private Long triningId;
	
	@Column(name="name")
	private String skillName;
	
	@Column(name = "total_amount_to_mentor")
	private Float totalAmountToMentor;

	public Payment() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Payment(Long id, String txnType, Float amount, String remarks, Long mentorId, String mentorName,
			Long triningId, String skillName, Float totalAmountToMentor) {
		super();
		this.id = id;
		this.txnType = txnType;
		this.amount = amount;
		this.remarks = remarks;
		this.mentorId = mentorId;
		this.mentorName = mentorName;
		this.triningId = triningId;
		this.skillName = skillName;
		this.totalAmountToMentor = totalAmountToMentor;
	}

	@Override
	public String toString() {
		return "Payment [id=" + id + ", txnType=" + txnType + ", amount=" + amount + ", remarks=" + remarks
				+ ", mentorId=" + mentorId + ", mentorName=" + mentorName + ", triningId=" + triningId + ", skillName="
				+ skillName + ", totalAmountToMentor=" + totalAmountToMentor + "]";
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTxnType() {
		return txnType;
	}

	public void setTxnType(String txnType) {
		this.txnType = txnType;
	}

	public Float getAmount() {
		return amount;
	}

	public void setAmount(Float amount) {
		this.amount = amount;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public Long getMentorId() {
		return mentorId;
	}

	public void setMentorId(Long mentorId) {
		this.mentorId = mentorId;
	}

	public String getMentorName() {
		return mentorName;
	}

	public void setMentorName(String mentorName) {
		this.mentorName = mentorName;
	}

	public Long getTriningId() {
		return triningId;
	}

	public void setTriningId(Long triningId) {
		this.triningId = triningId;
	}

	public String getSkillName() {
		return skillName;
	}

	public void setSkillName(String skillName) {
		this.skillName = skillName;
	}

	public Payment(String txnType, Float amount, String remarks, Long mentorId, String mentorName, Long triningId,
			String skillName, Float totalAmountToMentor) {
		super();
		this.txnType = txnType;
		this.amount = amount;
		this.remarks = remarks;
		this.mentorId = mentorId;
		this.mentorName = mentorName;
		this.triningId = triningId;
		this.skillName = skillName;
		this.totalAmountToMentor = totalAmountToMentor;
	}

	public Float getTotalAmountToMentor() {
		return totalAmountToMentor;
	}

	public void setTotalAmountToMentor(Float totalAmountToMentor) {
		this.totalAmountToMentor = totalAmountToMentor;
	}
}
