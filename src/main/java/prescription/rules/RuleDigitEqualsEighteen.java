package prescription.rules;

import prescription.Prescription;
import prescription.digits.Languages;

public class RuleDigitEqualsEighteen implements Rules {
    private final Languages languages;

    public RuleDigitEqualsEighteen(Languages languages) {
        this.languages = languages;
    }

    @Override
    public String execute(String inputDigits, String digitToWord) {
        final int STRING_FINISH = 0;

        if (inputDigits.equals("18")) {
            digitToWord += switch (languages) {
                case LAT -> "asto" + '\u0146' + "padsmit";
                case ENG -> "eighteen";
            };
            Prescription.setDigitsQuantity(STRING_FINISH);
            return digitToWord + " ";
        }
        return "";
    }
}