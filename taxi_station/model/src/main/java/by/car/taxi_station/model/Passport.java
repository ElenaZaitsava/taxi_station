package by.car.taxi_station.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity

public class Passport {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        @Column(name ="number_uniq",length = 12)

        private String uniqNumber;

        private String passportNumber;
    }


