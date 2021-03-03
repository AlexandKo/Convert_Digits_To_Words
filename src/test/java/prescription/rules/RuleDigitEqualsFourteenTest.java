package prescription.rules;

import org.junit.jupiter.api.Test;
import prescription.Prescription;
import prescription.digits.Languages;

import static org.junit.jupiter.api.Assertions.*;

class RuleDigitEqualsFourteenTest {
    private final Prescription prescription = new Prescription();

    @Test
    public void convertFourteen_En() {
        String result = prescription.convertToWords("14", Languages.ENG);

        assertEquals("fourteen ", result);
    }

    @Test
    public void convertFourteen_Lv() {
        String result = prescription.convertToWords("14", Languages.LAT);

        assertEquals('\u010d' + "etrpadsmit ", result);
    }
}