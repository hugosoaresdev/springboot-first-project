package dev.ghou.CadastroDePessoas.People;

import dev.ghou.CadastroDePessoas.Trip.TripModel;
import jakarta.persistence.*;

@Entity
@Table(name = "tb_registration") //tabela_cadastro
public class PersonModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private int age;
    private String email;

    //Many pessoas to one viagem. Um objeto PersonModel tem uma única viagem
    @ManyToOne
    @JoinColumn(name = "trips_id") //Foreing key/ chave estrangeira
    private TripModel trip;

    public PersonModel() {
    }

    public PersonModel(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }


    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
