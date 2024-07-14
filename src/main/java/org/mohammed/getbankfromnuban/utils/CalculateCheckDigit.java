package org.mohammed.getbankfromnuban.utils;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.lang.reflect.Array;
import java.util.Arrays;

@Component
@Slf4j
public class CalculateCheckDigit {

    public static boolean calculateCheckDigit(char[] bankCode, char[] accountNumber ) {
        String[] bankCodeStrings = new String[bankCode.length];
        for (int i = 0; i < bankCode.length; i++) {
            bankCodeStrings[i] = String.valueOf(bankCode[i]);
        }

        String[] accountNumberStrings = new String[accountNumber.length];
        for (int i = 0; i < accountNumber.length; i++) {
            accountNumberStrings[i] = String.valueOf(accountNumber[i]);
        }
      int[] bankCodeToIntegers = Arrays.stream(bankCodeStrings).mapToInt(Integer::parseInt).toArray();
      int[] bankAccountToIntegers = Arrays.stream(accountNumberStrings).mapToInt(Integer::parseInt).toArray();

      int[] multiplyingFactors = {3, 7, 3, 3, 7, 3, 3, 7, 3};

      int totalBankCode = 0;
      int totalAccountNumbers = 0;

      for ( int i = 0; i < 6; i++){
          totalBankCode += bankCodeToIntegers[i] * multiplyingFactors[i];
      }

        for ( int i = 0; i < 9; i++){
            totalAccountNumbers += bankAccountToIntegers[i] * multiplyingFactors[i];
        }

        log.info("total {}",totalBankCode + totalAccountNumbers);
        GetDigits getDigits = new GetDigits();
        int checkDigit = getDigits.getDigit(totalBankCode + totalAccountNumbers);
        log.info("checkDigit {}",checkDigit);

        if (checkDigit == bankAccountToIntegers[9]) {
            return true;
        }
        else {
            return false;
        }

    }
}
