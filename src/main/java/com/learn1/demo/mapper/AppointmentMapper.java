package com.learn1.demo.mapper;

import com.learn1.demo.entity.Appointment;
import com.learn1.demo.entity.User;


import java.util.List;

public interface AppointmentMapper {
    List<Appointment> findAll();

    void updateAppointment(Appointment appointment);
}
