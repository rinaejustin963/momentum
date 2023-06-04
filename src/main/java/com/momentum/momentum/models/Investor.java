package com.momentum.momentum.models;

import javax.persistence.*;

@Entity
@Table(name = "investors")
public class Investor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int investorId;

    @Column
    private String firstname;

    @Column
    private String lastname;

    @Column
    private String dob;

    @Column
    private String address;

    @Column
    private String contact;

    @Column
    private String email;

    public Investor() {
    }

    public Investor( String firstname, String lastname, String dob, String address, String contact, String email) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.dob = dob;
        this.address = address;
        this.contact = contact;
        this.email = email;
    }

    //me

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getInvestorId() {
        return investorId;
    }

    public void setInvestorId(int investorId) {
        this.investorId = investorId;
    }
}

