package com.lld.bookmyshowapr23;

import com.lld.bookmyshowapr23.models.BaseModel;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BookMyShowApr23Application {

    public static void main(String[] args) {
        BaseModel b = new BaseModel();
        int x = b.getId();
        SpringApplication.run(BookMyShowApr23Application.class, args);
    }

}
