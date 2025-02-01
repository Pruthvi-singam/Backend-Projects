package org.pruthvi_banking.banking.service;

import org.pruthvi_banking.banking.dto.BankResponse;
import org.pruthvi_banking.banking.dto.UserRequest;

public interface UserService {
    BankResponse createAccount(UserRequest userRequest);
}
