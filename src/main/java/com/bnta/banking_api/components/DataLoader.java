package com.bnta.banking_api.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


public class DataLoader {


    AccountHolder ah2 = new AccountHolder("kim", LocalDate.of(1998, 05,03), "xx street", Employment.FULL_TIME);
    BasicAccount ba1 = new BasicAccount(true, 1000, "123422", "2342", "343", "2345", ah2);




}
