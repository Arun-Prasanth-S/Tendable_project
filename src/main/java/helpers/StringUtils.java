package helpers;

public class StringUtils {
	public static String replaceAllStringForValue(String value, String strToReplace, String symbol) {
		return value.replaceAll(strToReplace, symbol);
	}

	public static String getStringToUpperCase(String value) {
		return value.toUpperCase();
	}

	public static String getStringToLowerCase(String value) {
		return value.toLowerCase();
	}
}
