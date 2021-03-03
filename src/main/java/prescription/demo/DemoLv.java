package prescription.demo;

import prescription.Prescription;
import prescription.digits.Languages;

import java.util.Random;

public class DemoLv {
    public static void main(String[] args) {
        Prescription prescription = new Prescription();

        for (int i = 0; i <= 30; i++) {
            int randomValue = new Random().nextInt(999999);
            String result = prescription.convertToWords(String.valueOf(randomValue), Languages.LAT);
            System.out.println("Digit [" + randomValue + "] - " + result);
        }
    }
}