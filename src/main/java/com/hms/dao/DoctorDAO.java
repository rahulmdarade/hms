package com.hms.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.hms.model.Doctor;

@Repository
public class DoctorDAO {

	List<Doctor> listDoctors= new ArrayList<Doctor>();

	public List<Doctor> allDoctors(){
		Doctor doctor=new Doctor("Samaira", "Pediatrician", "MBBS", 6, "Dadar", "samaira@hospital.com", 8125963214L);
		listDoctors.add(doctor);
		doctor=new Doctor("John", "Cardiologist", "MD", 12, "Andheri", "john@hospital.com", 9856231475L);
		listDoctors.add(doctor);
		doctor=new Doctor("Peter", "Gynecologist", "MBBS", 3, "Thane", "peter@hospital.com", 9568142357L);
		listDoctors.add(doctor);
		doctor=new Doctor("Shuon", "Neurologist", "MBBS", 10, "Vashi", "shoun@hospital.com", 9786452315L);
		listDoctors.add(doctor);
		doctor=new Doctor("Reshma", "Surgeon", "MS", 7, "Churchgate", "reshma@hospital.com", 8759642154L);
		listDoctors.add(doctor);
		return listDoctors;
	}
	
	public void printDoctors(List<Doctor> listDoctors){
		for(Doctor d : listDoctors) 
			System.out.println(d);
	}
}
