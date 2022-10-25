package javapartialyopenbook2;
import java.util.Scanner;
public class wordguess {
	public static void main(String[] args) {
		final String SECRET_WORD = args[0];
		final int SECRET_WORD_LEN = SECRET_WORD.length();
		boolean[] correctCharGuessed = new boolean[SECRET_WORD_LEN];

		Scanner in = new Scanner(System.in);
		int attempts = 1;
		String guess = "";
		boolean isCorrectGuess = false;

		do {
			System.out.println("Key in one character or your guess word: ");
			guess = in.next();
			
			if (guess.length() == 1) {
				System.out.print("Trial " + attempts + ": ");
				for (int ch = 0; ch < SECRET_WORD_LEN; ch++) {
					if (SECRET_WORD.charAt(ch) == guess.charAt(0)) {
						correctCharGuessed[ch] = true;
					}
				}

				for (int ch = 0; ch < SECRET_WORD_LEN; ch++) {
					if (correctCharGuessed[ch]) {
						System.out.print(SECRET_WORD.charAt(ch));
					} else {
						System.out.print("_");
					}
				}
			} else if (guess.equals(SECRET_WORD)) {
				break;
			}

			attempts++;
			System.out.println();
		} while (true);

		System.out.println("Congratulations!!");
		System.out.println("You got it in " + attempts + " trials");

	}

}
