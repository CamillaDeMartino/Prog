package com.example.handler;

import com.example.model.AccessoLogin;
import com.example.model.LoginDao;

import java.util.Map;

public class MailHandler extends Handler{
    /*private final Map<String, String> users;

    public MailHandler(Map users){
        this.users = users;
    }

    public AccessoLogin handle(String username, String password){
        if(!users.containsKey(username)){
            System.out.println("Non sei registrato");
            System.out.println("Registrati ora");
            return AccessoLogin.ERRORE;
        }
        return handlerNext(username,password);
    }*/

    private LoginDao database;

    public MailHandler(LoginDao database){
        this.database = database;
    }

    @Override
    public boolean handle(String username, String password) {
        if(!database.isValidEmail(username)){
            System.out.println("Non sei registrato");
            System.out.println("Registrati ora");
            return false;
        }
        return handleNext(username, password);
    }
}
