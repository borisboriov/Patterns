package com.boris.patterns.Structural_patterns.Proxy;

import java.util.Currency;
import java.util.Locale;

public class ProxyApp {

    public static void main(String[] args) {

        // создаем сервис
        CurrencyRateService currencyRateService = new ProxyCurrencyRateService();
        // получаем курс из кэша или от цб – это уже решает прокси
        Money rate = currencyRateService.getCurrencyRate(Currency.getInstance(Locale.US));

    }
}
