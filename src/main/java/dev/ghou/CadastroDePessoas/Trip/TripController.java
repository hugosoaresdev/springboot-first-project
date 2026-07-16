package dev.ghou.CadastroDePessoas.Trip;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("viagem")
public class TripController {

    // GET -- Manda uam requisição para mostra uma viagem
    @GetMapping("/mostrarViagem")
    public String mostrarViagem(){
        return "Mostrar Viagem";
    }

    @GetMapping("/mostrarViagens")
    public String mostrarViagens(){
        return "Mostrar Viagens";
    }

    // POST -- Manda uma requisição para criar uma viagem
    // localhost8080:/trips/criar
    @PostMapping("/adicionar")
    public String adicionarViagem(){
        return "Viagem adicionada";
    }

    // PUT -- Manda uma requisição para alterar uma viagem
    @PutMapping("/alterar")
    public String alterarViagem(){
        return "Viagem alterada";
    }

    // DELETE -- Manda uma requisição para deletar uma viagem
    @DeleteMapping("/deletar")
    public String deletarViagem(){
        return "Viagem deletada";
    }
}
