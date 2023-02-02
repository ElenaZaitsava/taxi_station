package by.car.taxi_station.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "cars")
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;

    private Long price;

    private String number;

    private Integer speed;

    private Integer fuel;

    @ManyToMany

    private List<Driver> driver;
}
