/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author hb49125
 */
public class informacoes extends HttpServlet {

     public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        response.setContentType("text/html");
        
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Informações do usuário</title>");
        out.println("<meta http-equiv='Content-Type' content='text/html; charset=UTF-8'>");
        out.println("<link href= 'aj.css' rel='stylesheet' type='text/css'>");
        out.println("</head>");
        out.println("<body>");
       
        
       
        out.println("<TABLE width = '700' border='0'>");


        out.println("<TR width = '%100' class='tituloCampo'>");
       
        out.println("<TD width = '%10' >Nome</TD>");
        out.println("<TD width = '%10' >E-mail</TD>");
  
      
        out.println("</TR>");

        // -------------------------------------------------------------------
        // Insira a partir daqui o codigo pedido no laboratorio:
        // -------------------------------------------------------------------
       
}}
