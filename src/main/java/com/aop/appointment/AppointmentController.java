package com.aop.appointment;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppointmentController {

	@Autowired
	private AppointmentService service;

	@GetMapping("/get")
	public AppointmentDetails get() {
		return new AppointmentDetails(23, 12, 12);
	}

	@PostMapping("/createAppointment")
	public AppointmentDetails CreateAppointment(@RequestBody AppointmentDetails appointmentDetails) {
		return service.CreateAppointment(appointmentDetails);
	}

	@PutMapping("/updateAppointment")
	public AppointmentDetails updateAppointment(@RequestBody AppointmentDetails appointmentDetails) {
		return service.updateAppointment(appointmentDetails);
	}

	@GetMapping("/getAppointmentByID/{appointmentID}")
	public AppointmentDetails getAppointmentByID(@PathVariable Integer appointmentID) {
		return service.getAppointmentByID(appointmentID);
	}

	@DeleteMapping("/deleteAppointmentByID/{appointmentID}")
	public AppointmentDetails deleteAppointmentByID(Integer appointmentID) {
		return service.deleteAppointmentByID(appointmentID);
	}

	@GetMapping("/getAllAppointment")
	public List<AppointmentDetails> getAllAppointment() {
		return service.getAllAppointment();
	}

}
