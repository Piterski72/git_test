package ru.nivanov.start;
import java.util.*;
/**
 * ConsoleInput class.
 * @author nivanov.
 * @since
 * @version
 */
public class ConsoleInput implements Input {
	private Scanner scanner = new Scanner(System.in);
	/**
	 * Wait for user input.
	 * @param question ..
	 *
	 * @return user choice
	 */
	public String ask(String question) {
		System.out.print(question);
		return scanner.nextLine();
	}
	/**
	 * ask method override.
	 * @param question ..
	 * @param range ..
	 * @return value ..
	 */
	public int ask(String question, int[] range) {
		int key = Integer.valueOf(this.ask(question));
		boolean exist = false;
		for (int value : range) {
			if (value == key) {
				exist = true;
				break;
			}
		}
		if (exist) {
			return key;
		} else {
			throw new MenuOutException("Out of menu range");
		}
	}
}