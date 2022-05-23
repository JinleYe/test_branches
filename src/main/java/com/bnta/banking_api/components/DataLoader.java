package com.bnta.banking_api.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


public class DataLoader {


    AccountHolder ah1 = new AccountHolder("kim", LocalDate.of(1997,4, 3), "xx street", Employment.STUDENT);
    JointAccount ja1 = new JointAccount(true, 2000, "123456", "0423", "393", "3738", "friends", Arrays.asList(ah1));
    AccountHolder ah4 = new AccountHolder("kim", LocalDate.of(1997,4, 3), "xx street", Employment.STUDENT);
    JointAccount ja2 = new JointAccount(true, 2000, "123456", "0423", "393", "3738", "friends", Arrays.asList(ah1));

    AccountHolder ah2 = new AccountHolder("kim", LocalDate.of(1998, 05,03), "xx street", Employment.FULL_TIME);
    BasicAccount ba1 = new BasicAccount(true, 1000, "123422", "2342", "343", "2345", ah2);
    AccountHolder ah3 = new AccountHolder("kim", LocalDate.of(1998, 05,03), "xx street", Employment.FULL_TIME);
    BasicAccount ba2 = new BasicAccount(true, 1000, "123422", "2342", "343", "2345", ah2);





}
