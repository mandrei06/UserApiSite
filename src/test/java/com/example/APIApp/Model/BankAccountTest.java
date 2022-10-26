package com.example.APIApp.Model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {

    BankAccount bankAccount;

    @BeforeEach
    public void initialize(){
        bankAccount=new BankAccount();
        bankAccount.setId(1);
        bankAccount.setBankName("BBVA");
        bankAccount.setIban("123...16");
        bankAccount.setSold("39$");

    }

    @Test
    void getId() {
        Assertions.assertEquals(bankAccount.getId(),1);
    }

    @Test
    void setId() {
        bankAccount.setId(2);
        Assertions.assertEquals(bankAccount.getId(),2);
    }

    @Test
    void getBankName() {
        Assertions.assertEquals(bankAccount.getBankName(),"BBVA");

    }

    @Test
    void setBankName() {
        bankAccount.setBankName("Revolut");
        Assertions.assertEquals(bankAccount.getBankName(),"Revolut");
    }

    @Test
    void getIban() {
        Assertions.assertEquals(bankAccount.getIban(),"123...16");

    }

    @Test
    void setIban() {
        bankAccount.setIban("123...15");
        Assertions.assertEquals(bankAccount.getIban(),"123...15");
    }

    @Test
    void getSold() {
        Assertions.assertEquals(bankAccount.getSold(),"39$");

    }

    @Test
    void setSold() {
        bankAccount.setSold("40$");
        Assertions.assertEquals(bankAccount.getSold(),"40$");
    }
}