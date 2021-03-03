package prescription.rules;

import prescription.Prescription;
import prescription.digits.Languages;

public class RuleDigitEqualsSeventeen implements Rules {
    private final Languages languages;

    public RuleDigitEqualsSeventeen(Languages languages) {
        this.languages = languages;
    }

    @Override
    public String execute(String inputDigits, String digitToWord) {
        final int STRING_FINISH = 0;

        if (inputDigits.equals("17")) {
            digitToWord += switch (languages) {
                case LAT -> "septi" + '\u0146' + "padsmit";
                case ENG -> "seventeen";
            };
            Prescription.setDigitsQuantity(STRING_FINISH);
            return digitToWord + " ";
        }
        return "";
    }
}