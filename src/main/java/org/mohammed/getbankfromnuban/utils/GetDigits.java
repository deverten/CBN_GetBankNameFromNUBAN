package org.mohammed.getbankfromnuban.utils;

public class GetDigits {

    public int getDigit (int totalNumber) {

        int modulo = totalNumber % 10;
        int checkDigit;

        if (modulo == 0) {
            checkDigit = 0;
        }
        else {
            checkDigit = 10 - modulo;
        }
        return checkDigit;
    }

}
