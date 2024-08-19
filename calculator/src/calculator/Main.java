package calculator;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Ответ: " + calc(scan.nextLine()));
	}
	public static String calc(String input) {
		
		String result = null;
		int var1, var2;
		char ch = '.', ch1 = ',';
		
		if (input.contains(String.valueOf(ch)) | input.contains(String.valueOf(ch1))) {
			System.out.println("Ошибка: В строке содержатся нецелые числа");
			System.exit(0);
		}
		String[] array = input.split(" ");
		for (int i = 0; i < array.length; i++) {
			
		}
		if (array.length > 3) {
			System.out.println("Ошибка: Формат математической операции не удовлетворяет заданию");
			System.exit(0);
		}
		var1 = Integer.parseInt(array[0]);
		var2 = Integer.parseInt(array[2]);
		
		if (var1 < 1 | var1 > 10 |  var2 < 1 | var2 > 10 ) {
			System.out.println("Ошибка: Числовые значения выходят из заданного диапазона");
			System.exit(0);
		}
		if (array[1].equals("+")) {
			result = "" + (var1 + var2);
		}
		else if (array[1].equals("-")) {
			result = "" + (var1 - var2);
		}
		else if (array[1].equals("/")) {
			result = "" + (var1 / var2);
		}
		else if (array[1].equals("*")) {
			result = "" + (var1 * var2);
		}
		return result;
	}
}
