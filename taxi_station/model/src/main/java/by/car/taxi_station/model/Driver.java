package by.car.taxi_station.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.*;
import java.util.List;

@Setter
@Getter
@Entity
@Table(name = "drivers")

public class Driver {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)


    private Long id;

    private String name;

    private String surname;

    @OneToOne(cascade = CascadeType.ALL)

    private Passport passport;

    private String DriveDocumentNumber;

    @OneToMany

    private List<Car> car;


}
