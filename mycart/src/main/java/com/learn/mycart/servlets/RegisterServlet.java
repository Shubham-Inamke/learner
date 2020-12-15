package com.learn.mycart.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.learn.mycart.entities.User;
import com.learn.mycart.helper.FactoryProvider;

@WebServlet(name="RegisterServlet", urlPatterns = {"/RegisterServlet"})
public class RegisterServlet extends HttpServlet
{
	private static final long serialVersionUID = 1L;
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
		try
		{
				String userName = request.getParameter("user_name");
				String userEmail = request.getParameter("user_email");
				String userPassword = request.getParameter("user_password");
				String userPhone= request.getParameter("user_phone");
				String userAddress = request.getParameter("user_address");
				
				//validations
				if(userName.isEmpty())
				{
					System.out.println("Name is blank");
					return;
				}
				
				// creating user object to store data
			User user = new User(userName, userEmail, userPassword, userPhone, "daksh.jpg", userAddress, "developer");
			
			//save data to database
			Session hibernateSession = FactoryProvider.getFactory().openSession();
			Transaction tx = hibernateSession.beginTransaction();
			int userId = (int) hibernateSession.save(user);
			
			tx.commit();
			hibernateSession.close();
			
			System.out.println("Successfully saved");
			System.out.println("<br> User id is: "+userId);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		doGet(request, response);
	}

}
