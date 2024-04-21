package guru.springframework.petclinic.model;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Setter
@Getter
public class Pet {

    private PetType petType;
    private Owner owner;
    private LocalDate birthDate;

}
