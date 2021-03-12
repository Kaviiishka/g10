package com.g10.serviceImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.g10.service.DoctorService;

import g10.model.Doctor;
import g10.util.DBconnection;

public class DoctorServiceImpl implements DoctorService {

	
	private static Connection conn;
	
	public DoctorServiceImpl() {
		conn = DBconnection.getConnection();
	}
	@Override
	public boolean addnewDoctor(Doctor doctor) throws SQLException {
		String sql = "insert into doctor values (?,?,?,?,?,?)";
		PreparedStatement stm = conn.prepareStatement(sql);
		stm.setObject(1, doctor.getUsername().trim());
		stm.setObject(2, doctor.getName());
		stm.setObject(3, doctor.getWork());
		stm.setObject(4,doctor.getSpecialization());
		stm.setObject(5, doctor.getExperiance());
		stm.setObject(6, doctor.getEmail());
		
		int res = stm.executeUpdate();
		return res>0;
	}

}
