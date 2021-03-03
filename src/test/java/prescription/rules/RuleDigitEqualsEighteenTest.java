package prescription.rules;

import org.junit.jupiter.api.Test;
import prescription.Prescription;
import prescription.digits.Languages;

import static org.junit.jupiter.api.Assertions.*;

class RuleDigitEqualsEighteenTest {
    private final Prescription prescription = new Prescription();

    @Test
    public void convertEighteen_En() {
        String result = prescription.convertToWords("18", Languages.ENG);

        assertEquals("eighteen ", result);
    }

    @Test
    public void convertEighteen_Lv() {
        String result = prescription.convertToWords("18", Languages.LAT);

        assertEquals("asto" + '\u0146' + "padsmit ", result);
    }
}