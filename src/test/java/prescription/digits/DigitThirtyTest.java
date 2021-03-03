package prescription.digits;

import org.junit.jupiter.api.Test;
import prescription.Prescription;

import static org.junit.jupiter.api.Assertions.*;

class DigitThirtyTest {
    private final Prescription prescription = new Prescription();

    @Test
    public void convertThirty_En() {
        String result = prescription.convertToWords("30", Languages.ENG);

        assertEquals("thirty ", result);
    }

    @Test
    public void convertThirty_Lv() {
        String result = prescription.convertToWords("30", Languages.LAT);

        assertEquals("tr" + '\u012b' + "sdesmit ", result);
    }
}