package dev.ghou.CadastroDePessoas.People;

import dev.ghou.CadastroDePessoas.Trip.TripModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PersonDTO {
    private Long id;
    private String name;
    private int age;
    private String email;
    private TripModel trip;
}
