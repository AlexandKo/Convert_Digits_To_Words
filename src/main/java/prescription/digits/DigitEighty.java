package prescription.digits;

@Marker(value = 80)
public class DigitEighty implements DigitPrescription {

    @Override
    public String digitPrescriptionFinder(Languages setLanguage) {

        return switch (setLanguage) {
            case LAT -> "asto" + '\u0146' + "desmit";
            case ENG -> "eighty";
        };
    }
}