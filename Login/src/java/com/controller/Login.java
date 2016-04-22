/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class Login extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public Login() {
        super();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        String username = request.getParameter("Name");
        String password = request.getParameter("Pass");
        
        response.setContentType("text/html");
        if(username.equals("marcus") && password.equals("123456")) {
            response.getWriter().println("<html><body>Olá Seja bem vindo"
                    + "<br>" + "<a href=\"informacoes\">Clique aqui para acessar suas informações</a></body></html>");
           
        } 
        else {                
           
            request.getRequestDispatcher("/index.html").forward(request, response);                
        }
    }
}