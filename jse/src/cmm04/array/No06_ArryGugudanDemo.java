package cmm04.array;

import java.util.Scanner;

public class No06_ArryGugudanDemo {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int gugu = 0;

		System.out.println(" 최종 단수 입력  : ");
		gugu = scanner.nextInt();

		for (int i = 2; i < gugu + 1; i++) {

			for (int j = 1; j < 10; j++) {

				System.out.println(i + "*" + j + "=" + i * j);
			}
			System.out.println();

		}

	}
}
