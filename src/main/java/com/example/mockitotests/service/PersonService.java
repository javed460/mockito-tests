package com.example.mockitotests.service;

import com.example.mockitotests.dao.PersonDAO;
import com.example.mockitotests.domain.Person;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PersonService {
    private final PersonDAO personDAO;

    public Integer createPerson(Person person) {
        return personDAO.createPerson(person);
    }

    public void updatePerson(Person person) {
        personDAO.updatePerson(person);
    }
}
