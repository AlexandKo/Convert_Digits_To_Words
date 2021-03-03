package prescription.rules;

import prescription.digits.DigitPrescription;
import prescription.digits.Languages;
import prescription.util.DigitsControl;
import prescription.util.DigitsExtractor;

public class RuleTwoDigitsMoreNineteen implements Rules {
    private final DigitsControl digitsControl;
    private final Languages languages;

    public RuleTwoDigitsMoreNineteen(DigitsControl digitsControl, Languages languages) {
        this.digitsControl = digitsControl;
        this.languages = languages;
    }

    @Override
    public String execute(String inputDigits, String digitToWord) {
        final int FIRST_DIGIT_OF_TWO = 0;
        final int TWO_DIGITS = 2;
        DigitsExtractor digitsExtractor = new DigitsExtractor();

        if (digitsExtractor.getDigit(inputDigits, FIRST_DIGIT_OF_TWO).equals("0")) {
            return "";
        }

        if (inputDigits.length() == TWO_DIGITS && Integer.parseInt(inputDigits) > 19) {

            int getFirstDigitOfTwo = Integer.parseInt(digitsExtractor.getDigit(inputDigits, FIRST_DIGIT_OF_TWO));
            DigitPrescription firstDigit = digitsControl.findDigitInstance(getFirstDigitOfTwo * 10);
            digitToWord += firstDigit.digitPrescriptionFinder(languages) + " ";

            return digitToWord;
        }
        return "";
    }
}