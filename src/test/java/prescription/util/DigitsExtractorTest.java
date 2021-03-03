package prescription.util;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DigitsExtractorTest {
    @Test
    public void getDigit_0() {
        DigitsExtractor digitsExtractor = new DigitsExtractor();
        String result = digitsExtractor.getDigit("01234", 0);

        assertEquals("0", result);
    }

    @Test
    public void getDigit_1() {
        DigitsExtractor digitsExtractor = new DigitsExtractor();
        String result = digitsExtractor.getDigit("01234", 1);

        assertEquals("1", result);
    }

    @Test
    public void getDigit_2() {
        DigitsExtractor digitsExtractor = new DigitsExtractor();
        String result = digitsExtractor.getDigit("01234", 2);

        assertEquals("2", result);
    }

    @Test
    public void getDigit_3() {
        DigitsExtractor digitsExtractor = new DigitsExtractor();
        String result = digitsExtractor.getDigit("01234", 3);

        assertEquals("3", result);
    }

    @Test
    public void getDigit_4() {
        DigitsExtractor digitsExtractor = new DigitsExtractor();
        String result = digitsExtractor.getDigit("01234", 4);

        assertEquals("4", result);
    }

    @Test
    public void getDigit_Empty() {
        DigitsExtractor digitsExtractor = new DigitsExtractor();
        String result = digitsExtractor.getDigit("", 0);

        assertEquals("0", result);
    }
}