package pl.fyv.flightmanager.model;

public class PeselValidator {

    public static boolean isCorrect(String Pesel) {
        containsDigits(Pesel);
        Length(Pesel);
        return true;
    }

    private static void containsDigits(String pesel) {

        char[] peselAr = pesel.toCharArray();
        for (char c : peselAr)
            if ((int) c < 48 || (int) c > 57)
                throw new IllegalArgumentException("Podano litere zamiast cyfry");

    }

    private static void Length(String pesel) {
        if (String.valueOf(pesel).length() != 11) {
            throw new IllegalArgumentException("PESEL musi zawierac 11 liczb");
        }
    }
}
