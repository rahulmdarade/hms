package com.hms.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.hms.model.Doctor;
import com.hms.model.Hospital;
import com.hms.model.Invoice;
import com.hms.model.Patient;
import com.hms.service.HMSService;

@RestController
@RequestMapping("/hms")
public class HMSController {
	
	@Autowired
	HMSService service;
	
	@RequestMapping("/")
	String home() {
		return "<h1>Welcome to Hospital Management System</h1>";
	}
	
	//Hospital
	
	@RequestMapping("/hospital")
	List<Hospital> getHospital(){
		return service.getHospital();
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
	
	@RequestMapping(value="/doctors/updateDoctor/{id}",method=RequestMethod.PUT,consumes=MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus(value=HttpStatus.OK)
	void updateDoctor(@PathVariable("id") long id, @RequestBody Doctor doctor) throws Exception{
		doctor.setId(id);
		service.updateDoctor(doctor);
	}
	
	@RequestMapping(value="/doctors/deleteDoctor/{id}",method=RequestMethod.DELETE)
	@ResponseStatus(value=HttpStatus.OK)
	void deleteDoctor(@PathVariable("id") long id)throws Exception{
		service.deleteDoctor(id);
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
	
	@RequestMapping(value="/patients/addPatient",method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus(value = HttpStatus.OK)
	void addPatient(@RequestBody Patient patient) throws Exception{
		service.createPatient(patient);
	}
	
	@RequestMapping(value="/patients/updatePatient/{id}",method=RequestMethod.PUT,consumes=MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus(value=HttpStatus.OK)
	void updatePatient(@PathVariable("id") long id, @RequestBody Patient patient) throws Exception{
		patient.setId(id);
		service.updatePatient(patient);
	}
	
	@RequestMapping(value="/patients/deletePatient/{id}",method=RequestMethod.DELETE)
	@ResponseStatus(value=HttpStatus.OK)
	void deletePatient(@PathVariable("id") long id)throws Exception{
		service.deletePatient(id);
	}
	//Invoice 
	
	@RequestMapping("/invoice")
	List<Invoice> showinvoice(){
		return service.showInvoice();
	}
	
}
