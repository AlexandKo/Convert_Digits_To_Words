package prescription.util;

import org.junit.jupiter.api.Test;
import prescription.digits.DigitPrescription;
import prescription.digits.DigitZero;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class DigitsControlTest {
    @Test
    public void testAnnotation() {
        DigitsControl digitsControl = new DigitsControl();
        DigitZero digitZero = new DigitZero();

        digitsControl.setDigit(digitZero);
        DigitPrescription resultClass = digitsControl.findDigitInstance(0);

        assertEquals(resultClass, digitZero);
    }

    @Test
    public void testAnnotationNoFoundedReturnNull() {
        DigitsControl digitsControl = new DigitsControl();
        DigitPrescription resultClass = digitsControl.findDigitInstance(1);

        assertNull(resultClass);

    }
}