package prescription.rules;

import prescription.digits.Languages;

public class RuleHundredLv {

    public String setValueOfHundred(int firstDigit, Languages languages) {
        String hundredValue = "";
        if (languages.name().equals("LAT") && firstDigit == 1) {
            hundredValue = "simts";
        }
        if (languages.name().equals("LAT") && firstDigit > 1) {
            hundredValue = "simti";
        }
        return hundredValue;
    }
}