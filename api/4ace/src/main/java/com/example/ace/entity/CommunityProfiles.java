package com.example.ace.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "communityProfiles")
public class CommunityProfiles {
    @Column(name = "full_name")
    private  String fullName;
    @Column(name = "user_name")
    private  String userName;
    @Column(name = "email")
    private  String email;
    @Column(name = "phone_no")
    private  String phoneNo;
    @Column(name = "role")
    private  String role;
    @Column(name = "password")
    private  String password;
    @Column(name = "gender")
    private  String gender;
    @Column(name = "birth_date")
    private  String birthDate;
    @Id
    @Column(name = "uuid")
    private String uuid;

    public CommunityProfiles() {
    }

    public CommunityProfiles(String fullName, String userName, String email, String phoneNo, String role, String password, String gender, String birthDate, String uuid) {
        this.fullName = fullName;
        this.userName = userName;
        this.email = email;
        this.phoneNo = phoneNo;
        this.role = role;
        this.password = password;
        this.gender = gender;
        this.birthDate = birthDate;
        this.uuid = uuid;
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

    public String getUuid() {
        return uuid;
    }
}
