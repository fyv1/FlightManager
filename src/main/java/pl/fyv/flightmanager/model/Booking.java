package pl.fyv.flightmanager.model;

import org.joda.time.DateTime;

import javax.persistence.*;

@Entity
@Table(name = "booking")
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private long bookingId;
    private long clientId;
    private String status;
    private DateTime arrive;
    private DateTime departure;

    public Booking() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getBookingId() {
        return bookingId;
    }

    public void setBookingId(long bookingId) {
        this.bookingId = bookingId;
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

    public DateTime getArrive() {
        return arrive;
    }

    public void setArrive(DateTime arrive) {
        this.arrive = arrive;
    }

    public DateTime getDeparture() {
        return departure;
    }

    public void setDeparture(DateTime departure) {
        this.departure = departure;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "id=" + id +
                ", hotelId=" + bookingId +
                ", clientId=" + clientId +
                ", status='" + status + '\'' +
                ", arrive=" + arrive +
                ", departure=" + departure +
                '}';
    }
}

