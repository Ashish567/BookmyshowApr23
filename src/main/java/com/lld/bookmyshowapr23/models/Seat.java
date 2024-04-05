package com.lld.bookmyshowapr23.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Seat extends BaseModel{
    private String number;
    private int row;
    private int col;
    private SeatType seatType;
}
