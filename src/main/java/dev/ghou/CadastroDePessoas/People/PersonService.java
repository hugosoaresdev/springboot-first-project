package dev.ghou.CadastroDePessoas.People;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonService {

    private PersonRepository personRepository;

    public PersonService(PersonRepository personRepository){
        this.personRepository = personRepository;
    }

    public PersonModel adicionarPessoa(PersonModel person){
        return personRepository.save(person);
    }

    public PersonModel alterarPessoa(Long id, PersonModel pessoaAtualizada){
        if(personRepository.existsById(id)){
            pessoaAtualizada.setId(id);
            return personRepository.save(pessoaAtualizada);
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
