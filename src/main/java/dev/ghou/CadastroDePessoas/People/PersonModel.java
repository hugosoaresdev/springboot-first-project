package dev.ghou.CadastroDePessoas.People;

import dev.ghou.CadastroDePessoas.Trip.TripModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tb_registration") //tabela_cadastro
@NoArgsConstructor
@Data
public class PersonModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "id")
    private Long id;

    @Column (name = "name")
    private String name;

    @Column (name = "age")
    private int age;

    @Column(unique = true)
    private String email;

    //Many pessoas to one viagem. Um objeto PersonModel tem uma única viagem
    @ManyToOne
    @JoinColumn(name = "trips_id") //Foreing key/ chave estrangeira
    private TripModel trip;

    public PersonModel(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }
}
