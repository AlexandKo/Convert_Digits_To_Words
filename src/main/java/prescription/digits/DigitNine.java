package prescription.digits;

import prescription.util.PropertiesCreator;

import java.util.Properties;

@Marker(value = 9)
public class DigitNine implements DigitPrescription {

    @Override
    public String digitPrescriptionFinder(Languages setLanguage) {
        PropertiesCreator digitZero = new PropertiesCreator("digit.properties");
        Properties digitZeroProperties = digitZero.getPropertiesSet();

        return switch (setLanguage) {
            case LAT -> digitZeroProperties.get("nine_LV").toString();
            case ENG -> digitZeroProperties.get("nine_EN").toString();
        };
    }
}