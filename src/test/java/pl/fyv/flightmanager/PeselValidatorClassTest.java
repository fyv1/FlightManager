package pl.fyv.flightmanager;

import org.junit.Assert;
import org.junit.Test;
import pl.fyv.flightmanager.model.PeselValidator;

import static org.junit.Assert.assertThrows;


public class PeselValidatorClassTest {

    @Test
    public void peselTooLong_ThrowsException() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> PeselValidator.isCorrect("123123123123123"));

        Assert.assertEquals("PESEL musi zawierac 11 liczb",exception.getMessage());
    }

    @Test
    public void peselHasLetter_ThrowsException() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> PeselValidator.isCorrect("123123123asd"));

        Assert.assertEquals("Podano litere zamiast cyfry",exception.getMessage());
    }
}
