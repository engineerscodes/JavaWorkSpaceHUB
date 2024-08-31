package org.engineerscodes.app;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class millions {

    @Id
    Long id;

    String name;

    String location;

    String cat;

    Integer value;

}
