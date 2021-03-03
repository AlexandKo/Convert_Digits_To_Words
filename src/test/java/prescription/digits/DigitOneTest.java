package prescription.digits;

import org.junit.jupiter.api.Test;
import prescription.Prescription;

import static org.junit.jupiter.api.Assertions.*;

class DigitOneTest {
    private final Prescription prescription = new Prescription();

    @Test
    public void convertOne_En() {
        String result = prescription.convertToWords("1", Languages.ENG);

        assertEquals("one ", result);
    }

    @Test
    public void convertOne_Lv() {
        String result = prescription.convertToWords("1", Languages.LAT);

        assertEquals("viens ", result);
    }
}