package prescription.rules;

import org.junit.jupiter.api.Test;
import prescription.Prescription;
import prescription.digits.Languages;

import static org.junit.jupiter.api.Assertions.*;

class RuleFiveDigitsTest {
    private final Prescription prescription = new Prescription();

    @Test
    public void convert_10000_EN() {
        String result = prescription.convertToWords("10000", Languages.ENG);

        assertEquals("ten thousand ", result);
    }

    @Test
    public void convert_12300_EN() {
        String result = prescription.convertToWords("12300", Languages.ENG);

        assertEquals("twelve thousand three hundred ", result);
    }

    @Test
    public void convert_14205_EN() {
        String result = prescription.convertToWords("14205", Languages.ENG);

        assertEquals("fourteen thousand two hundred five ", result);
    }

    @Test
    public void convert_16411_EN() {
        String result = prescription.convertToWords("16411", Languages.ENG);

        assertEquals("sixteen thousand four hundred eleven ", result);
    }

    @Test
    public void convert_17901_EN() {
        String result = prescription.convertToWords("17901", Languages.ENG);

        assertEquals("seventeen thousand nine hundred one ", result);
    }

    @Test
    public void convert_19015_EN() {
        String result = prescription.convertToWords("19015", Languages.ENG);

        assertEquals("nineteen thousand fifteen ", result);
    }
}