package prescription.digits;

import org.junit.jupiter.api.Test;
import prescription.Prescription;

import static org.junit.jupiter.api.Assertions.*;

class DigitFiveTest {
    private final Prescription prescription = new Prescription();

    @Test
    public void convertThree_En() {
        String result = prescription.convertToWords("5", Languages.ENG);

        assertEquals("five ", result);
    }

    @Test
    public void convertThree_Lv() {
        String result = prescription.convertToWords("5", Languages.LAT);

        assertEquals("pieci ", result);
    }
}