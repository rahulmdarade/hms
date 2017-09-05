package com.hms.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
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
	
	@RequestMapping("/doctors")
	List<Doctor> showAllDoctors(){
		List<Doctor> listAllDoctors= new ArrayList<>();
		listAllDoctors=service.showAllDoctors();
		return listAllDoctors;
	}
	
	@RequestMapping("/doctors/viewByName/{name}")
	List<Map<String, Object>> doctorViewByName(@PathVariable("name") String name ) {
		return service.searchDoctorByName(name);
	}
	
	@RequestMapping("/doctors/viewById/{id}")
	Doctor doctorViewById(@PathVariable("id") long id) {
		return service.searchDoctorById(id);
	}
	
	@RequestMapping(value="/doctors/addDoctor",method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus(value = HttpStatus.OK)
	void addDoctor(@RequestBody Doctor doctor) throws Exception{
		service.createDoctor(doctor);
	}
	
	//Patients
	
	@RequestMapping("/patients")
	List<Patient> showAllPatients(){
		List<Patient> listAllPatients= new ArrayList<Patient>();
		listAllPatients=service.showAllPatients();
		return listAllPatients;
	}
	
	@RequestMapping("/patients/viewByName/{name}")
	List<Map<String, Object>> patientViewByName(@PathVariable("name") String name ) {
		return service.searchPatientByName(name);
	}
	
	@RequestMapping("/patients/viewById/{id}")
	Patient patientViewById(@PathVariable("id") long id) {
		return service.searchPatientById(id);
	}
	
	//Invoice 
	
	@RequestMapping("/invoice")
	List<Invoice> showinvoice(){
		return service.showInvoice();
	}
	
}
