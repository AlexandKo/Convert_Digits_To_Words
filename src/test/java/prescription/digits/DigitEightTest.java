package prescription.digits;

import org.junit.jupiter.api.Test;
import prescription.Prescription;

import static org.junit.jupiter.api.Assertions.*;

class DigitEightTest {
    private final Prescription prescription = new Prescription();

    @Test
    public void convertEight_En() {
        String result = prescription.convertToWords("8", Languages.ENG);

        assertEquals("eight ", result);
    }

    @Test
    public void convertEight_Lv() {
        String result = prescription.convertToWords("8", Languages.LAT);

        assertEquals("asto" +'\u0146' + "i " , result);
    }
}