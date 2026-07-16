package dev.ghou.CadastroDePessoas.People;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping
public class  PersonController {

    private PersonService personService;

    public PersonController(PersonService personService){
        this.personService = personService;
    }

    @GetMapping("/hello")
    public String helloWorld(){
        return "Te amo bem";
    }

    // Adicionar Pessoa (Create)
    @PostMapping("/adicionar")
    public PersonModel adicionarPessoa(@RequestBody PersonModel person){
        return personService.adicionarPessoa(person);
    }

    // Mostrar Pessoa por ID (Read)
    @GetMapping("/mostrarPessoa/{id}")
    public PersonModel mostrarPessoa(@PathVariable Long id){
        return personService.mostrarPessoa(id);
    }

    // Mostrar todas as Pessoas (Read)
    @GetMapping("/mostrarPessoas")
    public List<PersonModel> mostrarTodos() {
        return personService.mostrarPessoas();
    }

    // Alterar dados das Pessoas (Update)
    @PutMapping("/alterar/{id}")
    public PersonModel alterarPessoa(@PathVariable Long id, @RequestBody PersonModel pessoaAtualizada){
        return personService.alterarPessoa(id, pessoaAtualizada);
    }

    // Deletar Pessoa (Delete)
    @DeleteMapping("/deletar/{id}")
    public void deletarPessoa(@PathVariable Long id) {
        personService.deletarPessoa(id);
    }
}
