package com.learn1.demo.entity;

import java.sql.Date;

public class Appointment {
    private Long appointmentID;

    private String appointee;

    private Date date;

    private String timeSlot;

    private String appointmentSubject;

    private String applicationStatus;

    private Long meetingRoomID;

    // Getter and Setter methods

    public Long getAppointmentID() {
        return appointmentID;
    }

    public void setAppointmentID(Long appointmentID) {
        this.appointmentID = appointmentID;
    }

    public String getAppointee() {
        return appointee;
    }

    public void setAppointee(String appointee) {
        this.appointee = appointee;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getTimeSlot() {
        return timeSlot;
    }

    public void setTimeSlot(String timeSlot) {
        this.timeSlot = timeSlot;
    }

    public String getAppointmentSubject() {
        return appointmentSubject;
    }

    public void setAppointmentSubject(String appointmentSubject) {
        this.appointmentSubject = appointmentSubject;
    }

    public String getApplicationStatus() {
        return applicationStatus;
    }

    public void setApplicationStatus(String applicationStatus) {
        this.applicationStatus = applicationStatus;
    }

    public Long getMeetingRoomID() {
        return meetingRoomID;
    }

    public void setMeetingRoomID(Long meetingRoomID) {
        this.meetingRoomID = meetingRoomID;
    }
}
