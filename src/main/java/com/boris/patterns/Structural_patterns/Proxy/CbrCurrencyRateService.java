package com.boris.patterns.Structural_patterns.Proxy;

import java.util.Currency;

public class CbrCurrencyRateService implements CurrencyRateService {
    @Override
    public Money getCurrencyRate(Currency currency) {
    //... особенности реализации опущены
    // http://cbr.ru/scripts/Root.asp?PrtId=SXML
        return null;
    }
}
