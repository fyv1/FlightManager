package pl.fyv.flightmanager.model;

import javax.persistence.*;


@Entity
@Table(name = "hotel")
public class Hotel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    private String address;

    public Hotel() {

    }
}
