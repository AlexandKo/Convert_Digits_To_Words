package prescription.util;

import prescription.digits.DigitPrescription;
import prescription.digits.Marker;

import java.lang.annotation.Annotation;
import java.util.HashMap;
import java.util.Set;

public class DigitsControl {
    private final HashMap<Annotation, DigitPrescription> digits = new HashMap<>();

    public void setDigit(DigitPrescription digit) {
        Annotation[] annotations = digit.getClass().getAnnotations();
        digits.put(annotations[0], digit);
    }

    public DigitPrescription findDigitInstance(int digit) {

        Set<Annotation> annotations = digits.keySet();

        return annotations.stream()
                .map(annotation -> (Marker) annotation)
                .filter(annotation -> annotation.value() == digit)
                .findFirst()
                .map(digits::get)
                .orElse(null);
    }
}