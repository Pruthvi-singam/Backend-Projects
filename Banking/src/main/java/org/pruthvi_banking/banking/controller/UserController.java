package org.pruthvi_banking.banking.controller;


import org.pruthvi_banking.banking.dto.BankResponse;
import org.pruthvi_banking.banking.dto.UserRequest;
import org.pruthvi_banking.banking.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    UserService userService;
    @PostMapping("/create")
    public BankResponse createAccount(@RequestBody UserRequest userRequest) {
        return  userService.createAccount(userRequest);
    }

}
