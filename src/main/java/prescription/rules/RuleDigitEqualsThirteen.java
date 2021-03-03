package prescription.rules;

import prescription.Prescription;
import prescription.digits.Languages;

public class RuleDigitEqualsThirteen implements Rules {
    private final Languages languages;

    public RuleDigitEqualsThirteen(Languages languages) {
        this.languages = languages;
    }

    @Override
    public String execute(String inputDigits, String digitToWord) {
        final int STRING_FINISH = 0;

        if (inputDigits.equals("13")) {
            digitToWord += switch (languages) {
                case LAT -> "tr" + '\u012b' + "spadsmit";
                case ENG -> "thirteen";
            };
            Prescription.setDigitsQuantity(STRING_FINISH);
            return digitToWord + " ";
        }
        return "";
    }
}