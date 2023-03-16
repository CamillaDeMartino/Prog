
package com.example.service;

import com.example.handler.Handler;
import com.example.model.AccessoLogin;

public class AuthService {
    private Handler handler;

    public AuthService(Handler handler){this.handler = handler;}

    /*public AccessoLogin logIn(String username, String password){
        if (handler.handle(username,password) == AccessoLogin.SUCCESSO){
            System.out.println("Successo!!!");
            return AccessoLogin.SUCCESSO;
        }
        return handler.handle(username, password);
    }*/
    public boolean logIn(String email, String password){
        if(handler.handle(email,password)){
            System.out.println("Autorizzazione effettuata con successo");
            return true;
        }
        return false;
    }
}