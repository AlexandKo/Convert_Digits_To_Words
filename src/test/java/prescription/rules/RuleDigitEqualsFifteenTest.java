package prescription.rules;

import org.junit.jupiter.api.Test;
import prescription.Prescription;
import prescription.digits.Languages;

import static org.junit.jupiter.api.Assertions.*;

class RuleDigitEqualsFifteenTest {
    private final Prescription prescription = new Prescription();

    @Test
    public void convertFifteen_En() {
        String result = prescription.convertToWords("15", Languages.ENG);

        assertEquals("fifteen ", result);
    }

    @Test
    public void convertFifteen_Lv() {
        String result = prescription.convertToWords("15", Languages.LAT);

        assertEquals("piecpadsmit ", result);
    }
}