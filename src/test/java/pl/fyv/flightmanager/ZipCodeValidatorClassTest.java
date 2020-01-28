package pl.fyv.flightmanager;

import org.junit.Assert;
import org.junit.Test;
import pl.fyv.flightmanager.model.ZipCodeValidator;


public class ZipCodeValidatorClassTest {

    @Test
    public void zipCodeEmpty_ReturnsFalse() {
        boolean result = ZipCodeValidator.isCorrect("");

        Assert.assertFalse(result);
    }
    @Test
    public void zipCodeWrongLength_ReturnsFalse() {
        boolean result = ZipCodeValidator.isCorrect("123");

        Assert.assertFalse(result);
    }
    @Test
    public void zipCodeThirdCharacterIsNotAMinus_ReturnsFalse() {
        boolean result = ZipCodeValidator.isCorrect("123123");

        Assert.assertFalse(result);
    }
    @Test
    public void zipCodeCharacterIsNotAdigit_ReturnsFalse() {
        boolean result = ZipCodeValidator.isCorrect("12-a23");

        Assert.assertFalse(result);
    }
}
