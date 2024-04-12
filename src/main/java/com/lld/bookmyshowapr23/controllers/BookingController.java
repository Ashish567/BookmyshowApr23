package com.lld.bookmyshowapr23.controllers;

import com.lld.bookmyshowapr23.dtos.BookTicketRequestDTO;
import com.lld.bookmyshowapr23.dtos.BookTicketResponseDTO;
import com.lld.bookmyshowapr23.dtos.ResponseStatus;
import com.lld.bookmyshowapr23.models.Booking;
import com.lld.bookmyshowapr23.services.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

@Controller
public class BookingController {
    private BookingService bookingService;

    @Autowired
    BookingController(BookingService bookingService) {
        this.bookingService = bookingService;
    }
    public BookTicketResponseDTO bookTicket(BookTicketRequestDTO request){
        BookTicketResponseDTO response = new BookTicketResponseDTO();
        try {
            Booking booking = bookingService.bookTicket(
                    request.getShowSeatIds(),
                    request.getShowId(),
                    request.getUserId()
            );
            response.setBookingId((long) booking.getId());
            response.setAmount(booking.getAmount());
            response.setResponseStatus(ResponseStatus.SUCCESS);
        } catch(Exception ex){
            response.setResponseStatus(ResponseStatus.FAILURE);
        }
        return response;
    }
}
