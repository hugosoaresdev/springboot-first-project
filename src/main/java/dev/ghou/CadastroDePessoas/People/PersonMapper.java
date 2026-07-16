package dev.ghou.CadastroDePessoas.People;

import org.springframework.stereotype.Component;

@Component
public class PersonMapper {

    public PersonModel map(PersonDTO personDTO){
        PersonModel person = new PersonModel();
        person.setId(personDTO.getId());
        person.setAge(personDTO.getAge());
        person.setEmail(personDTO.getEmail());
        person.setName(personDTO.getName());
        person.setTrip(personDTO.getTrip());

        return person;
    }

    public PersonDTO map(PersonModel personModel){
        PersonDTO person = new PersonDTO();
        person.setId(personModel.getId());
        person.setAge(personModel.getAge());
        person.setEmail(personModel.getEmail());
        person.setName(personModel.getName());
        person.setTrip(personModel.getTrip());

        return person;
    }
}
