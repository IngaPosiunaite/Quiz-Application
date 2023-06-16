package quizapplication;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class InputReader {

	private Scanner scanner;

	public InputReader() {

		scanner = new Scanner(System.in);
	}

	public InputReader(String file) {

		try {
			scanner = new Scanner(new File(file));
		} catch (FileNotFoundException e) {
			System.err.println("The file " + file + " does not exist in the folder.");
			System.exit(1);
		}

	}

	public Scanner getScanner() {
		return scanner;
	}

	public int getNumber(String prompt) {
		System.out.println(prompt);
		int number = scanner.nextInt();
		scanner.nextLine();
		return number;
	}

	public String getText(String prompt) {
		System.out.println(prompt);
		String input = scanner.nextLine();
		return input;
	}

}
