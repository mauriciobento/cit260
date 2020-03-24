package service.impl;

import exceptions.PersonException;
import model.Person;
import service.PersonService;

import java.util.List;

public class PersonServiceImpl implements PersonService {

    /**
     *
     * @param person
     * @throws PersonException
     */
    @Override
    public void savePerson(Person person) throws PersonException {

    }

    /**
     *
     * @param person
     * @throws PersonException
     */
    @Override
    public void updatePerson(Person person) throws PersonException {

    }

    /**
     *
     * @param person
     * @throws PersonException
     */
    @Override
    public void inactivePerson(Person person) throws PersonException {

    }

    /**
     *
     * @param person
     * @return
     * @throws PersonException
     */
    @Override
    public Person findPerson(Person person) throws PersonException {
        return null;
    }

    /**
     *
     * @return
     * @throws PersonException
     */
    @Override
    public List<Person> findAllPerson() throws PersonException {
        return null;
    }
}
