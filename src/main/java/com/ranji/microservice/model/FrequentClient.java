package com.ranji.microservice.model;

public class FrequentClient {

    public String idClient;
    public String name;
    public String lastName;
    public Integer discountType;

    public FrequentClient() {
    }

    public FrequentClient(String idClient, String name, String lastName, Integer discountType) {
        this.idClient = idClient;
        this.name = name;
        this.lastName = lastName;
        this.discountType = discountType;
    }
}
