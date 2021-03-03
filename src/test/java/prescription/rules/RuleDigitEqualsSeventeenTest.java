package prescription.rules;

import org.junit.jupiter.api.Test;
import prescription.Prescription;
import prescription.digits.Languages;

import static org.junit.jupiter.api.Assertions.*;

class RuleDigitEqualsSeventeenTest {
    private final Prescription prescription = new Prescription();

    @Test
    public void convertSeventeen_En() {
        String result = prescription.convertToWords("17", Languages.ENG);

        assertEquals("seventeen ", result);
    }

    @Test
    public void convertSeventeen_Lv() {
        String result = prescription.convertToWords("17", Languages.LAT);

        assertEquals("septi" + '\u0146' + "padsmit ", result);
    }
}