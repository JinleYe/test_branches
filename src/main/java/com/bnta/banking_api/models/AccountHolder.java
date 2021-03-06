package com.bnta.banking_api.models;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "account_holders")
public class AccountHolder{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

    @Column
    private LocalDate dob;

    @Column
    private String address;

    @Column
    private Employment employment_status;

    @OneToMany(mappedBy = "accountHolder")
    private List<BasicAccount> accounts;

//    DEFAULT CONSTRUCTOR
    protected AccountHolder(){}

//    CONSTRUCTOR
    public AccountHolder(String name, LocalDate dob, String address, Employment employment_status) {
//        this.id = id;
        this.name = name;
        this.dob = dob;
        this.address = address;
        this.employment_status = employment_status;
        this.accounts = new ArrayList<>();
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Employment getEmployment_status() {
        return employment_status;
    }

    public void setEmployment_status(Employment employment_status) {
        this.employment_status = employment_status;
    }

    public List<BasicAccount> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<BasicAccount> accounts) {
        this.accounts = accounts;
    }

    public void addAccounts(BasicAccount account){
        this.accounts.add(account);
    }

    public void removeAccount(BasicAccount account){
        this.accounts.remove(account);
    }

}
