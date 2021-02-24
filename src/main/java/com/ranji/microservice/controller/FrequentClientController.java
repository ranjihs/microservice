package com.ranji.microservice.controller;

import com.github.javafaker.Faker;
import com.ranji.microservice.model.FrequentClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.UUID;

@RestController
@RequestMapping("freqcli")
public class FrequentClientController {

    private int[] createArray (int n) {
        int[] arrInt = new int[n];
        for (int x = 0; x < n; x++) {
            arrInt[x] = x;
        }
        return arrInt;
    }

    @GetMapping
    public List<FrequentClient> getAll() {
        ArrayList<FrequentClient> returnValue = new ArrayList<>();

        for (int z : createArray(10)) {
            returnValue.add(new FrequentClient(
                    UUID.randomUUID().toString(),
                    Faker.instance().address().firstName(),
                    Faker.instance().address().lastName(),
                    (z%2) +1
            ));
        }

        return returnValue;
    }

}
