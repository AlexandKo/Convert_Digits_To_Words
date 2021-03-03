package prescription.rules;

import prescription.Prescription;
import prescription.digits.Languages;
import prescription.util.DigitsControl;
import prescription.util.DigitsExtractor;

public class RuleFiveDigits implements Rules {
    private final DigitsControl digitsControl;
    private final Languages languages;
    private final DigitsExtractor digitsExtractor = new DigitsExtractor();

    public RuleFiveDigits(DigitsControl digitsControl, Languages languages) {
        this.digitsControl = digitsControl;
        this.languages = languages;
    }

    @Override
    public String execute(String inputDigits, String digitToWord) {
        final int FIRST_DIGIT_OF_FIVE = 0;
        final int SECOND_DIGIT_OF_FIVE = 2;
        final int FIVE_DIGITS = 5;
        final int DIGITS_QUANTITY_SEVEN = 7;

        if (Prescription.getDigitsQuantity() == DIGITS_QUANTITY_SEVEN) {
            return digitToWord;
        }

        if (inputDigits.length() == FIVE_DIGITS) {
            RulesControl rulesControl = new RulesControl(digitsControl, languages);

            String getTwoDigitsOfSix = digitsExtractor.getDigit(inputDigits, FIRST_DIGIT_OF_FIVE, SECOND_DIGIT_OF_FIVE);

            digitToWord = rulesControl.getDigitsToWords(getTwoDigitsOfSix, digitToWord);

            switch (languages) {
                case ENG -> digitToWord += "thousand ";
                case LAT -> digitToWord += "tūkstoši ";
            }
            Prescription.setDigitsQuantity(FIVE_DIGITS);
            return digitToWord;
        }
        return "";
    }
}