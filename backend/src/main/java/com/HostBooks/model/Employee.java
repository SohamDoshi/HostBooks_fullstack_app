package com.HostBooks.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
@Entity
@Table(name = "employees")
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "first_name")
	@NotBlank(message = "First name cannot be blank")
	@Pattern(regexp = "^[A-Za-z]+$", message = "First name must not contain any numbers or special characters")
	private String firstName;

	@Column(name = "last_name")
	@NotBlank(message = "Last name cannot be blank")
	@Pattern(regexp = "^[A-Za-z]+$", message = "Last name must not contain any numbers or special characters")
	private String lastName;
	
	@Column(name = "email_id")
	@Email(message = "Email should be in email fomart for example -> xxxxx@xxx.com")
	private String emailId;
}
