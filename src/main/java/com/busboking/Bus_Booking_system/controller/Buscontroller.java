package com.busboking.Bus_Booking_system.controller;
import com.busboking.Bus_Booking_system.entity.Bus;
import com.busboking.Bus_Booking_system.entity.DateRequest;
import com.busboking.Bus_Booking_system.services.Busservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.text.ParseException;
@RestController
public class Buscontroller {
    @Autowired
    Busservice busservice;

    @PostMapping("/saveBus")
    public Bus saveBus(@RequestBody Bus bus)
    {
        return busservice.save(bus);
    }

    @PostMapping("/AddBooking")
    public DateRequest parseDate(@RequestBody DateRequest request) throws ParseException
    {
        return busservice.checkAvailable(request);
    }


}
