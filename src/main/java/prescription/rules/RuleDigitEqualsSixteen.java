package prescription.rules;

import prescription.Prescription;
import prescription.digits.Languages;

public class RuleDigitEqualsSixteen implements Rules {
    private final Languages languages;

    public RuleDigitEqualsSixteen(Languages languages) {
        this.languages = languages;
    }

    @Override
    public String execute(String inputDigits, String digitToWord) {
        final int STRING_FINISH = 0;

        if (inputDigits.equals("16")) {
            digitToWord += switch (languages) {
                case LAT -> "se" + '\u0161' + "padsmit";
                case ENG -> "sixteen";
            };
            Prescription.setDigitsQuantity(STRING_FINISH);
            return digitToWord + " ";
        }
        return "";
    }
}