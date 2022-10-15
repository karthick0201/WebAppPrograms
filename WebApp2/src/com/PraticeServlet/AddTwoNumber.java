package com.PraticeServlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class AddTwoNumber extends HttpServlet{

	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException {
		
		//ADD TWO NUMBER
		int i=Integer.parseInt(req.getParameter("num1"));
		int j=Integer.parseInt(req.getParameter("num2"));
		int k=i+j;
		//HTTPSERVLETRESPONSE OBJEXT AH PASS PANDROM
		
		PrintWriter pw=res.getWriter();
		//System.out.println("Sum is : " + k);
		pw.println("Sum is : " + k);
	}

}
