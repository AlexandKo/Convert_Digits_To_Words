package prescription.rules;

import org.junit.jupiter.api.Test;
import prescription.Prescription;
import prescription.digits.Languages;

import static org.junit.jupiter.api.Assertions.*;

class RuleThreeDigitsTest {
    private final Prescription prescription = new Prescription();

    @Test
    public void convertOneHundred_En() {
        String result = prescription.convertToWords("100", Languages.ENG);

        assertEquals("one hundred ", result);
    }

    @Test
    public void convertFiveHundredNinetyThree_En() {
        String result = prescription.convertToWords("593", Languages.ENG);

        assertEquals("five hundred ninety three ", result);
    }

    @Test
    public void convertEightHundredTen_En() {
        String result = prescription.convertToWords("810", Languages.ENG);

        assertEquals("eight hundred ten ", result);
    }

    @Test
    public void convertNineHundredNinetyNine_En() {
        String result = prescription.convertToWords("999", Languages.ENG);

        assertEquals("nine hundred ninety nine ", result);
    }

    @Test
    public void convertOneHundred_Lv() {
        String result = prescription.convertToWords("100", Languages.LAT);

        assertEquals("viens simts ", result);
    }

    @Test
    public void convertTwoHundredTwentyTwo_Lv() {
        String result = prescription.convertToWords("222", Languages.LAT);

        assertEquals("divi simti divdesmit divi ", result);
    }

    @Test
    public void convertFiveHundredFifty_Lv() {
        String result = prescription.convertToWords("550", Languages.LAT);

        assertEquals("pieci simti piecdesmit ", result);
    }
}