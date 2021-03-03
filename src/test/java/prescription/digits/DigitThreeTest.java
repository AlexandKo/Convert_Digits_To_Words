package prescription.digits;

import org.junit.jupiter.api.Test;
import prescription.Prescription;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DigitThreeTest {
    private final Prescription prescription = new Prescription();

    @Test
    public void convertThree_En() {
        String result = prescription.convertToWords("3", Languages.ENG);

        assertEquals("three ", result);
    }

    @Test
    public void convertThree_Lv() {
        String result = prescription.convertToWords("3", Languages.LAT);

        assertEquals("tr" + '\u012b' + "s ", result);
    }
}