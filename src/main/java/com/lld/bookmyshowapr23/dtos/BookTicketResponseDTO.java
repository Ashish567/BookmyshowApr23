package com.lld.bookmyshowapr23.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BookTicketResponseDTO {
    private ResponseStatus responseStatus;
    private Long bookingId;
    private int amount;
}
