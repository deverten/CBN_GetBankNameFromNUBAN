package org.mohammed.getbankfromnuban.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.mohammed.getbankfromnuban.model.Bank;
import org.mohammed.getbankfromnuban.model.BankImpl;
import org.mohammed.getbankfromnuban.utils.BankCode;
import org.mohammed.getbankfromnuban.utils.CalculateCheckDigit;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
@RequiredArgsConstructor
@Slf4j
public class GetBank {
    private final BankCode bankCode;
    private final CalculateCheckDigit calculateCheckDigit;

    public List<Bank> getBank(String accountNumber) {
        log.info("account number {}", accountNumber);

        List<Bank> listOfPossibleBanks = new ArrayList<>();
        char[] accountNumberToArray = accountNumber.toCharArray();

        for (String bank: bankCode.bankCodesToName().keySet()) {
            char[] bankCodeToArray = bank.toCharArray();
            boolean checkDigitMatchComparison = calculateCheckDigit.calculateCheckDigit(bankCodeToArray, accountNumberToArray);
            log.info("boolean result {}",checkDigitMatchComparison );
            if (checkDigitMatchComparison) {
                log.info("matched {}", bank);

                listOfPossibleBanks.add(new BankImpl(bank, bankCode.bankCodesToName().get(bank)));
            }
        }
        log.info("list of possible banks {}",listOfPossibleBanks);
        return listOfPossibleBanks;
    }

}
