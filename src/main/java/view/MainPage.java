package view;


import exceptions.PersonException;
import model.Person;
import service.PersonService;
import service.impl.PersonServiceImpl;

public class MainPage {

    private PersonService personService = new PersonServiceImpl();
    /**
     *
     */
    public void init(){
        //menu options
        Person person = new Person("Java");
        person.setId(123);

        try {

            personService.savePerson(person);

        } catch (PersonException e) {
            e.printStackTrace();
        }


        try {

            person.setActive(false);
            personService.inactivePerson(person);

        } catch (PersonException e) {
            e.printStackTrace();
        }



    }
}
