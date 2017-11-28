package com.lmig.gfc.romanNumerals.services;

public class HinduToRomanNumeralConverter {

	public String convert(int numberToConvert) {

		String returnString = "";

		for (int i = 0; i < numberToConvert / 1000; i = i++) {

			returnString = returnString + "M";
			numberToConvert = numberToConvert - 1000;
		}

		if (numberToConvert > 899) {
			returnString = returnString + "CM";

			numberToConvert = numberToConvert - 900;

		} else {

			for (int i = 0; i < numberToConvert / 500; i = i++) {

				returnString = returnString + "D";
				numberToConvert = numberToConvert - 500;
			}
		}

		if (numberToConvert > 399) {
			returnString = returnString + "CD";

			numberToConvert = numberToConvert - 400;

		} else {

			for (int i = 0; i < numberToConvert / 100; i = i++) {

				returnString = returnString + "C";
				numberToConvert = numberToConvert - 100;
			}
		}

		if (numberToConvert > 89) {
			returnString = returnString + "XC";

			numberToConvert = numberToConvert - 90;

		} else {

			for (int i = 0; i < numberToConvert / 50; i = i++) {

				returnString = returnString + "L";
				numberToConvert = numberToConvert - 50;
			}
		}

		if (numberToConvert > 39) {
			returnString = returnString + "XL";

			numberToConvert = numberToConvert - 40;

		} else {

			for (int i = 0; i < numberToConvert / 10; i = i++) {

				returnString = returnString + "X";
				numberToConvert = numberToConvert - 10;
			}
		}

		if (numberToConvert == 9) {

			returnString = returnString + "IX";

			return returnString;

		}

		for (int i = 0; i < numberToConvert / 5; i = i++) {
			returnString = returnString + "V";
			numberToConvert = numberToConvert - 5;
		}

		if (numberToConvert == 4) {

			returnString = returnString + "IV";

			return returnString;

		}

		for (int i = 0; i < numberToConvert; i = i + 1) {
			returnString = returnString + "I";
		}

		return returnString;
	}

}
