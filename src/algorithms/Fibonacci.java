package algorithms;

public class Fibonacci {

public static void main(String[] args) {
	
	int A=0;
	int B=1;
	int C;
	
	
	for (int i = 0; i < 11; i++) {
		C=A+B;
        A=B;
        B=C;
		System.out.println(C);
	}
}	
}
