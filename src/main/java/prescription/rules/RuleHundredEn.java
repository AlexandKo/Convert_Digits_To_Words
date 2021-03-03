package prescription.rules;

import prescription.digits.Languages;

public class RuleHundredEn {

    public String  setValueOfHundred(Languages languages) {
        String hundredValue = "";
        if (languages.name().equals("ENG")) {
            hundredValue="hundred";
        }
        return hundredValue;
    }
}