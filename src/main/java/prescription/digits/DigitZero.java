package prescription.digits;

import prescription.Prescription;
import prescription.util.PropertiesCreator;

import java.util.Properties;

@Marker(value = 0)
public class DigitZero implements DigitPrescription {

    @Override
    public String digitPrescriptionFinder(Languages setLanguage) {
        final int STRING_FINISH = 0;
        PropertiesCreator digitZero = new PropertiesCreator("digit.properties");
        Properties digitZeroProperties = digitZero.getPropertiesSet();

        if (Prescription.getDigitsQuantity() != 1) {
            return "";
        }
        String zeroToWord = switch (setLanguage) {
            case LAT -> digitZeroProperties.get("zero_LV").toString();
            case ENG -> digitZeroProperties.get("zero_EN").toString();
        };
        Prescription.setDigitsQuantity(STRING_FINISH);
        return zeroToWord;
    }
}