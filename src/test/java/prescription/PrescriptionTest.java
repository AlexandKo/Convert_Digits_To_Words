package prescription;

import org.junit.jupiter.api.Test;
import prescription.digits.Languages;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PrescriptionTest {
    private final Prescription prescription = new Prescription();

    @Test
    public void getCurrency_EN() {
        String currency = prescription.getCurrency(Languages.ENG);

        assertEquals("euro", currency);
    }

    @Test
    public void getCurrency_LV() {
        String currency = prescription.getCurrency(Languages.LAT);

        assertEquals("eiro", currency);
    }

    @Test
    public void getCoin_EN() {
        String currency = prescription.getCurrencyCoin(Languages.ENG);

        assertEquals("cents", currency);
    }

    @Test
    public void getCoin_LV() {
        String currency = prescription.getCurrencyCoin(Languages.LAT);

        assertEquals("centi", currency);
    }
}