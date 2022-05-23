package com.bnta.banking_api.components;

import com.bnta.banking_api.models.AccountHolder;
import com.bnta.banking_api.models.BasicAccount;
import com.bnta.banking_api.models.Employment;
import com.bnta.banking_api.models.JointAccount;

import java.time.LocalDate;
import java.util.Arrays;

public class DataLoader {

    AccountHolder ah1 = new AccountHolder("kim", LocalDate.of(1997,4, 3), "xx street", Employment.STUDENT);
    JointAccount ja1 = new JointAccount(true, 2000, "123456", "0423", "393", "3738", "friends", Arrays.asList(ah1));

}
