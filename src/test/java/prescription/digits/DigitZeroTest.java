package prescription.digits;

import org.junit.jupiter.api.Test;
import prescription.Prescription;

import static org.junit.jupiter.api.Assertions.*;

public class DigitZeroTest {
    private final Prescription prescription = new Prescription();

    @Test
    public void convertZero_En() {
        String result = prescription.convertToWords("0", Languages.ENG);

        assertEquals("zero ", result);
    }

    @Test
    public void convertZero_Lv() {
        String result = prescription.convertToWords("0", Languages.LAT);

        assertEquals("nulle ", result);
    }
}