package com.lld.bookmyshowapr23.repositories;

import com.lld.bookmyshowapr23.models.Booking;
import org.springframework.data.repository.CrudRepository;

public interface BookingRepository extends CrudRepository<Booking, Integer> {
    @Override
    Booking save(Booking entity);
}
