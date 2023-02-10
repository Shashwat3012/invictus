package com.example.ace.data.request;

import javax.persistence.Column;
import javax.persistence.Id;

public class CommunityProfilesRequest {
    private final String fullName;
    private final String userName;
    private final String email;
    private final String phoneNo;
    private final String role;
    private final String password;
    private final String gender;
    private final String birthDate;

    public CommunityProfilesRequest(String fullName, String userName, String email, String phoneNo, String role, String password, String gender, String birthDate) {
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
