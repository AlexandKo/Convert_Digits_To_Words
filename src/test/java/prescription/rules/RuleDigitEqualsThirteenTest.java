package prescription.rules;

import org.junit.jupiter.api.Test;
import prescription.Prescription;
import prescription.digits.Languages;

import static org.junit.jupiter.api.Assertions.*;

class RuleDigitEqualsThirteenTest {
    private final Prescription prescription = new Prescription();

    @Test
    public void convertThirteen_En() {
        String result = prescription.convertToWords("13", Languages.ENG);

        assertEquals("thirteen ", result);
    }

    @Test
    public void convertThirteen_Lv() {
        String result = prescription.convertToWords("13", Languages.LAT);

        assertEquals("tr" + '\u012b' + "spadsmit ", result);
    }
}