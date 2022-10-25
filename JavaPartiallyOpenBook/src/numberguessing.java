package javapartialyopenbook2;
import java.util.Scanner;
public class numberguessing {

	public static void main(String[] args) {
		final int SECRET_NUMBER = (int)(Math.random() * 100);
		Scanner in = new Scanner(System.in);

		int guess;
		int n = 1;

		System.out.println("Key in your guess: ");
		guess = in.nextInt();

		while (guess != SECRET_NUMBER) {
			if (guess < SECRET_NUMBER) {
				System.out.println("Try Higher");
			} else {
				System.out.println("Try Lower");
			}

			n++;
			guess = in.nextInt();
		}

		System.out.println("You got it in " + n + " trials!");

	}

}
