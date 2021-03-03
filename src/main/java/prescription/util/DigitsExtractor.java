package prescription.util;

public class DigitsExtractor {
    public String getDigit(String inputDigits, int digitPosition) {
        if (inputDigits.length() == 0) {
            return "0";
        }
        return inputDigits.substring(digitPosition, digitPosition + 1);
    }

    public String getDigit(String inputDigits, int digitPositionStart, int digitPositionFinish) {
        if (inputDigits.length() == 0) {
            return "";
        }
        return inputDigits.substring(digitPositionStart, digitPositionFinish);
    }
}