package com.bnta.banking_api.models;

import java.util.List;
import javax.persistence.*;

@Entity
@Table(name = "joint_accounts")
public class JointAccount extends Account{

    @Column
    private String ralationship;

    @ManyToMany//(mappedBy = "accounts")
    @JoinTable(
            name = "jointAccount_accountHolder",
            joinColumns = {@JoinColumn(name = "joint_account_id", nullable = true)},
            inverseJoinColumns = {@JoinColumn(name = "account_holder_id", nullable = true)}
    )
    private List<AccountHolder> accountHolders;

    public JointAccount(boolean isDebit, float balance, String accountNumber,
                        String expirationDate, String cvc, String pinNumber, String ralationship, List<AccountHolder> accountHolders) {

        super(isDebit, balance, accountNumber, expirationDate, cvc, pinNumber);
        this.ralationship = ralationship;
        this.accountHolders = accountHolders;
    }

    public JointAccount() {
        super();
    }

    public List<AccountHolder> getAccountHolders() {
        return accountHolders;
    }

    public void setAccountHolders(List<AccountHolder> accountHolders) {
        this.accountHolders = accountHolders;
    }


    public void addAccountHolders(AccountHolder accountHolder) {
        this.accountHolders.add(accountHolder);
    }

    public void removeAccountHolders(AccountHolder accountHolder) {
        this.accountHolders.remove(accountHolder);
    }
}
