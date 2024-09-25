package org.engineerscodes.app.jpa;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table
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
