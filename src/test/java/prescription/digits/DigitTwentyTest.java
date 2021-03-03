package prescription.digits;

import org.junit.jupiter.api.Test;
import prescription.Prescription;

import static org.junit.jupiter.api.Assertions.*;

class DigitTwentyTest {
    private final Prescription prescription = new Prescription();

    @Test
    public void convertThree_En() {
        String result = prescription.convertToWords("20", Languages.ENG);

        assertEquals("twenty ", result);
    }

    @Test
    public void convertThree_Lv() {
        String result = prescription.convertToWords("20", Languages.LAT);

        assertEquals("divdesmit ", result);
    }
}