package prescription.digits;

import org.junit.jupiter.api.Test;
import prescription.Prescription;

import static org.junit.jupiter.api.Assertions.*;

class DigitTwoTest {
    private final Prescription prescription = new Prescription();

    @Test
    public void convertTwo_En() {
        String result = prescription.convertToWords("2", Languages.ENG);

        assertEquals("two ", result);
    }

    @Test
    public void convertTwo_Lv() {
        String result = prescription.convertToWords("2", Languages.LAT);

        assertEquals("divi ", result);
    }
}