package org.mohammed.getbankfromnuban.utils;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;

@Configuration
public class BankCode {

    @Bean
    public Map<String, String> bankCodesToName() {
        Map<String, String> bankCodeToName = new HashMap<>();
        bankCodeToName.put("000011", "First Bank of Nigeria");
        bankCodeToName.put("000014", "Mainstreet Bank");
        bankCodeToName.put("000023", "Citibank");
        bankCodeToName.put("000030", "Heritage Bank");
        bankCodeToName.put("000032", "Union Bank Of Nigeria");
        bankCodeToName.put("000033", "United Bank For Africa");
        bankCodeToName.put("000035", "Wema Bank");
        bankCodeToName.put("000040", "Equitorial Trust Bank");
        bankCodeToName.put("000044", "Access Bank");
        bankCodeToName.put("000050", "Ecobank Nigeria");
        bankCodeToName.put("000056", "Oceanic Bank");
        bankCodeToName.put("000057", "Zenith Bank");
        bankCodeToName.put("000058", "Guaranty Trust Bank");
        bankCodeToName.put("000063", "Diamond Bank");
        bankCodeToName.put("000068", "Standard Chartered Bank");
        bankCodeToName.put("000070", "Fidelity Bank");
        bankCodeToName.put("000076", "Polaris Bank");
        bankCodeToName.put("000082", "Keystone Bank");
        bankCodeToName.put("000084", "Enterprise Bank");
        bankCodeToName.put("000085", "First Inland Bank");
        bankCodeToName.put("000100", "Suntrust");
        bankCodeToName.put("000101", "Providus Bank");
        bankCodeToName.put("000214", "First City Monument Bank");
        bankCodeToName.put("000215", "Unity Bank");
        bankCodeToName.put("000221", "Stanbic IBTC Bank");
        bankCodeToName.put("000232", "Sterling Bank");
        bankCodeToName.put("950547", "Moniepoint MF Bank,Opay MF Bank ");
//        bankCodeToName.put("950547", "Opay MF Bank");
        return bankCodeToName;
    }

}
