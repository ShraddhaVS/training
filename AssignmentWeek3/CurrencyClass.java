package week3;

import java.util.Currency;
import java.util.Locale;

public class CurrencyClass {
	public static void main(String[] args) {

		Locale eLocale = Locale.JAPAN;
		Currency c = Currency.getInstance("INR");

		System.out.println(Currency.getAvailableCurrencies());
		System.out.println(c.getCurrencyCode());
		System.out.println(c.getDefaultFractionDigits());
		System.out.println(c.getDisplayName());
		System.out.println(c.getNumericCode());
		System.out.println(c.getSymbol());
		
	}
}