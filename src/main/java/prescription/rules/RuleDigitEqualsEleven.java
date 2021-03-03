package prescription.rules;

import prescription.Prescription;
import prescription.digits.Languages;

public class RuleDigitEqualsEleven implements Rules {
    private final Languages languages;

    public RuleDigitEqualsEleven(Languages languages) {
        this.languages = languages;
    }

    @Override
    public String execute(String inputDigits, String digitToWord) {
        final int STRING_FINISH = 0;

        if (inputDigits.equals("11")) {
            digitToWord += switch (languages) {
                case LAT -> "vienpadsmit";
                case ENG -> "eleven";
            };
            Prescription.setDigitsQuantity(STRING_FINISH);
            return digitToWord + " ";
        }
        return "";
    }
}