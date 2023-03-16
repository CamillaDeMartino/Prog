package com.example.handler;

public class RoleHandler extends Handler{
    @Override
    public boolean handle(String username, String password) {
        if("admin".equals(username)){
            System.out.println("Caricamento Pagina Admin...");
            return true;
        }
        System.out.println("Caricamento Pagina di Default ");
        return handleNext(username, password);
    }
}
