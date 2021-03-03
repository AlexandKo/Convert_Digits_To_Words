package prescription.digits;

@Marker(value = 50)
public class DigitFifty implements DigitPrescription {

    @Override
    public String digitPrescriptionFinder(Languages setLanguage) {

        return switch (setLanguage) {
            case LAT -> "piecdesmit";
            case ENG -> "fifty";
        };
    }
}