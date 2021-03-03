package prescription.digits;

@Marker(value = 30)
public class DigitThirty implements DigitPrescription {

    @Override
    public String digitPrescriptionFinder(Languages setLanguage) {

        return switch (setLanguage) {
            case LAT -> "tr"+'\u012b'+"sdesmit";
            case ENG -> "thirty";
        };
    }
}