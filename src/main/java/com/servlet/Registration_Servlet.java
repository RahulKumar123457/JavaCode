package com.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

/**
 * Servlet implementation class Registration_Servlet
 */
@WebServlet("/Registration_Servlet")
public class Registration_Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Registration_Servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		//PrintWriter out = response.getWriter();
		out.println("<h3> WELCOME TO REGISTRATION FORM</h3>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		response.setContentType("text/html");
//		PrintWriter out = response.getWriter();
//		out.println("<h3> WELCOME TO REGISTRATION FORM</h3>");
//		
//        String name = request.getParameter("User_name");
//      String password = request.getParameter("User_Password");
//        String email = request.getParameter("User_Email");
//        String gender = request.getParameter("User_gender");
//        String course = request.getParameter("User_Courses"); 
//        String cond = request.getParameter("condition");
//       
//       if(cond.equals("checked")) {
//       	out.println("<h2> Name:"+name+"</h2>");
//       	out.println("<h2> Password:"+password+"</h2>");
//       	out.println("<h2> Email:"+email+"</h2>");
//        	out.println("<h2> Gender:"+gender+"</h2>");
//        	out.println("<h2> course:"+course+"</h2>");
//        //JDBC
//       }
//      else {
//       	out.println("<h2>You have not accepted term and condition</h2>");
//        }
	}

}
