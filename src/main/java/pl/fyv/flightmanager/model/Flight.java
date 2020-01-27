package pl.fyv.flightmanager.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;


import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name="flight")
public class Flight {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String departurePlace;
    private String arrivalPlace;

    private LocalDateTime departureTime;
    private LocalDateTime arrivalTime;
    private int freeSeats;

    @ManyToMany(mappedBy = "flightList")
    @Fetch(FetchMode.JOIN)
    @JsonFormat(with = JsonFormat.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY)
    private List<Client> clientList;

    private double price;

    public Flight() {
    }

    public Flight(String departurePlace, String arrivalPlace, LocalDateTime departureTime, LocalDateTime arrivalTime, int freeSeats, List<Client> clientList, double price) {
        this.departurePlace = departurePlace;
        this.arrivalPlace = arrivalPlace;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
        this.freeSeats = freeSeats;
        this.clientList = clientList;
        this.price = price;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDeparturePlace() {
        return departurePlace;
    }

    public void setDeparturePlace(String departurePlace) {
        this.departurePlace = departurePlace;
    }

    public String getArrivalPlace() {
        return arrivalPlace;
    }

    public void setArrivalPlace(String arrivalPlace) {
        this.arrivalPlace = arrivalPlace;
    }

    public LocalDateTime getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(LocalDateTime departureTime) {
        this.departureTime = departureTime;
    }

    public LocalDateTime getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(LocalDateTime arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public int getFreeSeats() {
        return freeSeats;
    }

    public void setFreeSeats(int freeSeats) {
        this.freeSeats = freeSeats;
    }

    public List<Client> getClientList() {
        return clientList;
    }

    public void setClientList(List<Client> clientList) {
        this.clientList = clientList;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "id=" + id +
                ", departurePlace='" + departurePlace + '\'' +
                ", arrivalPlace='" + arrivalPlace + '\'' +
                ", departureTime=" + departureTime +
                ", arrivalTime=" + arrivalTime +
                ", freeSeats=" + freeSeats +
                ", clientList=" + clientList +
                ", price=" + price +
                '}';
    }
}
