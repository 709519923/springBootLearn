package com.learn1.demo.service;
import com.learn1.demo.entity.Appointment;
import com.learn1.demo.mapper.AppointmentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

//实例化UserService
@Service
public class AppointmentService {
    //实例化UserMapper
    @Autowired
    private AppointmentMapper appointmentMapper;
    public List<Appointment> findAll(){
        return appointmentMapper.findAll();
    }

}
