package dev.ghou.CadastroDePessoas.People;

import dev.ghou.CadastroDePessoas.Trip.TripModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<PersonModel, Long> {
}