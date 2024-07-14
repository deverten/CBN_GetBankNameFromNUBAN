package org.mohammed.getbankfromnuban.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.mohammed.getbankfromnuban.model.AccountNumberRequest;
import org.mohammed.getbankfromnuban.model.Bank;
import org.mohammed.getbankfromnuban.service.GetBank;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/v1")
@Slf4j
public class NubanController {
private final GetBank getBank;
    @PostMapping(value = "/getBankName")
    public List<Bank> nubanNumber(@RequestBody AccountNumberRequest accountNumber) {
        return getBank.getBank(accountNumber.getAccountNumber());
    }
}
