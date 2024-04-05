package com.lld.bookmyshowapr23.models;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Theater extends BaseModel{
    private String name;
    private Region region;
//    private List<Screen> screens;
    private List<Show> shows;
}
