package pl.fyv.flightmanager;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import pl.fyv.flightmanager.model.Car;
import pl.fyv.flightmanager.repository.CarRepo;

@RunWith(SpringRunner.class)
@DataJpaTest
public class CarRepoTest {

    @MockBean
    private CarRepo repo;

    @Test
    public void checkIfRepoSavesObjects() throws Exception {
        Car car = new Car(10L, "Volvo", 200000);

        repo.save(car);

        Assert.assertNotNull(repo);
    }

}