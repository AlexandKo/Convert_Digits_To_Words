package prescription.digits;

import prescription.util.PropertiesCreator;

import java.util.Properties;

@Marker(value = 6)
public class DigitSix implements DigitPrescription {

    @Override
    public String digitPrescriptionFinder(Languages setLanguage) {
        PropertiesCreator digitZero = new PropertiesCreator("digit.properties");
        Properties digitZeroProperties = digitZero.getPropertiesSet();

        return switch (setLanguage) {
            case LAT -> digitZeroProperties.get("six_LV").toString();
            case ENG -> digitZeroProperties.get("six_EN").toString();
        };
    }
}