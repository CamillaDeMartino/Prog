package com.example.handler;

import com.example.model.AccessoLogin;

public abstract class Handler {
    private Handler next;
    public Handler setNextHandler(Handler next){
        this.next = next;
        return  next;
    }

    //public abstract AccessoLogin handle(String username, String password);

    /*protected AccessoLogin handlerNext(String username, String password){
        if(this.next == null){
            return AccessoLogin.SUCCESSO;
        }
        return next.handle(username, password);
    }*/

    public abstract boolean handle(String username, String password);

    protected boolean handleNext(String username, String password){
        if(next == null){
            return true;
        }
        return next.handle(username, password);
    }
}
