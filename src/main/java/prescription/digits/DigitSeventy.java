package prescription.digits;

@Marker(value = 70)
public class DigitSeventy implements DigitPrescription {

    @Override
    public String digitPrescriptionFinder(Languages setLanguage) {

        return switch (setLanguage) {
            case LAT -> "septi" + '\u0146' + "desmit";
            case ENG -> "seventy";
        };
    }
}