package prescription.digits;

import org.junit.jupiter.api.Test;
import prescription.Prescription;

import static org.junit.jupiter.api.Assertions.*;

class DigitSevenTest {
    private final Prescription prescription = new Prescription();

    @Test
    public void convertSeven_En() {
        String result = prescription.convertToWords("7", Languages.ENG);

        assertEquals("seven ", result);
    }

    @Test
    public void convertSeven_Lv() {
        String result = prescription.convertToWords("7", Languages.LAT);

        assertEquals("septi" + '\u0146' + "i ", result);
    }
}