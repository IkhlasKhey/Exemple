package com.hospital.is;

import java.util.Map;

import com.hospital.is.model.PatientDTO;
import com.hospital.is.service.PatientService;
import com.hospital.is.service.impl.PatientServiceImpl;

public class Main {

	public static void main(String[] args) {

		PatientService patientService = new PatientServiceImpl();

		Map<Integer, PatientDTO> map = patientService.getAll();
		
		PatientDTO patient = patientService.getById(1);

		System.out.println(map);
		
		patient.setFirstName("Hamza");
		
		System.out.println(patientService.update(patient, 1));
		
		map = patientService.getAll();
		
		System.out.println(map);
		
		//PatientDTO p = patientService.create(patient);
		
		map = patientService.getAll();
		
		System.out.println(map);
	}
}
