package dev.ghou.CadastroDePessoas.Trip;

import dev.ghou.CadastroDePessoas.People.PersonModel;
import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.List;

@Entity
@Table(name = "tb_trips")
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

    public Long getId() {
        return id;
    }

    public String getTrip() {
        return trip;
    }

    public void setTrip(String trip) {
        this.trip = trip;
    }

    public BigDecimal getCost() {
        return cost;
    }

    public void setCost(BigDecimal cost) {
        this.cost = cost;
    }

    public String getPerson() {
        return person;
    }

    public void setPerson(String person) {
        this.person = person;
    }
}
