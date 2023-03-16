package com.example.model;

public class RoleAdmin implements Users{

    String username;
    String password;
    public RoleAdmin(String username, String password){
        this.username = username;
        this.password = password;
    }

    @Override
    public String getUsername() {
        return username;
    }

    public String getPassword(){
        return password;
    }

    @Override
    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public void setPassword(String password) {
        this.password = password;
    }
}
