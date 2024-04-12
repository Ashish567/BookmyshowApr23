package com.lld.bookmyshowapr23.controllers;

import com.lld.bookmyshowapr23.dtos.ResponseStatus;
import com.lld.bookmyshowapr23.dtos.SignUpRequestDTO;
import com.lld.bookmyshowapr23.dtos.SignUpResponseDTO;
import com.lld.bookmyshowapr23.models.User;
import com.lld.bookmyshowapr23.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class UserController {
    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }
    public SignUpResponseDTO signUp(SignUpRequestDTO requestDTO){
        SignUpResponseDTO response = new SignUpResponseDTO();

        try{
            User user = userService.signUp(
                    requestDTO.getEmail(),
                    requestDTO.getPassword()
            );
            response.setUserId(user.getId());
            response.setResponseStatus(ResponseStatus.SUCCESS);

        } catch (Exception ex){
            response.setResponseStatus(ResponseStatus.FAILURE);
            response.setMessage(ex.getMessage());
        }
        return response;
    }
}
