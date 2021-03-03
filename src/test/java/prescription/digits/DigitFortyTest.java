package prescription.digits;

import org.junit.jupiter.api.Test;
import prescription.Prescription;

import static org.junit.jupiter.api.Assertions.*;

class DigitFortyTest {
    private final Prescription prescription = new Prescription();

    @Test
    public void convertForty_En() {
        String result = prescription.convertToWords("40", Languages.ENG);

        assertEquals("forty ", result);
    }

    @Test
    public void convertForty_Lv() {
        String result = prescription.convertToWords("40", Languages.LAT);

        assertEquals('\u010d' + "etrdesmit ", result);
    }
}