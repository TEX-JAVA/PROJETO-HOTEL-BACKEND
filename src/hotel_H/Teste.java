package hotel_H;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Teste {
	public static DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");

	public static void main(String[] args) {

		Hotel daviJhonson = new Hotel("Davi Jhonson", "Rua Guilherme Barata Ribeiro - 123", "9999(gold)",
				"21.900.858/0001-85");

		Hospede bruno = new Hospede("Bruno", "123.123.123-88", LocalDate.of(1988, 02, 01), "bruno@gmail.com",
				"rua biscoito", "(22)2255-1274");

		
		System.out.println(daviJhonson);
		System.out.println(bruno);
		

	}
}