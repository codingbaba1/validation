package com.valid.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class UserDTO {

	@NotBlank(message = "Invalid Name: Empty Name")
	@NotNull(message = "Invalid Name: name is NULL")
	@Size(min = 3, max = 25, message = "Invalid Name: Must be of 3-25 characters")
	private String name;

	@NotNull(message = "Invalid Phone Number: number is NULL")
	@NotBlank(message = "Invalid Phone Number: Empty Number")
	@Pattern(regexp = "^\\d{10}$", message = "Invalid phone Number!!!!")
	private String mobile;

	@Email(message = "Invalid email")
	private String email;

	@Min(value = 1, message = "Invalid Age: Equals to zero or less than zero")
	@Max(value = 100, message = "Invalid Age: Exceeds 100 years!!!")
	private Integer age;

}
