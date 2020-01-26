package pl.fyv.flightmanager.model;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "booking")
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private long itemId;
    private long clientId;
    private String status;
    private LocalDateTime arrive;
    private LocalDateTime departure;

    public Booking() {
    }

    public Booking(long id, long itemId, long clientId, String status, LocalDateTime arrive, LocalDateTime departure) {
        this.id = id;
        this.itemId = itemId;
        this.clientId = clientId;
        this.status = status;
        this.arrive = arrive;
        this.departure = departure;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getItemId() {
        return itemId;
    }

    public void setItemId(long bookingId) {
        this.itemId = bookingId;
    }

    public long getClientId() {
        return clientId;
    }

    public void setClientId(long clientId) {
        this.clientId = clientId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDateTime getArrive() {
        return arrive;
    }

    public void setArrive(LocalDateTime arrive) {
        this.arrive = arrive;
    }

    public LocalDateTime getDeparture() {
        return departure;
    }

    public void setDeparture(LocalDateTime departure) {
        this.departure = departure;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "id=" + id +
                ", hotelId=" + itemId +
                ", clientId=" + clientId +
                ", status='" + status + '\'' +
                ", arrive=" + arrive +
                ", departure=" + departure +
                '}';
    }
}

