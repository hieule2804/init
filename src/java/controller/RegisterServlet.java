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
import model.Role;


/**
 *
 * @author ADMIN
 */
public class RegisterServlet extends HttpServlet {

 manager mana = new manager();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       request.setAttribute("listRole", mana.getListRole());
       request.getRequestDispatcher("register.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
     response.setContentType("text/html;charset=UTF-8");
        try ( PrintWriter out = response.getWriter()) {
          //lay username
          String user = request.getParameter("user");
          //lay pass
          String pass = request.getParameter("pass");
          //lay gender
           String gender = request.getParameter("gender");
          //lay role
          int roleID =  Integer.parseInt(request.getParameter("role"));
          // tao doi tuong role
          Role role = mana.getRoleByID(roleID);
          //lay hobby
            String[] hobby = request.getParameterValues("hobby");
            Account account = new Account(user, pass,gender , role, hobby);
         // add account vaof collection
            mana.getListAccount().add(account);
         // luu giuw lieu vao request
            request.setAttribute("listAcc",  mana.getListAccount());
            request.getRequestDispatcher("display.jsp").include(request, response);
        }
    }

 

}
