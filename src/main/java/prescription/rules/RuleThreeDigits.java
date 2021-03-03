package prescription.rules;

import prescription.digits.DigitPrescription;
import prescription.digits.Languages;
import prescription.util.DigitsControl;
import prescription.util.DigitsExtractor;

public class RuleThreeDigits implements Rules {
    private final DigitsControl digitsControl;
    private final Languages languages;
    private final DigitsExtractor digitsExtractor = new DigitsExtractor();

    public RuleThreeDigits(DigitsControl digitsControl, Languages languages) {
        this.digitsControl = digitsControl;
        this.languages = languages;
    }

    @Override
    public String execute(String inputDigits, String digitToWord) {
        final int FIRST_DIGIT_OF_THREE = 0;
        final int THREE_DIGITS = 3;

        if (inputDigits.length() == THREE_DIGITS) {
            int getFirstDigitOfThree = Integer.parseInt(digitsExtractor.getDigit(inputDigits, FIRST_DIGIT_OF_THREE));

            if (getFirstDigitOfThree == 0) {
                return "";
            }

            String hundredValue = getHundredValue(getFirstDigitOfThree);

            if (languages.name().equals("ENG") || languages.name().equals("LAT")) {
                DigitPrescription firstDigit = digitsControl.findDigitInstance(getFirstDigitOfThree);
                digitToWord = getDigitToWord(digitToWord, firstDigit) + hundredValue + " ";
            }

            return digitToWord;
        }
        return "";
    }

    private String getDigitToWord(String digitToWord, DigitPrescription digitPrescription) {
        digitToWord += digitPrescription.digitPrescriptionFinder(languages) + " ";
        return digitToWord;
    }

    private String getHundredValue(int getFirstDigitOfThree) {
        RuleHundredEn ruleHundredEn = new RuleHundredEn();
        RuleHundredLv ruleHundredLv = new RuleHundredLv();

        String hundredValue = ruleHundredEn.setValueOfHundred(languages);
        hundredValue += ruleHundredLv.setValueOfHundred(getFirstDigitOfThree, languages);
        return hundredValue;
    }
}