package pl.fyv.flightmanager.model;

public class ZipCodeValidator {
    public ZipCodeValidator() {
    }

    public boolean isCorrect(String zipcode) {
        if(zipcode.isEmpty()) return false;
        if(zipcode.length() != 6) return false;
        else
            for(int i=0; i<6;i++)
                if(Character.isDigit(zipcode.charAt(i)))
                    if(zipcode.charAt(2) != '-') return false;
                        return true;

    }
}
