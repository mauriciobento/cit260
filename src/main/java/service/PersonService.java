package service;


import exceptions.PersonException;
import model.Person;

import java.util.List;

public interface PersonService {

    /**
     *
     * @param person
     * @throws PersonException
     */
    void savePerson(Person person) throws PersonException;

    /**
     *
     * @param person
     * @throws PersonException
     */
    void updatePerson(Person person) throws PersonException;

    /**
     *
     * @param person
     * @throws PersonException
     */
    void inactivePerson(Person person) throws PersonException;

    /**
     *
     * @param person
     * @return
     * @throws PersonException
     */
    Person findPerson(Person person) throws PersonException;

    /**
     *
     * @return
     * @throws PersonException
     */
    List<Person> findAllPerson() throws PersonException;
}
