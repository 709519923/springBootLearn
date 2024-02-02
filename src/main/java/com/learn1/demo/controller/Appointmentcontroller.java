package com.learn1.demo.controller;

import com.learn1.demo.entity.Appointment;
import com.learn1.demo.entity.User;
import com.learn1.demo.service.AppointmentService;
import com.learn1.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Appointmentcontroller {

    @Autowired
    private AppointmentService appointmentService;

    @GetMapping ("/read_appointment") //查
    public List<Appointment> getAppointment(){
        return appointmentService.findAll();
    }
}
