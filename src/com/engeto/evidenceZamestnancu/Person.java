package com.engeto.evidenceZamestnancu;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Person {
    private int ID;
    private String name;
    private String surname;
    private BigDecimal account;
    private boolean isEmployee;
    private int tickets;
    private LocalDate lastArrival;
    private double bodyTemperature;

    public Person(int ID, String name, String surname, BigDecimal account, boolean isEmployee, int tickets) {
        this.ID = ID;
        this.name = name;
        this.surname = surname;
        this.account = account;
        this.isEmployee = isEmployee;
        this.tickets = tickets;
        this.lastArrival = LocalDate.now();
        this.bodyTemperature = -300;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public BigDecimal getAccount() {
        return account;
    }

    public void setAccount(BigDecimal account) {
        this.account = account;
    }

    public boolean isEmployee() {
        return isEmployee;
    }

    public void setEmployee(boolean employee) {
        isEmployee = employee;
    }

    public int getTickets() {
        return tickets;
    }

    public void setTickets(int tickets) {
        this.tickets = tickets;
    }

    public LocalDate getLastArrival() {
        return lastArrival;
    }

    public void setLastArrival(LocalDate lastArrival) {
        this.lastArrival = lastArrival;
    }

    public double getBodyTemperature() {
        return bodyTemperature;
    }

    public void setBodyTemperature(double bodyTemperature) {
        this.bodyTemperature = bodyTemperature;
    }
}