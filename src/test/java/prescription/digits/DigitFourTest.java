package prescription.digits;

import org.junit.jupiter.api.Test;
import prescription.Prescription;

import static org.junit.jupiter.api.Assertions.*;

class DigitFourTest {
    private final Prescription prescription = new Prescription();

    @Test
    public void convertThree_En() {
        String result = prescription.convertToWords("4", Languages.ENG);

        assertEquals("four ", result);
    }

    @Test
    public void convertThree_Lv() {
        String result = prescription.convertToWords("4", Languages.LAT);

        assertEquals('\u010d' + "etri ", result);
    }
}