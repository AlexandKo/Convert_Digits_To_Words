package prescription.digits;

import org.junit.jupiter.api.Test;
import prescription.Prescription;

import static org.junit.jupiter.api.Assertions.*;

class DigitFiftyTest {
    private final Prescription prescription = new Prescription();

    @Test
    public void convertFifty_En() {
        String result = prescription.convertToWords("50", Languages.ENG);

        assertEquals("fifty ", result);
    }

    @Test
    public void convertFifty_Lv() {
        String result = prescription.convertToWords("50", Languages.LAT);

        assertEquals("piecdesmit ", result);
    }
}