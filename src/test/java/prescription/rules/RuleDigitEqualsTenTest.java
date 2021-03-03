package prescription.rules;

import org.junit.jupiter.api.Test;
import prescription.Prescription;
import prescription.digits.Languages;

import static org.junit.jupiter.api.Assertions.*;

class RuleDigitEqualsTenTest {
    private final Prescription prescription = new Prescription();

    @Test
    public void convertTen_En() {
        String result = prescription.convertToWords("10", Languages.ENG);

        assertEquals("ten ", result);
    }

    @Test
    public void convertTen_Lv() {
        String result = prescription.convertToWords("10", Languages.LAT);

        assertEquals("desmit ", result);
    }
}