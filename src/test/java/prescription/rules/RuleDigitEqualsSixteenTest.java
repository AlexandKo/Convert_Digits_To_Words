package prescription.rules;

import org.junit.jupiter.api.Test;
import prescription.Prescription;
import prescription.digits.Languages;

import static org.junit.jupiter.api.Assertions.*;

class RuleDigitEqualsSixteenTest {
    private final Prescription prescription = new Prescription();

    @Test
    public void convertSixteen_En() {
        String result = prescription.convertToWords("16", Languages.ENG);

        assertEquals("sixteen ", result);
    }

    @Test
    public void convertSixteen_Lv() {
        String result = prescription.convertToWords("16", Languages.LAT);

        assertEquals("se" + '\u0161' + "padsmit ", result);
    }
}