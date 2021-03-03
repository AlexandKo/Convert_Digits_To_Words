package prescription.rules;

import prescription.Prescription;
import prescription.digits.Languages;

public class RuleDigitEqualsFourteen implements Rules {
    private final Languages languages;

    public RuleDigitEqualsFourteen(Languages languages) {
        this.languages = languages;
    }

    @Override
    public String execute(String inputDigits, String digitToWord) {
        final int STRING_FINISH = 0;

        if (inputDigits.equals("14")) {
            digitToWord += switch (languages) {
                case LAT -> '\u010d' + "etrpadsmit";
                case ENG -> "fourteen";
            };
            Prescription.setDigitsQuantity(STRING_FINISH);
            return digitToWord + " ";
        }
        return "";
    }
}