/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Account;

/**
 *
 * @author ADMIN
 */
public class HomeServlet extends HttpServlet {

manager mana = new manager();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
         // luu giuw lieu vao request
            request.setAttribute("listAcc",  mana.getListAccount());
            request.getRequestDispatcher("display.jsp").include(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String name = request.getParameter("searchname");   
        String action = request.getParameter("action");
        
        switch (action) {
            case "search":
            {
                List<Account> listSearchAcc = mana.searchAccByUser(name);
                request.setAttribute("listAcc", listSearchAcc);
            }
            break;
            default:
        }
                request.getRequestDispatcher("display.jsp").forward(request, response);
        
    }

   

}
