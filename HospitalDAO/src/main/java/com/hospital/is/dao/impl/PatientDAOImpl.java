package com.hospital.is.dao.impl;

import java.util.Map;
import java.util.Map.Entry;

import com.hospital.is.StaticDatabase;
import com.hospital.is.dao.PatientDAO;
import com.hospital.is.entity.Patient;

/**
 * @author user001
 *
 */
public class PatientDAOImpl extends DAOImpl<Patient> implements PatientDAO  {
	
	static int i = 2;
	
	@Override
	public Patient create(Patient patient) {
		StaticDatabase.getPatientMap().put(i, patient);
		i++;
		return patient;
	}
	
	@Override
	public Map<Integer, Patient> getAll() {
		return StaticDatabase.getPatientMap();
	}
	
	@Override
		public Patient getById(long id) {

			Patient patient = new Patient();
			
			
			for(Entry<Integer, Patient> entry : getAll().entrySet())
				if(entry.getKey() == id)
					patient = entry.getValue();
		
			return patient;
		}
	
	@Override
	public Patient update(Patient patient, Long id) {
		
		Patient p = new Patient();
		
		for(Entry<Integer, Patient > entry : StaticDatabase.getPatientMap().entrySet())
			if (entry.getKey()==id.intValue())
			{
//				entry.setValue(patient);
				StaticDatabase.getPatientMap().replace(id.intValue(), patient);
				p = entry.getValue();
			}
		
					
		
		return p;
	}

}
