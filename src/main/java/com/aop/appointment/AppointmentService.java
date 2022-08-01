package com.aop.appointment;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AppointmentService {

	@Autowired
	private AppointmentRepository repo;

	public AppointmentDetails CreateAppointment(AppointmentDetails appointmentDetails) {
		return repo.save(appointmentDetails);
	}

	public AppointmentDetails updateAppointment(AppointmentDetails appointmentDetails) {
		Optional<AppointmentDetails> existedAppointment = repo.findById(appointmentDetails.getAppointmentID());
		if (existedAppointment.isPresent()) {
			AppointmentDetails updatedAppointment = existedAppointment.get();
			updatedAppointment.setAppointmentID(appointmentDetails.getAppointmentID());
			updatedAppointment.setDoctorID(appointmentDetails.getDoctorID());
			updatedAppointment.setPatientID(appointmentDetails.getPatientID());
			return updatedAppointment;
		} else
			return null;
	}

	public AppointmentDetails getAppointmentByID(Integer appointmentID) {
		Optional<AppointmentDetails> existedAppointment = repo.findById(appointmentID);
		if (existedAppointment.isPresent()) {
			return existedAppointment.get();
		} else
			return null;
	}

	public AppointmentDetails deleteAppointmentByID(Integer appointmentID) {
		Optional<AppointmentDetails> existedAppointment = repo.findById(appointmentID);
		if (existedAppointment.isPresent()) {
			return existedAppointment.get();
		} else
			return null;
	}

	public List<AppointmentDetails> getAllAppointment() {
		return repo.findAll();
	}
}
