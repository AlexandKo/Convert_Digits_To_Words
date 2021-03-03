package prescription.rules;

import prescription.Prescription;
import prescription.digits.Languages;

public class RuleDigitEqualsTwelve implements Rules {
    private final Languages languages;

    public RuleDigitEqualsTwelve(Languages languages) {
        this.languages = languages;
    }

    @Override
    public String execute(String inputDigits, String digitToWord) {
        final int STRING_FINISH = 0;

        if (inputDigits.equals("12")) {
            digitToWord += switch (languages) {
                case LAT -> "divpadsmit";
                case ENG -> "twelve";
            };
            Prescription.setDigitsQuantity(STRING_FINISH);
            return digitToWord + " ";
        }
        return "";
    }
}