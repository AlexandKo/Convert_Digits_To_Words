package prescription.rules;

import org.junit.jupiter.api.Test;
import prescription.Prescription;
import prescription.digits.Languages;

import static org.junit.jupiter.api.Assertions.*;

class RuleDigitEqualsTwelveTest {
    private final Prescription prescription = new Prescription();

    @Test
    public void convertTwelve_En() {
        String result = prescription.convertToWords("12", Languages.ENG);

        assertEquals("twelve ", result);
    }

    @Test
    public void convertTwelve_Lv() {
        String result = prescription.convertToWords("12", Languages.LAT);

        assertEquals("divpadsmit ", result);
    }
}