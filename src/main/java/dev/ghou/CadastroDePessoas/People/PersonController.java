package dev.ghou.CadastroDePessoas.People;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class PersonController {

    @GetMapping("/hello")
    public String helloWorld(){
        return "Te amo bem";
    }

    // Adicionar Pessoa (Create)
    @PostMapping("/add")
    public String addPessoa(){
        return "Pessoa adicionada";
    }

    // Mostrar Pessoa por ID (Read)
    @GetMapping("/mostrarPessoa")
    public String mostrarPessoa(){
        return "Mostrar Pessoa por ID";
    }

    // Mostrar todas as Pessoas (Read)
    @GetMapping("/mostrarTodos")
    public String mostrarTodos() {
        return "Mostrar todas as Pessoas";
    }

    // Alterar dados das Pessoas (Update)
    @PutMapping("/alterar")
    public String alterarPessoa(){
        return "Pessoa Alterada ID";
    }

    // Deletar Pessoa (Delete)
    @DeleteMapping("/deletar")
    public String deletarPessoa() {
        return "Pessoa Deletada por ID";
    }
}
