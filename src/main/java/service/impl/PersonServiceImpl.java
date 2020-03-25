package service.impl;

import data.FileData;
import exceptions.PersonException;
import model.Bank;
import model.Person;
import service.PersonService;

import java.util.List;

public class PersonServiceImpl implements PersonService {

    private FileData fileData = new FileData();

    /**
     *
     * @param person
     * @throws PersonException
     */
    @Override
    public void savePerson(Person person) throws PersonException {
        Bank bank = FileData.bank;
        bank.getPersonList().add(person);
        fileData.saveFile(bank);
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
        return FileData.bank.getPersonList();
    }
}
