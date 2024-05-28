package com.busboking.Bus_Booking_system.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Date;

@Entity
@Service
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class ValueTable {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @ManyToOne
    @JoinColumn(name = "key_id")
    private KeyTable keyTable;
    private LocalDate date;
}