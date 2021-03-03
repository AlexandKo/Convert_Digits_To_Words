package prescription.digits;

@Marker(value = 90)
public class DigitNinety implements DigitPrescription {

    @Override
    public String digitPrescriptionFinder(Languages setLanguage) {

        return switch (setLanguage) {
            case LAT -> "devi" + '\u0146' + "desmit";
            case ENG -> "ninety";
        };
    }
}