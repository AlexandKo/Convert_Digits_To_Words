package prescription.util;

import org.junit.jupiter.api.Test;

import java.util.Properties;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PropertiesCreatorTest {
    @Test
    public void getCurrencyProperties() {
        PropertiesCreator currency = new PropertiesCreator("currency.properties");
        Properties currencyProperties = currency.getPropertiesSet();

        String propertiesResultLv = currencyProperties.getProperty("currency_LV");
        assertEquals("eiro", propertiesResultLv);

        String propertiesResultEn = currencyProperties.getProperty("currency_EN");
        assertEquals("euro", propertiesResultEn);

        String propertiesResultCentiLv = currencyProperties.getProperty("cents_LV");
        assertEquals("centi", propertiesResultCentiLv);

        String propertiesResultCentiEn = currencyProperties.getProperty("cents_EN");
        assertEquals("cents", propertiesResultCentiEn);
    }

    @Test
    public void getDigitZeroProperties() {
        PropertiesCreator getDigitProperties = new PropertiesCreator("digit.properties");
        Properties digitZero = getDigitProperties.getPropertiesSet();

        String propertiesResultLv = digitZero.getProperty("zero_LV");
        assertEquals("nulle", propertiesResultLv);

        String propertiesResultEn = digitZero.getProperty("zero_EN");
        assertEquals("zero", propertiesResultEn);
    }
}