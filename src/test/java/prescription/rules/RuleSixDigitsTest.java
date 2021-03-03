package prescription.rules;

import org.junit.jupiter.api.Test;
import prescription.Prescription;
import prescription.digits.Languages;

import static org.junit.jupiter.api.Assertions.*;

class RuleSixDigitsTest {
    private final Prescription prescription = new Prescription();

    @Test
    public void convert_100000_EN() {
        String result = prescription.convertToWords("100000", Languages.ENG);

        assertEquals("one hundred thousand ", result);
    }

    @Test
    public void convert_105300_EN() {
        String result = prescription.convertToWords("105300", Languages.ENG);

        assertEquals("one hundred five thousand three hundred ", result);
    }

    @Test
    public void convert_125000_EN() {
        String result = prescription.convertToWords("125000", Languages.ENG);

        assertEquals("one hundred twenty five thousand ", result);
    }

    @Test
    public void convert_450001_EN() {
        String result = prescription.convertToWords("450001", Languages.ENG);

        assertEquals("four hundred fifty thousand one ", result);
    }

    @Test
    public void convert_732465_EN() {
        String result = prescription.convertToWords("732465", Languages.ENG);

        assertEquals("seven hundred thirty two thousand four hundred sixty five ", result);
    }

    @Test
    public void convert_999999_EN() {
        String result = prescription.convertToWords("999999", Languages.ENG);

        assertEquals("nine hundred ninety nine thousand nine hundred ninety nine ", result);
    }
}