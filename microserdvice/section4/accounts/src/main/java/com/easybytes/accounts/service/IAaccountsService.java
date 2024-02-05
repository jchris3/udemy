package com.easybytes.accounts.service;

import com.easybytes.accounts.dto.AccountsDto;
import com.easybytes.accounts.dto.CustomerDto;

public interface IAaccountsService {

    void createAccount(CustomerDto customerDto);
    CustomerDto fecthAccount(String mobileNumber);
    boolean updateAccount(CustomerDto customerDto);
    boolean deleteteAccount(String numberMobile);

}
