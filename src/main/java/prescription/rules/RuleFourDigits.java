package prescription.rules;

import prescription.Prescription;
import prescription.digits.DigitPrescription;
import prescription.digits.Languages;
import prescription.util.DigitsControl;
import prescription.util.DigitsExtractor;

public class RuleFourDigits implements Rules {
    private final DigitsControl digitsControl;
    private final Languages languages;
    private final DigitsExtractor digitsExtractor = new DigitsExtractor();

    public RuleFourDigits(DigitsControl digitsControl, Languages languages) {
        this.digitsControl = digitsControl;
        this.languages = languages;
    }

    @Override
    public String execute(String inputDigits, String digitToWord) {
        final int FIRST_DIGIT_OF_FOUR = 0;
        final int FOUR_DIGITS = 4;
        final int DIGITS_QUANTITY_SIX = 6;
        final int DIGITS_QUANTITY_EIGHT = 8;

        if (Prescription.getDigitsQuantity() == DIGITS_QUANTITY_SIX ||
                Prescription.getDigitsQuantity() == DIGITS_QUANTITY_EIGHT) {
            return "";
        }

        if (inputDigits.length() == FOUR_DIGITS) {

            int getFirstDigitOfFour = Integer.parseInt(digitsExtractor.getDigit(inputDigits, FIRST_DIGIT_OF_FOUR));

            return getThousandValue(getFirstDigitOfFour);

        }
        return "";
    }

    private String getThousandValue(int getFirstDigitOfFour) {
        String thousandValue;

        DigitPrescription digitPrescription = digitsControl.findDigitInstance(getFirstDigitOfFour);
        thousandValue = digitPrescription.digitPrescriptionFinder(languages) + " ";
        if (getFirstDigitOfFour == 1) {
            switch (languages) {
                case ENG -> thousandValue += "thousand ";
                case LAT -> thousandValue += "tūksotis ";
            }
        } else {
            switch (languages) {
                case ENG -> thousandValue += "thousand ";
                case LAT -> thousandValue += "tūkstoši ";
            }
        }
        return thousandValue;
    }
}