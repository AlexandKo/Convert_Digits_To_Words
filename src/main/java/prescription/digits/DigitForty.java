package prescription.digits;

@Marker(value = 40)
public class DigitForty implements DigitPrescription {

    @Override
    public String digitPrescriptionFinder(Languages setLanguage) {

        return switch (setLanguage) {
            case LAT -> '\u010d' + "etrdesmit";
            case ENG -> "forty";
        };
    }
}