package pl.fyv.flightmanager.model;

public class ZipCodeValidator {
    public static boolean isCorrect(String zipcode) {
        if(zipcode.isEmpty()) return false;
        if(zipcode.length() != 6) return false;

        for(int i = 0; i < 6; i++){
            if(i == 2){
                if(zipcode.charAt(i) != '-') return false;
            }else{
                if(!Character.isDigit(zipcode.charAt(i))) return false;
            }
        }
        return true;
    }
}
