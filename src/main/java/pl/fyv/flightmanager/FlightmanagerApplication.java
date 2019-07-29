package pl.fyv.flightmanager;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.data.convert.JodaTimeConverters;
import pl.fyv.flightmanager.controller.FlightController;
import pl.fyv.flightmanager.model.Client;
import pl.fyv.flightmanager.model.Flight;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class FlightmanagerApplication {


    public static void main(String[] args) {
        SpringApplication.run(FlightmanagerApplication.class, args);
        System.out.println(org.hibernate.Version.getVersionString());
    }

//
//    @EventListener(ApplicationReadyEvent.class)
//    public void dbInit() {
//        LocalDateTime departure = new LocalDateTime(2019,7,23,6,20);
//        LocalDateTime arrival = new LocalDateTime(2019,8,26,9,20);
//        LocalDate birthday = new LocalDate(1997,12,19);
//
//        List<Flight> flist = new ArrayList<>();
//        List<Client> clist = new ArrayList<>();
//
//        Flight f = new Flight("Kraków", "Berlin", departure, arrival, 23, clist, 140.00d);
//        flist.add(f);
//        Client c = new Client("Grzegorz", "Nowak", "M", "Poland", null, birthday, flist);
//        clist.add(c);
//        Flight f2 = new Flight("Berlin", "Kraków", departure, arrival, 64, clist, 120.00d);
//        flist.add(f);
//
//
//    }
}
