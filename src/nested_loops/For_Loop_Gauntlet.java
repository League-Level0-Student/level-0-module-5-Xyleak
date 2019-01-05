package nested_loops;

public class For_Loop_Gauntlet {

	public static void main(String[] args) {
		System.out.println("1---------------------------------");
		for (int i = 0; i < 101; i++) {
			System.out.println(i);

		}
		System.out.println("2---------------------------------");
		for (int e = 100; e >= 0; e--) {
			System.out.println(e);

		}
		System.out.println("3---------------------------------");
		for (int o = 2; o < 101; o += 2) {

			System.out.println(o);
		}

		System.out.println("4---------------------------------");
		for (int u = 1; u < 100; u += 2) {
			System.out.println(u);

		}
		System.out.println("5---------------------------------");
		for (int x = 1; x < 501; x++) {
			// System.out.println(x);

			if (x % 2 == 0) {
				System.out.println(x + " Is Even");
			} else {
				System.out.println(x + " Is Odd");
			}
		}
		System.out.println("6---------------------------------");
		for (int a = 0; a < 777; a += 7) {
			System.out.println(a);
		}

		// Nested For-Loops_________________________________________________________

		// Nested For-Loops 1

		// 1
		System.out.println("1 Nested----------");
		for (int b = 0; b <= 2; b++) {

			for (int c = 0; c <= 2; c++) {

				System.out.println(b + " " + c);

			}
		}

		// Nested For-Loops 2

		// 1
		System.out.println("2 Nested-----------");
		for (int i = 1; i < 4; i++) {
			System.out.print(i + " ");

			if (i % 3 == 0) {
				System.out.println();
				for (int j = 1; j <= 9; j += 3) {

					System.out.print(j + " ");

					for (int j2 = 1; j2 <= j + 10; j2++) {
						System.out.println(j + " ");

					}
					System.out.println();
				}

			}
		}

		// Nested For-Loops 3

		for (int i = 1; i < 11; i++) {
			System.out.print(i + " ");

		}

	}
}