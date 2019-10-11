package com.example.demo;

public class PaymentDtls  {
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String txnType;
	private Float amount;
	private String remarks;
	private Long mentorId;
	private String mentorName;
	private Long trainingId;
	private String skillName;
	private Float totalAmountToMentor;
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
	public Long getTrainingId() {
		return trainingId;
	}
	public void setTrainingId(Long trainingId) {
		this.trainingId = trainingId;
	}
	public String getSkillName() {
		return skillName;
	}
	public void setSkillName(String skillName) {
		this.skillName = skillName;
	}
	public Float getTotalAmountToMentor() {
		return totalAmountToMentor;
	}
	public void setTotalAmountToMentor(Float totalAmountToMentor) {
		this.totalAmountToMentor = totalAmountToMentor;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "PaymentDtls [id=" + id + ", txnType=" + txnType + ", amount=" + amount + ", remarks=" + remarks
				+ ", mentorId=" + mentorId + ", mentorName=" + mentorName + ", trainingId=" + trainingId
				+ ", skillName=" + skillName + ", totalAmountToMentor=" + totalAmountToMentor + "]";
	}
	public PaymentDtls(Long id, String txnType, Float amount, String remarks, Long mentorId, String mentorName,
			Long trainingId, String skillName, Float totalAmountToMentor) {
		super();
		this.id = id;
		this.txnType = txnType;
		this.amount = amount;
		this.remarks = remarks;
		this.mentorId = mentorId;
		this.mentorName = mentorName;
		this.trainingId = trainingId;
		this.skillName = skillName;
		this.totalAmountToMentor = totalAmountToMentor;
	}
	public PaymentDtls() {
		super();
		// TODO Auto-generated constructor stub
	}
}
