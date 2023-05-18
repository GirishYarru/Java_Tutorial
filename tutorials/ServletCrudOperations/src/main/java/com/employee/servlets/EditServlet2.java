package com.employee.servlets;
import java.io.IOException;  
import java.io.PrintWriter;  
  
import javax.servlet.ServletException;  
import javax.servlet.annotation.WebServlet;  
import javax.servlet.http.HttpServlet;  
import javax.servlet.http.HttpServletRequest;  
import javax.servlet.http.HttpServletResponse;

import com.employee.Employee;
import com.employee.dao.EmployeeDao;  
@WebServlet("/EditServlet2")  
public class EditServlet2 extends HttpServlet {  
    protected void doPost(HttpServletRequest request, HttpServletResponse response)   
          throws ServletException, IOException {  
        response.setContentType("text/html");  
        PrintWriter out=response.getWriter();  
          
        String sid=request.getParameter("id");  
        int id=Integer.parseInt(sid);  
        String fname=request.getParameter("fname");  
        String lName=request.getParameter("lname");  
        String age=request.getParameter("age");  
        String country=request.getParameter("country");  
          
        Employee e=new Employee();  
        e.setId(id);  
        e.setFirstName(fname);  
        e.setLastName(lName);  
        e.setAge(Integer.parseInt(age));  
        e.setCountry(country);  
          
        int status=EmployeeDao.update(e);  
        if(status>0){  
            response.sendRedirect("ViewServlet");  
        }else{  
            out.println("Sorry! unable to update record");  
        }  
          
        out.close();  
    }  
  
}