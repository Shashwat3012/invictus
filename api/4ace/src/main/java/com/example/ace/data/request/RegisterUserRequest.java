package com.example.ace.data.request;

public class RegisterUserRequest extends LoginRequest{
    private final String fullName;
    private final String userName;
    private final String email;
    private final String phoneNo;
    private final String role;
    private final String password;
    private final String gender;
    private final String birthDate;

    public RegisterUserRequest(String userName, String role, String password, String fullName, String email, String phoneNo, String gender, String birthDate) {
        super(userName, role, password);
        this.fullName = fullName;
        this.userName = userName;
        this.email = email;
        this.phoneNo = phoneNo;
        this.role = role;
        this.password = password;
        this.gender = gender;
        this.birthDate = birthDate;
    }

    public String getFullName() {
        return fullName;
    }

    @Override
    public String getUserName() {
        return userName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    @Override
    public String getRole() {
        return role;
    }

    @Override
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
