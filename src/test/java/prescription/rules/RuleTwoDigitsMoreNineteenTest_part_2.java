package prescription.rules;

import org.junit.jupiter.api.Test;
import prescription.Prescription;
import prescription.digits.Languages;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RuleTwoDigitsMoreNineteenTest_part_2 {
    private final Prescription prescription = new Prescription();

    @Test
    public void convertFortyFour_En() {
        String result = prescription.convertToWords("44", Languages.ENG);

        assertEquals("forty four ", result);
    }

    @Test
    public void convertFiftyFour_En() {
        String result = prescription.convertToWords("54", Languages.ENG);

        assertEquals("fifty four ", result);
    }

    @Test
    public void convertFortyThree_En() {
        String result = prescription.convertToWords("43", Languages.ENG);

        assertEquals("forty three ", result);
    }

    @Test
    public void convertFiftyThree_En() {
        String result = prescription.convertToWords("53", Languages.ENG);

        assertEquals("fifty three ", result);
    }

    @Test
    public void convertFortyOne_Lv() {
        String result = prescription.convertToWords("41", Languages.LAT);

        assertEquals('\u010d' + "etrdesmit viens ", result);
    }

    @Test
    public void convertFiftyOne_Lv() {
        String result = prescription.convertToWords("51", Languages.LAT);

        assertEquals("piecdesmit viens ", result);
    }


    @Test
    public void convertFortyFive_Lv() {
        String result = prescription.convertToWords("45", Languages.LAT);

        assertEquals('\u010d' + "etrdesmit pieci ", result);
    }

    @Test
    public void convertFiftyFive_Lv() {
        String result = prescription.convertToWords("55", Languages.LAT);

        assertEquals("piecdesmit pieci ", result);
    }
}