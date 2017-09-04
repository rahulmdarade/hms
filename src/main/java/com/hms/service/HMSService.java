package com.hms.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hms.dao.DoctorDAO;
import com.hms.dao.InvoiceDAO;
import com.hms.dao.PatientDAO;
import com.hms.model.Doctor;
import com.hms.model.Invoice;
import com.hms.model.Patient;

@Service
public class HMSService {
	
	@Autowired
	DoctorDAO doctorDao;
	
	@Autowired
	PatientDAO patientDao;
	
	@Autowired
	InvoiceDAO invoiceDao;
	
	List<Doctor> listDoctors;
	List<Patient> listPatients;
	List<Invoice> invoiceList;
	
	//Doctor
	
	public List<Doctor> showAllDoctors(){
		listDoctors=doctorDao.allDoctors();
		return listDoctors;
	}

	public Doctor searchDoctorByName(String doctorName){
		listDoctors=doctorDao.allDoctors();
		for(Doctor d: listDoctors){
			if(d.getName().equals(doctorName)){
				return d;
			}
		}
		return null;
	}
	
	//Patients
	
	public List<Patient> showAllPatients(){
		listPatients=patientDao.allPatients();
		return listPatients;
	}
	
	public Patient searchPatientByName(String patientName){
		listPatients=patientDao.allPatients();
		for(Patient p: listPatients){
			if(p.getName().equals(patientName)){
				return p;
			}
		}
		return null;
	}
	
	// Invoice 
	
	public List<Invoice> showInvoice(){
		invoiceList=invoiceDao.showInvoice();
		return invoiceList;
	}
	
}
