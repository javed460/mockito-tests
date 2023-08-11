package com.example.mockitotests.service;


import com.example.mockitotests.dao.PersonDAO;
import com.example.mockitotests.domain.Person;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

class PersonServiceTest {
    private PersonDAO mockPersonDAO = mock(PersonDAO.class);
    private PersonService personService = new PersonService(mockPersonDAO);
    private Person person;

    @BeforeEach
    public void setUp() {
        person = getDummyPerson();
    }

    @Test
    public void shouldCreatePerson() {
        when(mockPersonDAO.createPerson(person)).thenReturn(111);

        Integer personId = personService.createPerson(person);

        assertThat(personId).isEqualTo(111);
    }

    @Test
    public void shouldUpdatePerson() {
        personService.updatePerson(person);
        verify(mockPersonDAO, times(1)).updatePerson(person);
    }

    private Person getDummyPerson() {
        Person person = new Person();
        person.setFirstName("testFirstName");
        person.setLastName("testLastName");
        return person;
    }

}