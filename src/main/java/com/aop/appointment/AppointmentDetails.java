package com.aop.appointment;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table
@Entity
public class AppointmentDetails {
	@Id
	@Column(name = "appointment_ID")
	private Integer appointmentID;
	@Column
	private int patientID;
	@Column
	private int doctorID;

	public AppointmentDetails() {
		// TODO Auto-generated constructor stub
	}

	public AppointmentDetails(Integer appointmentID, int patientID, int doctorID) {
		super();
		this.appointmentID = appointmentID;
		this.patientID = patientID;
		this.doctorID = doctorID;
	}

	public int getDoctorID() {
		return doctorID;
	}

	public void setDoctorID(int doctorID) {
		this.doctorID = doctorID;
	}

	public Integer getAppointmentID() {
		return appointmentID;
	}

	public void setAppointmentID(Integer appointmentID) {
		this.appointmentID = appointmentID;
	}

	public int getPatientID() {
		return patientID;
	}

	public void setPatientID(int patientID) {
		this.patientID = patientID;
	}

	@Override
	public String toString() {
		return "AppointmentDetails [appointmentID=" + appointmentID + ", patientID=" + patientID + ", doctorID="
				+ doctorID + "]";
	}
}