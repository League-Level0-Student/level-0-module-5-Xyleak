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

		// 2
		
		System.out.println("2 Nested-----------");
	for(int i=0; i<3; i++) {
	   for(int j=0; j<3;j++) {
		   System.out.print(3*i+j+1+" ");
		  
	   }
	   System.out.println("");
	  }
	// Nested For-Loops 3
    int N=10;
	System.out.println("3 Nested------------");
	for(int i=0; i<N; i++) {
	for(int j=0; j<N; j++) {
         System.out.print(N*i+j+1+" ");	
	}
	System.out.println("");
	
	}
	// Nested For-Loops 4
	System.out.println("4 Nested-----------");
		
	for(int a=0; a<=5; a++) {
		for(int b=0; b<=a; b++) {
		   System.out.print("* ");
		}
	    System.out.println("");
	}
	System.out.println("Bonus");
	for(int i = 0; i <=100; i++){
		System.out.println(100-i);
	}
	System.out.println("Same");
	for(int i = 100; i >=0; i--){
		System.out.println(i);
	}
}
}
