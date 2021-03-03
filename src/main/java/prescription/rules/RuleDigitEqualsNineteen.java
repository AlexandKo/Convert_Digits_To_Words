package prescription.rules;

import prescription.Prescription;
import prescription.digits.Languages;

public class RuleDigitEqualsNineteen implements Rules {
    private final Languages languages;

    public RuleDigitEqualsNineteen(Languages languages) {
        this.languages = languages;
    }

    @Override
    public String execute(String inputDigits, String digitToWord) {
        final int STRING_FINISH = 0;

        if (inputDigits.equals("19")) {
            digitToWord += switch (languages) {
                case LAT -> "devi" + '\u0146' + "padsmit";
                case ENG -> "nineteen";
            };
            Prescription.setDigitsQuantity(STRING_FINISH);
            return digitToWord + " ";
        }
        return "";
    }
}