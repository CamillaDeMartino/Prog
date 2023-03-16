package com.example.model;

import com.example.handler.Handler;
import com.example.handler.MailHandler;
import com.example.handler.PasswordHandler;
import com.example.handler.RoleHandler;
import com.example.service.AuthService;

import java.io.IOException;

public class MainTest {
    public static void main(String[] args) throws IOException{
        LoginDao database = new LoginDao();

        Handler handler = new MailHandler(database);
        handler.setNextHandler(new PasswordHandler(database))
                .setNextHandler(new RoleHandler());

        AuthService service = new AuthService(handler);
        service.logIn("khfbdh", "utegrvbk");
    }
}
