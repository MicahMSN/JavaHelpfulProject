package patterns.currency;

import java.util.Currency;
import java.util.Locale;

public class CurrencyExample {

    public static void main(String[] args) {
        Currency currency = Currency.getInstance(Locale.FRANCE);
        System.out.println("Symbol: " + currency.getSymbol());
        System.out.println("Code: " + currency.getCurrencyCode());
        System.out.println("Numeric code: " + currency.getNumericCode());
        System.out.println("Default fraction digits: " + currency.getDefaultFractionDigits());
    }
}
