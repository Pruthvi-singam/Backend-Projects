package org.pruthvi_banking.banking.service;

import org.pruthvi_banking.banking.dto.AccountInfo;
import org.pruthvi_banking.banking.dto.BankResponse;
import org.pruthvi_banking.banking.dto.UserRequest;
import org.pruthvi_banking.banking.entity.User;
import org.pruthvi_banking.banking.repository.UserRepository;
import org.pruthvi_banking.banking.utils.AccountUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public BankResponse createAccount(UserRequest userRequest) {
        try {
            System.out.println("Creating account for: " + userRequest.toString());

            // Check if user already exists
            if (userRepository.existsByEmail(userRequest.getEmail())) {
                BankResponse response = new BankResponse();
                response.setResponseCode(AccountUtils.Exists_User_Code);
                response.setResponseMessage(AccountUtils.Exists_User_Message);
                response.setAccountInfo(null);
                return response;
            }

            // Creating new user
            User newUser = new User();
            newUser.setFirstName(userRequest.getFirstName());
            newUser.setLastName(userRequest.getLastName());
            newUser.setOtherName(userRequest.getOtherName());
            newUser.setGender(userRequest.getGender());
            newUser.setAddress(userRequest.getAddress());
            newUser.setStateOfOrigin(userRequest.getStateOfOrigin());
            newUser.setAccountNumber(AccountUtils.generateAccountNumber());
            newUser.setEmail(userRequest.getEmail());
            newUser.setAccountBalance(BigDecimal.ZERO);
            newUser.setPhoneNumber(userRequest.getPhoneNumber());
            newUser.setAlternativePhoneNumber(userRequest.getAlternativePhoneNumber());
            newUser.setStatus("ACTIVE");

            // Saving user in the database
            User savedUser = userRepository.save(newUser);

            // Creating AccountInfo
            AccountInfo accountInfo = new AccountInfo();
            accountInfo.setAccountNumber(savedUser.getAccountNumber());
            accountInfo.setAccountName(savedUser.getFirstName() + " " + savedUser.getLastName());

            // Creating BankResponse
            BankResponse response = new BankResponse();
            response.setResponseCode(AccountUtils.Account_Create_User_Code);
            response.setResponseMessage(AccountUtils.Account_Create_User_Message);
            response.setAccountInfo(accountInfo);

            return response;

        } catch (Exception e) {
            // Log the error (replace with a logger in a real project)
            System.err.println("Error creating user account: " + e.getMessage());

            BankResponse response = new BankResponse();
            response.setResponseCode("500");
            response.setResponseMessage("An error occurred while creating the account. Please try again.");
            response.setAccountInfo(null);
            return response;
        }
    }
}