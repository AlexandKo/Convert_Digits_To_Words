package prescription.rules;

import org.junit.jupiter.api.Test;
import prescription.Prescription;
import prescription.digits.Languages;

import static org.junit.jupiter.api.Assertions.*;

class RuleDigitEqualsElevenTest {
    private final Prescription prescription = new Prescription();

    @Test
    public void convertEleven_En() {
        String result = prescription.convertToWords("11", Languages.ENG);

        assertEquals("eleven ", result);
    }

    @Test
    public void convertEleven_Lv() {
        String result = prescription.convertToWords("11", Languages.LAT);

        assertEquals("vienpadsmit ", result);
    }
}