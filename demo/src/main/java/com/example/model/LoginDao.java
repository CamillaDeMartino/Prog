package com.example.model;

import com.example.handler.Handler;
import com.example.handler.MailHandler;
import com.example.handler.PasswordHandler;
import com.example.service.AuthService;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;


public class LoginDao implements Serializable {
    public final Map<String, String> users = new HashMap<>();

    //public Map<String, String> getUsers() {return users;}

    public LoginDao(){
        users.put("admin", "admin");
        users.put("vincenzo", "test");
        users.put("user", "user");
    }

    /*public AccessoLogin logIn(String mail, String password){
        Handler handler = new MailHandler(users)
                .setNextHandler(new PasswordHandler(users));


        AuthService authService = new AuthService(handler);
        return authService.logIn(mail,password);
    }*/

    public boolean isValidEmail(String username){
        return users.containsKey(username);
    }

    public boolean isValidPassword(String username, String password){
        return users.get(username).equals(password);
    }
}
