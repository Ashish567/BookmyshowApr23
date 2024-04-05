package com.lld.bookmyshowapr23.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@Entity
public class Booking extends BaseModel{
    // 1 : 1
    // M  : 1
    @ManyToOne
    private User user;
    private BookingStatus bookingStatus;
    private Date bookedAt;
    // 1 : M
    // M : 1  , cancelled booking will also have showseat
    @ManyToMany
    private List<ShowSeat> showSeats;
    // 1 : 1
    // M : 1
    @ManyToOne
    private Show show;
    private int amount;
    // 1 : M
    // 1 : 1
    @OneToMany
    private List<Payment> payments;

}

// HW : go to every class and decide the mapping for each relation
// ORM : Object relation Mapping
// Hibernate
