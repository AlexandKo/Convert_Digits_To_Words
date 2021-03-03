package prescription.digits;

@Marker(value = 60)
public class DigitSixty implements DigitPrescription {

    @Override
    public String digitPrescriptionFinder(Languages setLanguage) {

        return switch (setLanguage) {
            case LAT -> "se"+'\u0161' + "desmit";
            case ENG -> "sixty";
        };
    }
}