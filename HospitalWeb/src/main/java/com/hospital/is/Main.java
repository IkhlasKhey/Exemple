package com.hospital.is;

import com.hospital.is.model.PatientDTO;
import com.hospital.is.service.PatientService;
import com.hospital.is.service.impl.PatientServiceImpl;

public class Main {

	public static void main(String[] args) {

		PatientService patientService = new PatientServiceImpl();
		
		// getAll() test
		System.out.println(patientService.getAll());
		
		// getById() test
		System.out.println(patientService.getById(2)); 
		
		// update() test
		PatientDTO patient = patientService.getById(1);
		
		patient.setFirstName("Hamza");
		
		System.out.println(patientService.update(patient, 1));
		
		System.out.println(patientService.getAll());
		
		// create() test
		System.out.println(patientService.create(patient));
		
		System.out.println(patientService.getAll());
		
		// delete() test
		if (patientService.delete(1))
			System.out.println(patientService.getAll());
		else
			System.out.println("Can't delete patient !");
	}
}
