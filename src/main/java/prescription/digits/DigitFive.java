package prescription.digits;

import prescription.util.PropertiesCreator;

import java.util.Properties;

@Marker(value = 5)
public class DigitFive implements DigitPrescription {

    @Override
    public String digitPrescriptionFinder(Languages setLanguage) {
        PropertiesCreator digitZero = new PropertiesCreator("digit.properties");
        Properties digitZeroProperties = digitZero.getPropertiesSet();

        return switch (setLanguage) {
            case LAT -> digitZeroProperties.get("five_LV").toString();
            case ENG -> digitZeroProperties.get("five_EN").toString();
        };
    }
}