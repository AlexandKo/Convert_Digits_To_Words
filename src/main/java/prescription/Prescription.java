package prescription;

import prescription.digits.Languages;
import prescription.rules.RulesControl;
import prescription.util.DigitsControl;
import prescription.util.PropertiesCreator;
import prescription.util.Startup;

import java.util.Properties;

public class Prescription {
    private static int digitsQuantity;
    private final DigitsControl digitsControl = new DigitsControl();
    private final Properties currencyProperties;

    public Prescription() {
        Startup startup = new Startup(digitsControl);
        PropertiesCreator propertiesCreator = new PropertiesCreator("currency.properties");
        currencyProperties = propertiesCreator.getPropertiesSet();
        startup.addDigits();
    }

    public static int getDigitsQuantity() {
        return digitsQuantity;
    }

    public static void setDigitsQuantity(int digitsQuantity) {
        Prescription.digitsQuantity = digitsQuantity;
    }

    public String convertToWords(String inputDigits, Languages languages) {
        RulesControl rulesControl = new RulesControl(digitsControl, languages);

        setDigitsQuantity(inputDigits.length());

        String digitToWord = "";

        digitToWord = rulesControl.getDigitsToWords(inputDigits, digitToWord);

        return digitToWord;
    }

    public String getCurrency(Languages languages) {
        return switch (languages) {
            case LAT -> currencyProperties.get("currency_LV").toString();
            case ENG -> currencyProperties.get("currency_EN").toString();
        };
    }

    public String getCurrencyCoin(Languages languages) {
        return switch (languages) {
            case LAT -> currencyProperties.get("cents_LV").toString();
            case ENG -> currencyProperties.get("cents_EN").toString();
        };
    }
}