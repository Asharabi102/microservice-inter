package org.avows.inter.model;

import java.util.HashSet;
import java.util.Set;


public class UserDto {

	private Long id;
	private String email;
	private String firstName;
	private String lastName;
	private String phoneNumber;
	private String address1;
	private String address2;
	
    private Set<AccountDto> accounts = new HashSet<>();;
	
	public Set<AccountDto> getAccounts() {
		return accounts;
	}

	public void setAccounts(Set<AccountDto> accounts) {
		this.accounts = accounts;
	}

	public UserDto() {}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getAddress1() {
		return address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public String getAddress2() {
		return address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

}
