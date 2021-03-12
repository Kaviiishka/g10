package com.g10.service;

import java.sql.SQLException;

import g10.model.Doctor;

public interface DoctorService {

	boolean addnewDoctor(Doctor doctor) throws SQLException;

}
