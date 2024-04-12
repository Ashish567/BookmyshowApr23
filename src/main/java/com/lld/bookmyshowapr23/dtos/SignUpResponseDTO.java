package com.lld.bookmyshowapr23.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SignUpResponseDTO {
    private ResponseStatus responseStatus;
    private String message;
    private int userId;
}
