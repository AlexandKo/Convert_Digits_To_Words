package prescription.rules;

import org.junit.jupiter.api.Test;
import prescription.Prescription;
import prescription.digits.Languages;

import static org.junit.jupiter.api.Assertions.*;

class RuleFourDigitsTest {
    private final Prescription prescription = new Prescription();

    @Test
    public void convert_1000_EN() {
        String result = prescription.convertToWords("1000", Languages.ENG);

        assertEquals("one thousand ", result);
    }

    @Test
    public void convert_1105_EN() {
        String result = prescription.convertToWords("1105", Languages.ENG);

        assertEquals("one thousand one hundred five ", result);
    }

    @Test
    public void convert_1378_EN() {
        String result = prescription.convertToWords("1378", Languages.ENG);

        assertEquals("one thousand three hundred seventy eight ", result);
    }

    @Test
    public void convert_8888_EN() {
        String result = prescription.convertToWords("8888", Languages.ENG);

        assertEquals("eight thousand eight hundred eighty eight ", result);
    }
    @Test
    public void convert_7890_EN() {
        String result = prescription.convertToWords("7890", Languages.ENG);

        assertEquals("seven thousand eight hundred ninety ", result);
    }

    @Test
    public void convert_5041_EN() {
        String result = prescription.convertToWords("5041", Languages.ENG);

        assertEquals("five thousand forty one ", result);
    }

    @Test
    public void convert_9003_EN() {
        String result = prescription.convertToWords("9003", Languages.ENG);

        assertEquals("nine thousand three ", result);
    }
}