package org.mohammed.getbankfromnuban.model;

public class BankImpl implements Bank{
    private final String bankCode;
    private final String bankName;

    public BankImpl(String bankCode, String bankName) {
        this.bankCode = bankCode;
        this.bankName = bankName;
    }

    @Override
    public String getBankCode() {
        return bankCode;
    }

    @Override
    public String getBankName() {
        return bankName;
    }
}
