package com.learn1.demo.controller;

import com.learn1.demo.entity.Appointment;
import com.learn1.demo.entity.User;
import com.learn1.demo.service.AppointmentService;
import com.learn1.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Appointmentcontroller {

    @Autowired
    private AppointmentService appointmentService;

    @GetMapping ("/read_appointment") //查
    public List<Appointment> getAppointment(String date){
        return appointmentService.findAll(date);
    }

    @PostMapping("/update_appointment") // 改
    public void updateAppointment(@RequestBody Appointment appointment) {
        appointmentService.updateAppointment(appointment);
    }
}
