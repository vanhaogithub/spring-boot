package com.bachkhoa.entities;

import java.util.Date;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Table(name = "user_info")
public class UserInfo {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
	
	@OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;
	
	@Size(max = 100)
    private String address;
	
	@Temporal(TemporalType.DATE)
    @Column(name = "birth_day")
    private Date dateOfBirth;
	
	@Column(name = "phone_number")
    @Size(max = 15)
    private String phoneNumber;

	public UserInfo() {
		super();
	}

	public UserInfo(Long id, User user, @Size(max = 100) String address, Date dateOfBirth,
			@Size(max = 15) String phoneNumber) {
		super();
		this.id = id;
		this.user = user;
		this.address = address;
		this.dateOfBirth = dateOfBirth;
		this.phoneNumber = phoneNumber;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	
}
