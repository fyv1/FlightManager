package pl.fyv.flightmanager.model;

public class PeselValidator {
    private String Pesel;

    PeselValidator(String Pesel) {
        this.Pesel = Pesel;
    }

    public String getPesel() {
        return Pesel;
    }
    public boolean isCorrect(String Pesel) {

        try {
            containsDigits(Pesel);
            Length(Pesel);
        } catch (IllegalArgumentException ex) {
            ex.printStackTrace();
            return false;
        }
        return true;
    }

    private void containsDigits(String pesel) {

        char[] peselAr = pesel.toCharArray();
        for (char c : peselAr)
            if ((int) c < 48 || (int) c > 57)
                throw new IllegalArgumentException("Podano litere zamiast cyfry");

    }

    private void Length(String pesel) {
        if (String.valueOf(pesel).length() != 11) {
            throw new IllegalArgumentException("PESEL musi zawierac 11 liczb");
        }
    }
}
