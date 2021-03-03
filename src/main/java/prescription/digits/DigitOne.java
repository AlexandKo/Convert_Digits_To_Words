package prescription.digits;

import prescription.util.PropertiesCreator;

import java.util.Properties;

@Marker(value = 1)
public class DigitOne implements DigitPrescription {

    @Override
    public String digitPrescriptionFinder(Languages setLanguage) {
        PropertiesCreator digitZero = new PropertiesCreator("digit.properties");
        Properties digitZeroProperties = digitZero.getPropertiesSet();

        return switch (setLanguage) {
            case LAT -> digitZeroProperties.get("one_LV").toString();
            case ENG -> digitZeroProperties.get("one_EN").toString();
        };
    }
}