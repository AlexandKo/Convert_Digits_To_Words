package prescription.rules;

import org.junit.jupiter.api.Test;
import prescription.Prescription;
import prescription.digits.Languages;

import static org.junit.jupiter.api.Assertions.*;

class RuleDigitEqualsNineteenTest {
    private final Prescription prescription = new Prescription();

    @Test
    public void convertNineteen_En() {
        String result = prescription.convertToWords("19", Languages.ENG);

        assertEquals("nineteen ", result);
    }

    @Test
    public void convertNineteen_Lv() {
        String result = prescription.convertToWords("19", Languages.LAT);

        assertEquals("devi" + '\u0146' + "padsmit ", result);
    }
}