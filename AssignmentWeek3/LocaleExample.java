package week3;

import java.util.Locale;
public class LocaleExample {
	public static void main(String[] args) {
		Locale aLocale = new Locale.Builder().setLanguage("fr").setRegion("CA").build();
		Locale bLocale = Locale.forLanguageTag("ja-JP-u-ca-japanese");
		Locale cLocale = new Locale("en", "GB");
		Locale dLocale = new Locale("ru");
		Locale eLocale = Locale.JAPAN;
		
		System.out.println(aLocale);
		System.out.println(aLocale.getDisplayName());
		System.out.println(aLocale.getLanguage());
		System.out.println(aLocale.getCountry());
		System.out.println(bLocale);
		System.out.println(cLocale);
		System.out.println(dLocale);
		System.out.println(eLocale);

	}
}
