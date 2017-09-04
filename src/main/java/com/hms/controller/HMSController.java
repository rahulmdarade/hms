package com.hms.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hms.model.Doctor;
import com.hms.model.Invoice;
import com.hms.model.Patient;
import com.hms.service.HMSService;

@RestController
@RequestMapping("/hms")
@CrossOrigin("localhost:8080")
public class HMSController {
	
	@Autowired
	HMSService service;
	
	@RequestMapping("/")
	String home() {
		return "<h1>Welcome to Hospital Management System</h1>";
	}
	
	//Doctors
	
	@RequestMapping("/doctorInfo")
	List<Doctor> showAllDoctors(){
		List<Doctor> listAllDoctors= new ArrayList<>();
		listAllDoctors=service.showAllDoctors();
		return listAllDoctors;
	}
	
	@RequestMapping("/doctorInfo/viewByName/{name}")
	Doctor doctorViewByName(@PathVariable("name") String name ) {
		return service.searchDoctorByName(name);
	}
	
	//Patients
	
	@RequestMapping("/patientInfo")
	List<Patient> showAllPatients(){
		List<Patient> listAllPatients= new ArrayList<Patient>();
		listAllPatients=service.showAllPatients();
		return listAllPatients;
	}
	
	@RequestMapping("/patientInfo/viewByName/{name}")
	Patient patientViewByName(@PathVariable("name") String name ) {
		return service.searchPatientByName(name);
	}
	
	//Invoice 
	@RequestMapping("/invoice")
	List<Invoice> showinvoice(){
		return service.showInvoice();
	}
	
}
