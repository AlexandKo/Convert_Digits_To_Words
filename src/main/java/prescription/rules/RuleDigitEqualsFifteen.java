package prescription.rules;

import prescription.Prescription;
import prescription.digits.Languages;

public class RuleDigitEqualsFifteen implements Rules {
    private final Languages languages;

    public RuleDigitEqualsFifteen(Languages languages) {
        this.languages = languages;
    }

    @Override
    public String execute(String inputDigits, String digitToWord) {
        final int STRING_FINISH = 0;

        if (inputDigits.equals("15")) {
            digitToWord += switch (languages) {
                case LAT -> "piecpadsmit";
                case ENG -> "fifteen";
            };
            Prescription.setDigitsQuantity(STRING_FINISH);
            return digitToWord + " ";
        }
        return "";
    }
}