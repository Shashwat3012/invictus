package com.example.ace.data.response;

public class RegisterUserResponse {
    private final String fullName;
    private final String userName;
    private final String email;
    private final String phoneNo;
    private final String role;
    private final String password;
    private final String gender;
    private final String birthDate;

    public RegisterUserResponse(String userName, String role, String password, String fullName, String userName1, String email, String phoneNo, String role1, String password1, String gender, String birthDate) {
        this.fullName = fullName;
        this.userName = userName1;
        this.email = email;
        this.phoneNo = phoneNo;
        this.role = role1;
        this.password = password1;
        this.gender = gender;
        this.birthDate = birthDate;
    }

    public String getFullName() {
        return fullName;
    }

    public String getUserName() {
        return userName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public String getRole() {
        return role;
    }

    public String getPassword() {
        return password;
    }

    public String getGender() {
        return gender;
    }

    public String getBirthDate() {
        return birthDate;
    }
}
