package com.example.ace.data.response;

public class LoginResponse {
    private final String userName;
    private final String role;
    private final String password;

    public LoginResponse(String userName, String role, String password) {
        this.userName = userName;
        this.role = role;
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public String getRole() {
        return role;
    }

    public String getPassword() {
        return password;
    }
}
