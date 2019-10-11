package com.example.demo;

import java.util.Date;

public class UserDetails {
	private static final long serialVersionUID=1L;
	private Long id;
	private String userName="";
	private String password;
	private String firstName="";
	private String lastName="";
	private Long contactNumber;
	private String regCode;
	private String role;
	private String linkedinUrl;
	private Float yearsOfExperience;
	private Boolean active = false;
	private Boolean confirmedSignUp = false;
	private Date resetPasswordDate;
	private Boolean resetPassword = false;
}
