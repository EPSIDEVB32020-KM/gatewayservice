package com.example.gatewayservice;

public class Utilisateur {
    private String username;
    private String password;
    private String role;

    public Utilisateur() {

    }

    public Utilisateur(String username, String password) {
        this.username = username;
        this.password = password;
    }
    public Utilisateur(String username, String password,String role) {
        this.username = username;
        this.password = password;
        this.role = role;
    }

    public String getUsername() {
        return username;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
