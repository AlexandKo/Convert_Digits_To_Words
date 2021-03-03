package prescription.rules;

import prescription.Prescription;
import prescription.digits.Languages;
import prescription.util.DigitsControl;
import prescription.util.DigitsExtractor;

public class RuleSixDigits implements Rules {
    private final DigitsControl digitsControl;
    private final Languages languages;
    private final DigitsExtractor digitsExtractor = new DigitsExtractor();

    public RuleSixDigits(DigitsControl digitsControl, Languages languages) {
        this.digitsControl = digitsControl;
        this.languages = languages;
    }

    @Override
    public String execute(String inputDigits, String digitToWord) {
        final int FIRST_DIGIT_OF_SIX = 0;
        final int SECOND_DIGIT_OF_SIX = 3;
        final int SIX_DIGITS = 6;

        RulesControl rulesControl = new RulesControl(digitsControl, languages);

        if (inputDigits.length() == SIX_DIGITS) {

            String getThreeDigitsOfSix = digitsExtractor.getDigit(inputDigits, FIRST_DIGIT_OF_SIX, SECOND_DIGIT_OF_SIX);

            digitToWord += rulesControl.getDigitsToWords(getThreeDigitsOfSix, digitToWord);

            if (getThreeDigitsOfSix.equals("100") && languages.name().equals("LAT")) {
                Prescription.setDigitsQuantity(SIX_DIGITS);
                return digitToWord += "tūkstošiem ";
            }

            if (digitsExtractor.getDigit(getThreeDigitsOfSix, 2).equals("1")
                    && languages.name().equals("LAT")) {
                digitToWord += "tūkstotis ";
            } else {
                switch (languages) {
                    case ENG -> digitToWord += "thousand ";
                    case LAT -> digitToWord += "tūkstoši ";
                }
            }
            Prescription.setDigitsQuantity(SIX_DIGITS);
            return digitToWord;
        }
        return "";
    }
}