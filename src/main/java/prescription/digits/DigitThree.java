package prescription.digits;

import prescription.util.PropertiesCreator;

import java.util.Properties;

@Marker(value = 3)
public class DigitThree implements DigitPrescription {

    @Override
    public String digitPrescriptionFinder(Languages setLanguage) {
        PropertiesCreator digitZero = new PropertiesCreator("digit.properties");
        Properties digitZeroProperties = digitZero.getPropertiesSet();

        return switch (setLanguage) {
            case LAT -> digitZeroProperties.get("three_LV").toString();
            case ENG -> digitZeroProperties.get("three_EN").toString();
        };
    }
}