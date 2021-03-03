package prescription.rules;

import prescription.Prescription;
import prescription.digits.Languages;
import prescription.util.DigitsControl;
import prescription.util.DigitsExtractor;

import java.util.ArrayList;
import java.util.List;

public class RulesControl {
    private final DigitsControl digitsControl;
    private final Languages languages;
    private final List<Rules> rules = new ArrayList<>();

    public RulesControl(DigitsControl digitsControl, Languages languages) {
        this.digitsControl = digitsControl;
        this.languages = languages;
        createRulesList();
    }

    private void createRulesList() {
        RuleDigitEqualsTen ruleIfDigitEqualsTen = new RuleDigitEqualsTen(languages);
        RuleIfDigitLessTen ruleIfDigitLessTen = new RuleIfDigitLessTen(digitsControl, languages);
        RuleDigitEqualsEleven ruleDigitEqualsEleven = new RuleDigitEqualsEleven(languages);
        RuleDigitEqualsTwelve ruleDigitEqualsTwelve = new RuleDigitEqualsTwelve(languages);
        RuleDigitEqualsThirteen ruleDigitEqualsThirteen = new RuleDigitEqualsThirteen(languages);
        RuleDigitEqualsFourteen ruleDigitEqualsFourteen = new RuleDigitEqualsFourteen(languages);
        RuleDigitEqualsFifteen ruleDigitEqualsFifteen = new RuleDigitEqualsFifteen(languages);
        RuleDigitEqualsSixteen ruleDigitEqualsSixteen = new RuleDigitEqualsSixteen(languages);
        RuleDigitEqualsSeventeen ruleDigitEqualsSeventeen = new RuleDigitEqualsSeventeen(languages);
        RuleDigitEqualsEighteen ruleDigitEqualsEighteen = new RuleDigitEqualsEighteen(languages);
        RuleDigitEqualsNineteen ruleDigitEqualsNineteen = new RuleDigitEqualsNineteen(languages);
        RuleTwoDigitsMoreNineteen ruleTwoDigitsMoreNineteen = new RuleTwoDigitsMoreNineteen(digitsControl, languages);
        RuleThreeDigits ruleThreeDigits = new RuleThreeDigits(digitsControl, languages);
        RuleFourDigits ruleFourDigits = new RuleFourDigits(digitsControl, languages);
        RuleFiveDigits ruleFiveDigits = new RuleFiveDigits(digitsControl, languages);
        RuleSixDigits ruleSixDigits = new RuleSixDigits(digitsControl,languages);

        rules.add(ruleIfDigitEqualsTen);
        rules.add(ruleIfDigitLessTen);
        rules.add(ruleDigitEqualsEleven);
        rules.add(ruleDigitEqualsTwelve);
        rules.add(ruleDigitEqualsThirteen);
        rules.add(ruleDigitEqualsFourteen);
        rules.add(ruleDigitEqualsFifteen);
        rules.add(ruleDigitEqualsSixteen);
        rules.add(ruleDigitEqualsSeventeen);
        rules.add(ruleDigitEqualsEighteen);
        rules.add(ruleDigitEqualsNineteen);
        rules.add(ruleTwoDigitsMoreNineteen);
        rules.add(ruleThreeDigits);
        rules.add(ruleFourDigits);
        rules.add(ruleFiveDigits);
        rules.add(ruleSixDigits);
    }

    public String getDigitsToWords(String inputDigits, String digitToWord) {
        final int STRING_FINISH = 0;
        DigitsExtractor digitsExtractor = new DigitsExtractor();

        StringBuilder result = new StringBuilder();
        while (Prescription.getDigitsQuantity() != STRING_FINISH) {

            for (Rules rule : rules) {
                digitToWord = rule.execute(inputDigits, digitToWord);
                result.append(digitToWord);
            }

            if (Prescription.getDigitsQuantity() != STRING_FINISH) {
                inputDigits = digitsExtractor.getDigit(inputDigits, 1, inputDigits.length());
                Prescription.setDigitsQuantity(Prescription.getDigitsQuantity() + 1);
            }
        }
        return result.toString();
    }
}