package prescription.rules;

import prescription.Prescription;
import prescription.digits.DigitPrescription;
import prescription.digits.Languages;
import prescription.util.DigitsControl;

public class RuleIfDigitLessTen implements Rules {
    private final DigitsControl digitsControl;
    private final Languages languages;

    public RuleIfDigitLessTen(DigitsControl digitsControl, Languages languages) {
        this.digitsControl = digitsControl;
        this.languages = languages;
    }

    @Override
    public String execute(String inputDigits, String digitToWord) {
        final int STRING_FINISH = 0;
        final int FIRST_DIGIT = 1;

        if (inputDigits.equals("0") && Prescription.getDigitsQuantity() != FIRST_DIGIT) {
            Prescription.setDigitsQuantity(STRING_FINISH);
            return "";
        }

        if (inputDigits.length() == 1) {
            DigitPrescription digit = digitsControl.findDigitInstance(Integer.parseInt(inputDigits));
            digitToWord = digit.digitPrescriptionFinder(languages);

            Prescription.setDigitsQuantity(STRING_FINISH);

            return digitToWord + " ";
        }
        return "";
    }
}