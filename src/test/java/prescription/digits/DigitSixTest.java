package prescription.digits;

import org.junit.jupiter.api.Test;
import prescription.Prescription;

import static org.junit.jupiter.api.Assertions.*;

class DigitSixTest {
    private final Prescription prescription = new Prescription();

    @Test
    public void convertSix_En() {
        String result = prescription.convertToWords("6", Languages.ENG);

        assertEquals("six ", result);
    }

    @Test
    public void convertSix_Lv() {
        String result = prescription.convertToWords("6", Languages.LAT);

        assertEquals("se" + '\u0161' + "i ", result);
    }
}