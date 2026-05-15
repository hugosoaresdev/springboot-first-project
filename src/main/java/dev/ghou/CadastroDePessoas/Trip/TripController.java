package dev.ghou.CadastroDePessoas.Trip;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("trips")
public class TripController {

    // GET -- Manda uam requisição para mostra uma viagem
    @GetMapping("/mostrar")
    public String mostrarViagem(){
        return "Viagem";
    }

    @GetMapping("/mostrarTodas")
    public String mostrarViagens(){
        return "Viagens";
    }

    // POST -- Manda uma requisição para criar uma viagem
    // localhost8080:/trips/criar
    @PostMapping("/criar")
    public String criarViagem(){
        return "Viagem Criada";
    }

    // PUT -- Manda uma requisição para alterar uma viagem
    @PutMapping("/alterar")
    public String alteraViagem(){
        return "Viagem Alterada";
    }

    // DELETE -- Manda uma requisição para deletar uma viagem
    @DeleteMapping("/deletar")
    public String deletaViagem(){
        return "Viagem deletada";
    }
}
