package com.example.controller;

import com.example.model.LoginDao;
import com.example.model.AccessoLogin;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
/*
@WebServlet(name = "LoginServlet", value = "/login")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        request.getRequestDispatcher("login.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        LoginDao loginDao = new LoginDao();
        AccessoLogin accessoLogIn = loginDao.logIn(username, password);

        switch (accessoLogIn) {
            case ERRORE:
                request.setAttribute("stato", "ERRORE");
                request.getRequestDispatcher("login.jsp").forward(request, response);
                break;
            case UTENTE_INESISTENTE:
                request.setAttribute("stato", "UTENTE_INESISTENTE");
                request.getRequestDispatcher("login.jsp").forward(request, response);
                break;
            case PASSWORD_ERRATA:
                request.setAttribute("stato", "PASSWORD_ERRATA");
                request.getRequestDispatcher("login.jsp").forward(request, response);
                break;
            case SUCCESSO:
                request.setAttribute("stato", "SUCCESSO");
                request.setAttribute("users", username);
                request.getRequestDispatcher("homepage.jsp").forward(request, response);
                response.sendRedirect(getServletContext().getContextPath());
                break;
            default:
                request.setAttribute("stato", "ERRORE");
                request.getRequestDispatcher("login.jsp").forward(request, response);
                break;
        }
    }
}*/
