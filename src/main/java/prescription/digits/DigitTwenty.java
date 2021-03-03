package prescription.digits;

@Marker(value = 20)
public class DigitTwenty implements DigitPrescription {

    @Override
    public String digitPrescriptionFinder(Languages setLanguage) {

        return switch (setLanguage) {
            case LAT -> "divdesmit";
            case ENG -> "twenty";
        };
    }
}