package com.hms.daoimp;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.hms.dao.PatientDao;
import com.hms.model.Patient;

@Repository
public class PatientDAOImp implements PatientDao {

	List<Patient> listPatients= new ArrayList<Patient>();
	
	@Override
	public List<Patient> allPatients() {
		Patient patient = new Patient("Rahul","Vasai","Male","Fever","rahul@mail.com",8655312612L);
		listPatients.add(patient);
		patient = new Patient("Neha","Kalyan","Female","Cold","neha@mail.com",9875641235L);
		listPatients.add(patient);
		patient = new Patient("Kavita","Thane","Female","Malaria","kavita@mail.com",8659754868L);
		listPatients.add(patient);
		patient = new Patient("Nilesh","Thane","Male","Head Ache","nilesh@mail.com",9568425613L);
		listPatients.add(patient);
		return listPatients;
	}
}
