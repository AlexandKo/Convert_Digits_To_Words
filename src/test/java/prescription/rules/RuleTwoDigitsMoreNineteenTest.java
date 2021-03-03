package prescription.rules;

import org.junit.jupiter.api.Test;
import prescription.Prescription;
import prescription.digits.Languages;

import static org.junit.jupiter.api.Assertions.*;

class RuleTwoDigitsMoreNineteenTest {
    private final Prescription prescription = new Prescription();

    @Test
    public void convertTwentyFive_En() {
        String result = prescription.convertToWords("25", Languages.ENG);

        assertEquals("twenty five ", result);
    }

    @Test
    public void convertTwentyNine_En() {
        String result = prescription.convertToWords("29", Languages.ENG);

        assertEquals("twenty nine ", result);
    }

    @Test
    public void convertThirtyOne_En() {
        String result = prescription.convertToWords("31", Languages.ENG);

        assertEquals("thirty one ", result);
    }

    @Test
    public void convertThirtyFour_En() {
        String result = prescription.convertToWords("34", Languages.ENG);

        assertEquals("thirty four ", result);
    }

    @Test
    public void convertTwentyOne_Lv() {
        String result = prescription.convertToWords("21", Languages.LAT);

        assertEquals("divdesmit viens ", result);
    }

    @Test
    public void convertTwentyTwo_Lv() {
        String result = prescription.convertToWords("22", Languages.LAT);

        assertEquals("divdesmit divi ", result);
    }

    @Test
    public void convertThirtyThree_Lv() {
        String result = prescription.convertToWords("33", Languages.LAT);

        assertEquals( "tr" + '\u012b' + "sdesmit " + "tr" + '\u012b' + "s ", result);
    }

    @Test
    public void convertThirtyFive_Lv() {
        String result = prescription.convertToWords("35", Languages.LAT);

        assertEquals( "tr" + '\u012b' + "sdesmit " + "pieci ", result);
    }
}