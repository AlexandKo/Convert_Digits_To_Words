package prescription.util;

import prescription.digits.*;

public class Startup {
    private final DigitsControl digitsControl;

    public Startup(DigitsControl digitsControl) {
        this.digitsControl = digitsControl;
    }

    public void addDigits() {
        DigitZero digitZero = new DigitZero();
        DigitOne digitOne = new DigitOne();
        DigitTwo digitTwo = new DigitTwo();
        DigitThree digitThree = new DigitThree();
        DigitFour digitFour = new DigitFour();
        DigitFive digitFive = new DigitFive();
        DigitSix digitSix = new DigitSix();
        DigitSeven digitSeven = new DigitSeven();
        DigitEight digitEight = new DigitEight();
        DigitNine digitNine = new DigitNine();
        DigitTwenty digitTwenty = new DigitTwenty();
        DigitThirty digitThirty = new DigitThirty();
        DigitForty digitForty = new DigitForty();
        DigitFifty digitFifty = new DigitFifty();
        DigitSixty digitSixty = new DigitSixty();
        DigitSeventy digitSeventy = new DigitSeventy();
        DigitEighty digitEighty = new DigitEighty();
        DigitNinety digitNinety = new DigitNinety();

        digitsControl.setDigit(digitZero);
        digitsControl.setDigit(digitOne);
        digitsControl.setDigit(digitTwo);
        digitsControl.setDigit(digitThree);
        digitsControl.setDigit(digitFour);
        digitsControl.setDigit(digitFive);
        digitsControl.setDigit(digitSix);
        digitsControl.setDigit(digitSeven);
        digitsControl.setDigit(digitEight);
        digitsControl.setDigit(digitNine);
        digitsControl.setDigit(digitTwenty);
        digitsControl.setDigit(digitThirty);
        digitsControl.setDigit(digitForty);
        digitsControl.setDigit(digitFifty);
        digitsControl.setDigit(digitSixty);
        digitsControl.setDigit(digitSeventy);
        digitsControl.setDigit(digitEighty);
        digitsControl.setDigit(digitNinety);
    }
}