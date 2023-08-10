package com.example.mockitotests.service;


import com.example.mockitotests.dao.PersonDAO;
import com.example.mockitotests.domain.Person;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class PersonServiceTest {
    private PersonDAO mockPersonDAO = mock(PersonDAO.class);
    private PersonService personService = new PersonService(mockPersonDAO);

    @Test
    public void shouldCreatePerson() {
        Person person = getDummyPerson();

        when(mockPersonDAO.createPerson(person)).thenReturn(111);

        Integer personId = personService.createPerson(person);

        assertThat(personId).isEqualTo(111);
    }

    private Person getDummyPerson() {
        Person person = new Person();
        person.setFirstName("testFirstName");
        person.setLastName("testLastName");
        return person;
    }

}