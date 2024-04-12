package com.lld.bookmyshowapr23;

import com.lld.bookmyshowapr23.controllers.UserController;
import com.lld.bookmyshowapr23.dtos.SignUpRequestDTO;
import com.lld.bookmyshowapr23.dtos.SignUpResponseDTO;
import com.lld.bookmyshowapr23.models.BaseModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class BookMyShowApr23Application implements CommandLineRunner {
    @Autowired
    UserController userController;

    @Override
    public void run(String... args) throws Exception {
        SignUpRequestDTO signUpRequestDTO = new SignUpRequestDTO();
        signUpRequestDTO.setEmail("mohit.sharma1@scaler.com");
        signUpRequestDTO.setPassword("123456");
        SignUpResponseDTO responseDTO = userController.signUp(signUpRequestDTO);
    }

    public static void main(String[] args) {
        SpringApplication.run(BookMyShowApr23Application.class, args);
    }

}
