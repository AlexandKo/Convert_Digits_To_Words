package prescription.digits;

import org.junit.jupiter.api.Test;
import prescription.Prescription;

import static org.junit.jupiter.api.Assertions.*;

class DigitNineTest {
    private final Prescription prescription = new Prescription();

    @Test
    public void convertNine_En() {
        String result = prescription.convertToWords("9", Languages.ENG);

        assertEquals("nine ", result);
    }

    @Test
    public void convertNine_Lv() {
        String result = prescription.convertToWords("9", Languages.LAT);

        assertEquals("devi" + '\u0146' + "i ", result);
    }
}