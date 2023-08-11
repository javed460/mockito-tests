package com.example.mockitotests.dao;

import com.example.mockitotests.domain.Person;
import org.springframework.stereotype.Repository;

import java.util.Random;

@Repository
public class PersonDAO {

    public Integer createPerson(Person person) {
        Random random = new Random();
        return random.nextInt();
    }

    public void updatePerson(Person person) {

    }
}
