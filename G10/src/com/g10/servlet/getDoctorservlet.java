package com.g10.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.g10.service.DoctorService;
import com.g10.serviceImpl.DoctorServiceImpl;

import g10.model.Doctor;

/**
 * Servlet implementation class getDoctorservlet
 */
@WebServlet("/getDoctorservlet")
public class getDoctorservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public getDoctorservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String name = request.getParameter("nme");
		String uname = request.getParameter("unme");
		String work = request.getParameter("wrk");
		String specialization = request.getParameter("spcl");
		String experiance = request.getParameter("exp");
		String email = request.getParameter("email");
		
		Doctor doctor = new Doctor();
		
		doctor.setName(name);
		doctor.setExperiance(experiance);
		doctor.setUsername(uname);
		doctor.setWork(work);
		doctor.setSpecialization(specialization);
		doctor.setEmail(email);
		
		DoctorService dcservice = new DoctorServiceImpl();
		
		try {
			boolean isAdded = dcservice.addnewDoctor(doctor);
			if(isAdded) {
				System.out.println("Success");
				
			}else {
				
				System.out.println("failed");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
