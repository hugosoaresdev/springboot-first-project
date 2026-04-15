package dev.ghou.CadastroDePessoas.Trip;

import dev.ghou.CadastroDePessoas.People.PersonModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.List;

@Entity
@Table(name = "tb_trips")
@NoArgsConstructor
@Data
public class TripModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String trip;
    private BigDecimal cost;
    private String person;

    //Uma Viagem pode ter várias pessoas
    @OneToMany(mappedBy = "trip")
    private List<PersonModel> people;

    public TripModel(String trip, BigDecimal cost, String person) {
        this.trip = trip;
        this.cost = cost;
        this.person = person;
    }
}
