package by.car.taxi_station.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@Setter
@Getter

public class Driver {

    private Long id;

    private String name;

    private String surname;


}
