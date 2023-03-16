package com.example.handler;

import com.example.model.AccessoLogin;
import com.example.model.LoginDao;

import java.util.Map;

public class PasswordHandler extends Handler{
    /*private final Map<String, String> users;

    public PasswordHandler(Map users){this.users = users;}

    public AccessoLogin handle(String username, String password){
        if(users.get(username) != null){
            if(!users.get(username).equals(password)){
                System.out.println("Password errata");
                System.out.println("Riprova");
                return AccessoLogin.PASSWORD_ERRATA;
            }
            return handlerNext(username, password);
        }
        return AccessoLogin.UTENTE_INESISTENTE;
    }*/

    private LoginDao database;

    public PasswordHandler(LoginDao database){
        this.database = database;
    }

    @Override
    public boolean handle(String username, String password) {
        if(!database.isValidPassword(username,password)){
            System.out.println("Password errata");
            System.out.println("Riprova");
            return false;
        }
        return handleNext(username, password);
    }
}
