package com.engeto.evidenceZamestnancu;

import java.util.ArrayList;
import java.util.List;

public class TimeClocksWorker {

    private List<Person> personList = new ArrayList<>();

    //Metody pro přidání osob do seznamu

    public void add(Person newPerson) {
        personList.add(newPerson);
    }

    public void addList(List<Person> list) {
        personList.addAll(list);
    }

    //Metoda pro získání počtu osob

    public int getNumberOfPersons() {
        return personList.size();
    }

    //Metoda pro získání počtu hostů

    public int getNumberOfGuests() {
        int numberOfGuests = 0;
        for (Person person : personList) {
            if (!person.isEmployee()) {
                numberOfGuests++;
            }
        }
        return numberOfGuests;
    }

    //Metoda pro získání počtu ticketů na osobu

    public int getNumberOfTicketsPerPerson() {
        int numberOfTickets = 0;
        for (Person person : personList) {
            numberOfTickets += person.getTickets();
        }
        return numberOfTickets / getNumberOfPersons();
    }

    //Metoda pro získání první osoby s tickety nad limit

    public Person getFirstPersonWithTicketsOverLimit(int limit) {
        for (Person person : personList) {
            if (person.getTickets() > limit) {
                return person;
            }
        }
        return null;
    }

}
