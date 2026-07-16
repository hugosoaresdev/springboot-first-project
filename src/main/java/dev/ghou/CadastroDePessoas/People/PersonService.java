package dev.ghou.CadastroDePessoas.People;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonService {

    private PersonRepository personRepository;
    private PersonMapper personMapper;

    public PersonService(PersonRepository personRepository, PersonMapper personMapper) {
        this.personRepository = personRepository;
        this.personMapper = personMapper;
    }

    public PersonDTO adicionarPessoa(PersonDTO personDTO){
        PersonModel person = personMapper.map(personDTO);
        person = personRepository.save(person);
        return personMapper.map(person);
    }

    public PersonDTO alterarPessoa(Long id, PersonDTO pessoaAtualizada){
        PersonModel person = personMapper.map(pessoaAtualizada);
        if(personRepository.existsById(id)){
            pessoaAtualizada.setId(id);
            person = personRepository.save(person);
            return personMapper.map(person);
        } else{
            return null;
        }
    }

    public PersonModel mostrarPessoa(Long id){
        Optional<PersonModel> personModel= personRepository.findById(id);
        return personModel.orElse(null);
    }

    public List<PersonModel> mostrarPessoas(){
        return personRepository.findAll();
    }

    public void deletarPessoa(Long id){
           personRepository.deleteById(id);
    }
}
