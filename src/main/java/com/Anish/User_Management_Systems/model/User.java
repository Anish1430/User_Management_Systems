package com.Anish.User_Management_Systems.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Time;
import java.time.LocalTime;
import java.util.Date;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor

public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;

    @NotBlank(message = "Username is required")
    private String username;

    @Pattern(regexp = "\\d{2}-\\d{2}-\\d{4}", message = "Date of Birth should be in the format DD-MM-YYYY")
    private String dateOfBirth;

    @Email(message = "Invalid email format")
    private String email;

    @Pattern(regexp = "\\d{12}", message = "Phone number should be 12 digits")
    private String phoneNumber;

    private Date date;
}
