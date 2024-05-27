package com.busboking.Bus_Booking_system.controller;
import com.busboking.Bus_Booking_system.entity.Bus;
import com.busboking.Bus_Booking_system.entity.DateRequest;
import com.busboking.Bus_Booking_system.services.Busservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;
import java.text.ParseException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@RestController
public class Buscontroller {
    @Autowired
    Busservice busservice;
    @GetMapping("/getAllBuses")
    public List<Bus> getAllBuses()
    {
        return busservice.getAllBuses();
    }
    @PostMapping("/saveBus")
    public Bus saveBus(@RequestBody Bus bus)
    {
        return busservice.save(bus);
    }

    @PostMapping("/parseDate")
    public String parseDate(@RequestParam("date") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate date) throws ParseException {

       return busservice.checkAvailable(date.toString());


    }
}
